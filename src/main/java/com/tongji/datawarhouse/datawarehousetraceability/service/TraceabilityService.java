package
        com.tongji.datawarhouse.datawarehousetraceability.service;

import com.tongji.datawarhouse.datawarehousetraceability.dto.*;
import com.tongji.datawarhouse.datawarehousetraceability.model.*;
import com.tongji.datawarhouse.datawarehousetraceability.repository.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * class description
 *
 * @author : loey
 * @className : TraceabilityService
 * @since : 2021-12-11 01:23
 **/
@Service
public class TraceabilityService {

    @Resource
    private TFatherAsinRepository fatherAsinRepository;

    @Resource
    private TCleaningMovieRepository cleaningMovieRepository;

    @Resource
    private TCommentRepository commentRepository;

    @Resource
    private VMissingMovieTvRepository missingMovieTvRepository;

    @Resource
    private TMovieWithoutRemovingTvAsinRepository movieTvRepository;

    @Resource
    private TConsolidationMovieRepository consolidationMovieRepository;

    @Resource
    private TVAsinRepository tvAsinRepository;


    /**
     * get all the movie version for the movie asin.
     *
     * @param asin
     * @return : com.tongji.datawarhouse.datawarehousetraceability.dto.MovieVersionDto
     * @author : leoy
     * @since : 2021/12/11 1:25
     **/
    public MovieVersionDto getMovieVersion(String asin) {
        MovieVersionDto movieVersionDto = new MovieVersionDto();
        TConsolidationMovieEntity consolidationMovie = consolidationMovieRepository.findByAsin(asin);
        if (consolidationMovie != null) {
            movieVersionDto.setVersionCount(consolidationMovie.getAsinCount());
            //寻找father_asin为这个asin的所有信息
            List<TFatherAsinEntity> sonAsinList = fatherAsinRepository.findAllByFatherAsin(asin);

            if (sonAsinList != null) {
                List<String> sonAsins = new ArrayList<>();
                for (TFatherAsinEntity son : sonAsinList) {
                    sonAsins.add(son.getAsin());
                }
                sonAsins.add(asin);
                List<TCleaningMovieEntity> cleaningMovieList = new ArrayList<>();
                for (String sonAsin : sonAsins) {
                    TCleaningMovieEntity cleaningMovie = cleaningMovieRepository.findByAsin(sonAsin);
                    if (cleaningMovie != null) {
                        cleaningMovieList.add(cleaningMovie);
                    }
                }
                long commentCount = commentRepository.countAllByAsinIn(sonAsins);
                movieVersionDto.setMovieList(cleaningMovieList);
                movieVersionDto.setCommentCount(commentCount);
            }
        }
        return movieVersionDto;
    }

    public CommentDataDto getCommentListByPage(int currentPage, int pageSize) {

        Pageable pageable = PageRequest.of(currentPage, pageSize);
        Page<TCommentEntity> commentEntityPage = commentRepository.findAll(pageable);
        int totalPage = commentEntityPage.getTotalPages();
        long totalCount = commentEntityPage.getTotalElements();
        List<TCommentEntity> commentEntityList = commentEntityPage.toList();
        CommentDataDto commentDataDto = new CommentDataDto();
        commentDataDto.setCommentList(commentEntityList);
        commentDataDto.setTotalPage(totalPage);
        commentDataDto.setTotalCount(totalCount);
        return commentDataDto;
    }

    public MissingMovieDto getMissingMovieAsinList(int currentPage, int pageSize) {
        Pageable pageable = PageRequest.of(currentPage, pageSize);
        Page<VMissingMovieTvEntity> missingMovieTvAsin = missingMovieTvRepository.findAll(pageable);
        int totalPage = missingMovieTvAsin.getTotalPages();
        long totalCount = missingMovieTvAsin.getTotalElements();
        List<VMissingMovieTvEntity> missingMovieTvList = missingMovieTvAsin.toList();
        MissingMovieDto missingMovieDto = new MissingMovieDto();
        missingMovieDto.setMissingMovieAsin(missingMovieTvList);
        missingMovieDto.setTotalCount(totalCount);
        missingMovieDto.setTotalPage(totalPage);
        return missingMovieDto;
    }

    public MovieTvAsinDto getMovieTvAsinList(int currentPage, int pageSize) {
        Pageable pageable = PageRequest.of(currentPage, pageSize);
        Page<TMovieWithoutRemovingTvAsinEntity> movieTvAsin = movieTvRepository.findAll(pageable);
        int totalPage = movieTvAsin.getTotalPages();
        long totalCount = movieTvAsin.getTotalElements();
        List<TMovieWithoutRemovingTvAsinEntity> movieTvAsinList = movieTvAsin.toList();
        MovieTvAsinDto movieTvAsinDto = new MovieTvAsinDto();
        movieTvAsinDto.setAsinList(movieTvAsinList);
        movieTvAsinDto.setTotalCount(totalCount);
        movieTvAsinDto.setTotalPage(totalPage);
        return movieTvAsinDto;
    }

    public MovieDto getMovieList(int currentPage, int pageSize) {
        Pageable pageable = PageRequest.of(currentPage, pageSize);
        Page<TCleaningMovieEntity> movie = cleaningMovieRepository.findAll(pageable);
        int totalPage = movie.getTotalPages();
        long totalCount = movie.getTotalElements();
        List<TCleaningMovieEntity> movieList = movie.toList();
        MovieDto movieDto = new MovieDto();
        movieDto.setMovieList(movieList);
        movieDto.setTotalCount(totalCount);
        movieDto.setTotalPage(totalPage);
        return movieDto;
    }

    public ConsolidationMovieDto getConsolidationMovieList(int currentPage, int pageSize, boolean conflict) {
        Pageable pageable = PageRequest.of(currentPage, pageSize);
        Page<TConsolidationMovieEntity> consolidationMovie;
        if (conflict) {
            consolidationMovie = consolidationMovieRepository.findAllByAsinCountGreaterThan(1, pageable);
        } else {
            consolidationMovie = consolidationMovieRepository.findAllByAsinCountEquals(1, pageable);
        }
        int totalPage = consolidationMovie.getTotalPages();
        long totalCount = consolidationMovie.getTotalElements();
        List<TConsolidationMovieEntity> consolidationMovieList = consolidationMovie.toList();
        ConsolidationMovieDto consolidationMovieDto = new ConsolidationMovieDto();
        consolidationMovieDto.setConsolidationMovieList(consolidationMovieList);
        consolidationMovieDto.setTotalCount(totalCount);
        consolidationMovieDto.setTotalPage(totalPage);
        return consolidationMovieDto;
    }

    public TvAsinDto getTvAsinList(int currentPage, int pageSize) {
        Pageable pageable = PageRequest.of(currentPage, pageSize);
        Page<VTvAsinEntity> tvAsin = tvAsinRepository.findAll(pageable);
        int totalPage = tvAsin.getTotalPages();
        long totalCount = tvAsin.getTotalElements();
        List<VTvAsinEntity> tvAsinList = tvAsin.toList();
        TvAsinDto tvAsinDto = new TvAsinDto();
        tvAsinDto.setTvAsinList(tvAsinList);
        tvAsinDto.setTotalCount(totalCount);
        tvAsinDto.setTotalPage(totalPage);
        return tvAsinDto;
    }

    public TotalCountDto getTotalCount() {
        TotalCountDto totalCountDto = new TotalCountDto();
        totalCountDto.setCommentCount(commentRepository.count());
        totalCountDto.setMovieTvAsinCount(movieTvRepository.count());
        totalCountDto.setMissingAsinCount(missingMovieTvRepository.count());
        totalCountDto.setMovieCount(cleaningMovieRepository.count());
        totalCountDto.setTvAsinCount(tvAsinRepository.count());
        totalCountDto.setNoConflictConsolidationMovieCount(consolidationMovieRepository.countAllByAsinCountEquals(1));
        totalCountDto.setConflictConsolidationMovieCount(consolidationMovieRepository.countAllByAsinCountGreaterThan(1));
        return totalCountDto;
    }

    public ConsolidationMovieDto searchForTitle(String title, int currentPage, int pageSize) {
        String curTitle = "%" + title + "%";
        Pageable pageable = PageRequest.of(currentPage, pageSize);
        Page<TConsolidationMovieEntity> consolidationMovies = consolidationMovieRepository.findAllByMovieTitleLike(curTitle, pageable);
        ConsolidationMovieDto consolidationMovieDto = new ConsolidationMovieDto();
        consolidationMovieDto.setTotalPage(0);
        consolidationMovieDto.setTotalCount(0);
        if (consolidationMovies != null) {
            consolidationMovieDto.setTotalPage(consolidationMovies.getTotalPages());
            consolidationMovieDto.setTotalCount(consolidationMovies.getTotalElements());
            consolidationMovieDto.setConsolidationMovieList(consolidationMovies.toList());
        }
        return consolidationMovieDto;
    }
}
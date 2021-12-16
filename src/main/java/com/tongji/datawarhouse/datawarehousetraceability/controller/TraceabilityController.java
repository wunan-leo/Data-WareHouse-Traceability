package
        com.tongji.datawarhouse.datawarehousetraceability.controller;

import com.tongji.datawarhouse.datawarehousetraceability.dto.*;
import com.tongji.datawarhouse.datawarehousetraceability.model.TConsolidationMovieEntity;
import com.tongji.datawarhouse.datawarehousetraceability.service.TraceabilityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * class description
 *
 * @author : loey
 * @className : TraceabilityController
 * @since : 2021-12-11 01:03
 **/
@RestController
@RequestMapping("traceability")
public class TraceabilityController {

    @Resource
    private TraceabilityService traceabilityService;

    @RequestMapping("conflictInfo")
    public ResponseEntity<MovieVersionDto> getMovieVersion(@RequestParam String asin) {
        return new ResponseEntity<>(traceabilityService.getMovieVersion(asin), HttpStatus.OK);
    }

    @RequestMapping("comment")
    public ResponseEntity<CommentDataDto> getCommentDataList(@RequestParam int currentPage,
                                                             @RequestParam int pageSize) {
        return new ResponseEntity<>(traceabilityService.getCommentListByPage(currentPage, pageSize), HttpStatus.OK);
    }

    @RequestMapping("missingAsin")
    public ResponseEntity<MissingMovieDto> getMissingMovieAsinList(@RequestParam int currentPage,
                                                                   @RequestParam int pageSize) {
        return new ResponseEntity<>(traceabilityService.getMissingMovieAsinList(currentPage, pageSize), HttpStatus.OK);
    }

    @RequestMapping("movieTvAsin")
    public ResponseEntity<MovieTvAsinDto> getMovieTvAsinList(@RequestParam int currentPage,
                                                             @RequestParam int pageSize) {
        return new ResponseEntity<>(traceabilityService.getMovieTvAsinList(currentPage, pageSize), HttpStatus.OK);
    }

    @RequestMapping("movie")
    public ResponseEntity<MovieDto> getMovieList(@RequestParam int currentPage,
                                                 @RequestParam int pageSize) {
        return new ResponseEntity<>(traceabilityService.getMovieList(currentPage, pageSize), HttpStatus.OK);
    }

    @RequestMapping("consolidationMovie/conflict")
    public ResponseEntity<ConsolidationMovieDto> getConflictConsolidationMovieList(@RequestParam int currentPage,
                                                                                   @RequestParam int pageSize) {
        return new ResponseEntity<>(traceabilityService.getConsolidationMovieList(currentPage, pageSize, true), HttpStatus.OK);
    }

    @RequestMapping("consolidationMovie/no-conflict")
    public ResponseEntity<ConsolidationMovieDto> getConsolidationMovieList(@RequestParam int currentPage,
                                                                           @RequestParam int pageSize) {
        return new ResponseEntity<>(traceabilityService.getConsolidationMovieList(currentPage, pageSize, false), HttpStatus.OK);
    }

    @RequestMapping("tvAsin")
    public ResponseEntity<TvAsinDto> getTvAsinList(@RequestParam int currentPage,
                                                   @RequestParam int pageSize) {
        return new ResponseEntity<>(traceabilityService.getTvAsinList(currentPage, pageSize), HttpStatus.OK);
    }

    @RequestMapping("totalCount")
    public ResponseEntity<TotalCountDto> getTotalCount() {
        return new ResponseEntity<>(traceabilityService.getTotalCount(), HttpStatus.OK);
    }

    @RequestMapping("searchingMovie")
    public ResponseEntity<ConsolidationMovieDto> searchByTitle(
            @RequestParam String title,
            @RequestParam int currentPage,
            @RequestParam int pageSize
    ) {
        return new ResponseEntity<>(traceabilityService.searchForTitle(title, currentPage, pageSize), HttpStatus.OK);
    }
}
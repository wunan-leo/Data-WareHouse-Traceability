package
        com.tongji.datawarhouse.datawarehousetraceability.dto;

import com.tongji.datawarhouse.datawarehousetraceability.model.TCleaningMovieEntity;
import lombok.Data;

import java.util.List;

/**
 * class description
 *
 * @author : loey
 * @className : MovieDto
 * @since : 2021-12-11 16:51
 **/
@Data
public class MovieDto {
    private int totalPage;
    private long totalCount;
    private List<TCleaningMovieEntity> movieList;
}
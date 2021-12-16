package
        com.tongji.datawarhouse.datawarehousetraceability.dto;

import com.tongji.datawarhouse.datawarehousetraceability.model.TCleaningMovieEntity;
import lombok.Data;

import java.util.List;

/**
 * class description
 *
 * @author : loey
 * @className : MovieVersionDto
 * @since : 2021-12-11 01:16
 **/
@Data
public class MovieVersionDto {
    int versionCount;
    List<TCleaningMovieEntity> movieList;
}
package
        com.tongji.datawarhouse.datawarehousetraceability.dto;

import com.tongji.datawarhouse.datawarehousetraceability.model.VMissingMovieTvEntity;
import lombok.Data;

import java.util.List;

/**
 * class description
 *
 * @author : loey
 * @className : MissingMovieDto
 * @since : 2021-12-11 16:15
 **/
@Data
public class MissingMovieDto {

    int totalPage;
    long totalCount;
    List<VMissingMovieTvEntity> missingMovieAsin;
}
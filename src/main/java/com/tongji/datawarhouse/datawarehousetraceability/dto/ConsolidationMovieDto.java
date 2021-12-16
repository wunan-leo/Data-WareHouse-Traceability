package
        com.tongji.datawarhouse.datawarehousetraceability.dto;

import com.tongji.datawarhouse.datawarehousetraceability.model.TConsolidationMovieEntity;
import lombok.Data;

import java.util.List;

/**
 * class description
 *
 * @author : loey
 * @className : ConsolidationMovieDto
 * @since : 2021-12-11 18:42
 **/
@Data
public class ConsolidationMovieDto {
    private int totalPage;
    private long totalCount;
    private List<TConsolidationMovieEntity> consolidationMovieList;
}
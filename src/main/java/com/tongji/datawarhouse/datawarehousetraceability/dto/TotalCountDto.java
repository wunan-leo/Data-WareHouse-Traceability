package
        com.tongji.datawarhouse.datawarehousetraceability.dto;

import lombok.Data;

/**
 * class description
 *
 * @author : loey
 * @className : totalCountDto
 * @since : 2021-12-11 21:56
 **/
@Data
public class TotalCountDto {
    private long commentCount;
    private long movieTvAsinCount;
    private long missingAsinCount;
    private long movieCount;
    private long conflictConsolidationMovieCount;
    private long noConflictConsolidationMovieCount;
    private long tvAsinCount;
}
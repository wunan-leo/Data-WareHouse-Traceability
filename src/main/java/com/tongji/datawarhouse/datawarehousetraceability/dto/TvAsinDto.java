package
        com.tongji.datawarhouse.datawarehousetraceability.dto;

import com.tongji.datawarhouse.datawarehousetraceability.model.VTvAsinEntity;
import lombok.Data;

import java.util.List;

/**
 * class description
 *
 * @author : loey
 * @className : TvAsinDto
 * @since : 2021-12-11 19:10
 **/
@Data
public class TvAsinDto {
    private int totalPage;
    private long totalCount;
    private List<VTvAsinEntity> tvAsinList;
}
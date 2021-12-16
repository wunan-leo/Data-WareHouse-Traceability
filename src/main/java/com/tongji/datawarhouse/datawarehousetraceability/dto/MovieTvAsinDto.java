package
        com.tongji.datawarhouse.datawarehousetraceability.dto;

import com.tongji.datawarhouse.datawarehousetraceability.model.TMovieWithoutRemovingTvAsinEntity;
import lombok.Data;

import java.util.List;

/**
 * class description
 *
 * @author : loey
 * @className : MovieTvAsinDto
 * @since : 2021-12-11 16:32
 **/
@Data
public class MovieTvAsinDto {
    private int totalPage;
    private long totalCount;
    private List<TMovieWithoutRemovingTvAsinEntity> asinList;
}
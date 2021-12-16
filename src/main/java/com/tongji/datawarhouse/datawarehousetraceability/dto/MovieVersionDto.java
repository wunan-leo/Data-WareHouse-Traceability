package
        com.tongji.datawarhouse.datawarehousetraceability.dto;

import com.tongji.datawarhouse.datawarehousetraceability.model.TCleaningMovieEntity;
import com.tongji.datawarhouse.datawarehousetraceability.model.TCommentEntity;
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
    /**
     * 电影的版本数量
     */
    int versionCount;
    /**
     * 指向这一个电影的不同版本电影
     */
    List<TCleaningMovieEntity> movieList;
    /**
     * 合并的评论数量
     */
    long commentCount;
    /**
     * 评论内容
     */
    List<TCommentEntity> commentList;

}
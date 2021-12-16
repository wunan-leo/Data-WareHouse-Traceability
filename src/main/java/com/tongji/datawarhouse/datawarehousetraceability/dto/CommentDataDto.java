package
        com.tongji.datawarhouse.datawarehousetraceability.dto;

import com.tongji.datawarhouse.datawarehousetraceability.model.TCommentEntity;
import lombok.Data;

import java.util.List;

/**
 * class description
 *
 * @author : loey
 * @className : CommentDataDto
 * @since : 2021-12-11 15:23
 **/
@Data
public class CommentDataDto {

    private long totalCount;
    private int totalPage;
    private List<TCommentEntity> commentList;

}
package ink.wujun.community.mapper;

import ink.wujun.community.model.Comment;
import ink.wujun.community.model.CommentExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}
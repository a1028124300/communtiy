package ink.wujun.community.mapper;

import ink.wujun.community.model.Question;
import ink.wujun.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {

    int incView(Question record);
    int incComment(Question record);
}
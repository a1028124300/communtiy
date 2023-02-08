package ink.wujun.community.mapper;

import ink.wujun.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author WuJun
 * @date 2023/2/8 13:03
 */

@Mapper
public interface UserMapper {

    @Insert("insert user (name,account_id,token,gmt_create,gmt_modified) value (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);


}

package ink.wujun.community.mapper;

import ink.wujun.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author WuJun
 * @date 2023/2/8 13:03
 */

@Mapper
public interface UserMapper {

    @Insert("insert user (name,account_id,token,gmt_create,gmt_modified,avatar_url) value (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Integer id);
}

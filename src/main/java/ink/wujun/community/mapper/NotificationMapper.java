package ink.wujun.community.mapper;

import ink.wujun.community.model.Notification;
import ink.wujun.community.model.NotificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NotificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Thu Mar 02 11:29:37 CST 2023
     */
    long countByExample(NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Thu Mar 02 11:29:37 CST 2023
     */
    int deleteByExample(NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Thu Mar 02 11:29:37 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Thu Mar 02 11:29:37 CST 2023
     */
    int insert(Notification row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Thu Mar 02 11:29:37 CST 2023
     */
    int insertSelective(Notification row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Thu Mar 02 11:29:37 CST 2023
     */
    List<Notification> selectByExampleWithRowbounds(NotificationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Thu Mar 02 11:29:37 CST 2023
     */
    List<Notification> selectByExample(NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Thu Mar 02 11:29:37 CST 2023
     */
    Notification selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Thu Mar 02 11:29:37 CST 2023
     */
    int updateByExampleSelective(@Param("row") Notification row, @Param("example") NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Thu Mar 02 11:29:37 CST 2023
     */
    int updateByExample(@Param("row") Notification row, @Param("example") NotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Thu Mar 02 11:29:37 CST 2023
     */
    int updateByPrimaryKeySelective(Notification row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notification
     *
     * @mbg.generated Thu Mar 02 11:29:37 CST 2023
     */
    int updateByPrimaryKey(Notification row);
}
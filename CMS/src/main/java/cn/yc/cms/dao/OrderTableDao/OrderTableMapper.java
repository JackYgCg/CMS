package cn.yc.cms.dao.OrderTableDao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.yc.cms.pojo.OrderTable;

public interface OrderTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_table
     *
     * @mbg.generated Tue Dec 25 14:55:17 CST 2018
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_table
     *
     * @mbg.generated Tue Dec 25 14:55:17 CST 2018
     */
    int insert(OrderTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_table
     *
     * @mbg.generated Tue Dec 25 14:55:17 CST 2018
     */
    int insertSelective(OrderTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_table
     *
     * @mbg.generated Tue Dec 25 14:55:17 CST 2018
     */
    OrderTable selectByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_table
     *
     * @mbg.generated Tue Dec 25 14:55:17 CST 2018
     */
    int updateByPrimaryKeySelective(OrderTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_table
     *
     * @mbg.generated Tue Dec 25 14:55:17 CST 2018
     */
    int updateByPrimaryKey(OrderTable record);
    
    /**
     * 查询所有订单并分页
     * @param start	起始坐标
     * @param end 按量查询
     * @return 所有订单
     * */
    List<OrderTable> selectAllByLimit(@Param("start")Integer start,@Param("end")Integer end);
    
    /**
     * 统计数量
     * @author yangcong
     * @return 所有订单
     * */
    Integer countOrderList();
    
    /**
     * 删除多个列表
     * */
    Integer deleteSomeOrder(@Param("ids")Integer[] integers);
}
package wyz.jingangHotel02.ssm.autoMapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wyz.jingangHotel02.ssm.autoPo.Orders;
import wyz.jingangHotel02.ssm.autoPo.OrdersExample;

public interface OrdersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int countByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int deleteByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int deleteByPrimaryKey(Integer orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int insert(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int insertSelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    List<Orders> selectByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    Orders selectByPrimaryKey(Integer orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int updateByPrimaryKey(Orders record);
}
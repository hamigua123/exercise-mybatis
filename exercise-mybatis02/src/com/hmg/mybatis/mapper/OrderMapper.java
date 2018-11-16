package com.hmg.mybatis.mapper;

import java.util.List;

import com.hmg.mybatis.pojo.Order;
import com.hmg.mybatis.pojo.OrderUser;

/** 
* @author hmg 
* @version 创建时间：2018年11月13日 下午4:26:14 
* 类说明 :
* 订单持久化接口
*/
public interface OrderMapper {
    
    
    /**
     * 获取订单列表
     * @return
     */
    List<Order> getOrderList();
    
    
    /**
     * 查询订单列表
     * @return
     */
    List<Order> getOrderListMap();
    
    /**
     * 
     * <p>Title: getOrders</p>  
     * <p>Description: 一对一关联: resultType</p>  
     * @return
     */
    List<OrderUser> getOrders();
    
    /**
     * 
     * <p>Title: getOrderByResultMap</p>  
     * <p>Description: 一对一关联: resultMap</p>  
     * @return
     */
    List<Order> getOrderByResultMap();
}

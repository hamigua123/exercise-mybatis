package com.hmg.mybatis.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.hmg.mybatis.mapper.OrderMapper;
import com.hmg.mybatis.mapper.UserMapper;
import com.hmg.mybatis.pojo.Order;
import com.hmg.mybatis.pojo.OrderUser;
import com.hmg.mybatis.pojo.User;
import com.hmg.mybatis.utils.SqlSessionFactoryUtils;

/** 
* @author hmg 
* @version 创建时间：2018年11月13日 下午4:35:16 
* 类说明 :
* order测试类
*/
public class OrderMapperTest {

    @Test
    public void testGetOrderList() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理实现类(反射)
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> list = orderMapper.getOrderList();
        for(Order order : list) {
            System.out.println("order-------------------"+order);
        sqlSession.close(); 
        }
    }
    @Test
    public void testGetOrderListMap() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理实现类(反射)
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> list = orderMapper.getOrderListMap();
        for(Order order : list) {
            System.out.println("order-------------------"+order);
        sqlSession.close(); 
        }
    }

    /**
     * 
     * <p>Title: testGetOrders</p>  
     * <p>Description: 一对一关联: resultType</p>
     */
    @Test
    public void testGetOrders() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderUser> list = orderMapper.getOrders();
        for(OrderUser o : list)
        {
            System.out.println("OrderUser-----------------"+o);
        }       
        sqlSession.close();

    }
    
    /**
     * 
     * <p>Title: testGetOrders</p>  
     * <p>Description: 一对一关联: resultMap</p>
     */
    @Test
    public void testGetOrderByResultMap() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> list = orderMapper.getOrderByResultMap();
        for(Order order : list)
        {
            System.out.println("User------------------"+order);
            System.out.println("Order-----------------"+order);

        }       
        sqlSession.close();

    }

}

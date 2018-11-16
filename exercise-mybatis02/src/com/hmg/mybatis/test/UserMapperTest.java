package com.hmg.mybatis.test;

import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.hmg.mybatis.mapper.UserMapper;
import com.hmg.mybatis.pojo.Order;
import com.hmg.mybatis.pojo.OrderUser;
import com.hmg.mybatis.pojo.User;
import com.hmg.mybatis.pojo.UserVo;
import com.hmg.mybatis.utils.SqlSessionFactoryUtils;

/** 
* @author hmg 
* @version 创建时间：2018年11月12日 下午3:12:13 
* 类说明 :
*
*/
public class UserMapperTest {

    /**
     * Test method for {@link com.hmg.mybatis.mapper.UserMapper#getUserById(java.lang.Integer)}.
     */
    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理实现类(反射)
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(28);
        sqlSession.close(); 
        System.out.println("user-----------------------"+user);
//        fail("Not yet implemented");
    }

    /**
     * Test method for {@link com.hmg.mybatis.mapper.UserMapper#getUserByUserName(java.lang.String)}.
     */
    @Test
    public void testGetUserByUserName() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.getUserByUserName("张");
        for(User user : list)
        {
            System.out.println("list-----------------"+user);
        }
        
        sqlSession.close();
//        fail("Not yet implemented");
    }

    /**
     * Test method for {@link com.hmg.mybatis.mapper.UserMapper#insertUser(com.hmg.mybatis.pojo.User)}.
     */
//    @Test
//    public void testInsertUser() {
//        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession(true);
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        User user = new User();
//        user.setUsername("哈密瓜");
//        user.setSex("2");
//        user.setBirthday(new Date());
//        user.setAddress("菠萝树");
//        userMapper.insertUser(user);
//        sqlSession.close();
////        fail("Not yet implemented");
//    }

    
    @Test
    public void testGetUserByUserVo() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserVo userVo= new UserVo();
        User user1 = new User();
        user1.setUsername("张");
        userVo.setUser(user1);
        List<User> list = userMapper.getUserByUserVo(userVo);
        for(User user : list)
        {
            System.out.println("list-----------------"+user);
        }
        sqlSession.close();
//        fail("Not yet implemented");
    }
    
    
    @Test
    public void testGetUserCount() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Integer count = userMapper.getUserCount();
        System.out.println("count-----------------"+count);
        sqlSession.close();
    }
    
    /**
     * 
     * <p>Title: testGetUserIfByUserName</p>  
     * <p>Description: 在sql中使用if标签 </p>
     */
    @Test
    public void testGetUserIfByUserName() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User();
        user1.setSex("");
        user1.setUsername("");
        List<User> list = userMapper.getUserIfByUserName(user1);
        for(User user : list)
        {
            System.out.println("list-----------------"+user);
        }
        
        sqlSession.close();
//        fail("Not yet implemented");
    }
    
    
    @Test
    public void testGetIdByIds() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserVo userVo = new UserVo();
        userVo.setIds(Arrays.asList(16,29,35));
        List<User> list = userMapper.getIdByIds(userVo);
        for(User user : list)
        {
            System.out.println("list-----------------"+user);
        }       
        sqlSession.close();

    }
    
    @Test
    public void testGetUserOrderByMap() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.getUserOrderByMap();
        for(User user : list)
        {
            System.out.println("用户"+user);
            if( user.getOrders() != null) {
                for (Order order : user.getOrders()) {
                    System.out.println("该用户的订单有:"+order);
                }
            } 
            else {
            System.out.println("该用户无订单!");
            }
        }   
        sqlSession.close();
    }
    
}

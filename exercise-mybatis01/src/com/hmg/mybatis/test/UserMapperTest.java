package com.hmg.mybatis.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.hmg.mybatis.dao.UserDao;
import com.hmg.mybatis.dao.impl.UserDaoImpl;
import com.hmg.mybatis.mapper.UserMapper;
import com.hmg.mybatis.pojo.User;
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

}

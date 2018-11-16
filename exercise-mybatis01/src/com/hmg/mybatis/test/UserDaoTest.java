package com.hmg.mybatis.test;


import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.hmg.mybatis.dao.UserDao;
import com.hmg.mybatis.dao.impl.UserDaoImpl;
import com.hmg.mybatis.pojo.User;

/** 
* @author hmg 
* @version 创建时间：2018年11月12日 下午1:55:17 
* 类说明 :
*
*/
public class UserDaoTest {

    /**
     * Test method for {@link com.hmg.mybatis.dao.UserDao#getUserById(java.lang.Integer)}.
     */
    @Test
    public void testGetUserById() {
        UserDao userDao = new UserDaoImpl();
        User user = userDao.getUserById(28);
        System.out.println("user-----------------------"+user);
//        fail("Not yet implemented");
    }

    /**
     * Test method for {@link com.hmg.mybatis.dao.UserDao#getUserByUserName(java.lang.String)}.
     */
    @Test
    public void testGetUserByUserName() {
        UserDao userDao = new UserDaoImpl();
        List<User> list = userDao.getUserByUserName("张");
        for(User user : list) {
            System.out.println("list----------------"+user);
        }
//        fail("Not yet implemented");
    }

    /**
     * Test method for {@link com.hmg.mybatis.dao.UserDao#insertUser(com.hmg.mybatis.pojo.User)}.
     */
    @Test
    public void testInsertUser() {
        UserDao userDao = new UserDaoImpl();
        User user = new User();
        user.setUsername("哈密瓜");
        user.setSex("2");
        user.setBirthday(new Date());
        user.setAddress("菠萝树");
        //执行插入
        userDao.insertUser(user);
//        fail("Not yet implemented");
        
    }

}

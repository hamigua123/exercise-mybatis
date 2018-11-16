package com.hmg.mybatis.dao.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.hmg.mybatis.dao.*;
import com.hmg.mybatis.pojo.User;
import com.hmg.mybatis.utils.*;

/** 
* @author hmg 
* @version 创建时间：2018年11月12日 上午11:08:18 
* 类说明 :
* 用户信息持久化实现
*/
public class UserDaoImpl implements UserDao {

    @Override
    public User getUserById(Integer id) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        User user = sqlSession.selectOne("user.getUserById", id);
        sqlSession.close();
        return user;
    }

    
    @Override
    public List<User> getUserByUserName(String userName) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        List<User> list = sqlSession.selectList("user.getUserByUserName", userName);
        sqlSession.close();
        return list;
    }

    
    @Override
    public void insertUser(User user) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession(true);
        sqlSession.insert("user.insertUser", user);
        sqlSession.close();
    }

}

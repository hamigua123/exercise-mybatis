package com.hmg.mybatis.dao;

import java.util.List;

import com.hmg.mybatis.pojo.User;

/** 
* @author hmg 
* @version 创建时间：2018年11月12日 上午10:57:49 
* 类说明 :
* 用户信息持久化接口
*/
public interface UserDao {

    /** 
     * 根据用户ID查询用户信息
     * @param id
     * @return
     */
    User getUserById(Integer id);
    
  
    /**
     * 根据用户名查找用户列表
     * @param userName
     * @return
     */
    List<User> getUserByUserName(String userName);
    
    
    /**
     * 添加用户
     * @param user
     */
    void insertUser(User user);
}

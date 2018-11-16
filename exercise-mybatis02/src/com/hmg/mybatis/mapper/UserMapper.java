package com.hmg.mybatis.mapper;

import java.util.List;

import com.hmg.mybatis.pojo.OrderUser;
import com.hmg.mybatis.pojo.User;
import com.hmg.mybatis.pojo.UserVo;

/** 
* @author hmg 
* @version 创建时间：2018年11月12日 下午3:01:32 
* 类说明 :
* 用户持久化接口
*/
public interface UserMapper {

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
     * 传递包装pojo
     * @param userVo
     * @return
     */
    List<User> getUserByUserVo(UserVo userVo);
    
    
    /**
     * 添加用户
     * @param user
     */
    void insertUser(User user);
    
    /**
     * 返回用户数量
     * @return
     */
    Integer getUserCount();
    
    /**
     * 
     * <p>Title: getUserIfByUserName</p>  
     * <p>Description: </p>  
     * @param user
     */
    List<User> getUserIfByUserName(User user);
    
    /**
     * 
     * <p>Title: getIdByIds</p>  
     * <p>Description: 根据id列表查询用户</p>  
     * @return
     */
    List<User> getIdByIds(UserVo userVo);
    
    /**
     * 
     * <p>Title: getUserOrderByMap</p>  
     * <p>Description: 一对多关联查询</p>  
     * @return
     */
    List<User> getUserOrderByMap();


}

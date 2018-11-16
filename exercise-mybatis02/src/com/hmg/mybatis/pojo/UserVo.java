package com.hmg.mybatis.pojo;

import java.util.List;

/** 
* @author hmg 
* @version 创建时间：2018年11月13日 下午3:33:27 
* 类说明 :
* 包装的pojo
*/
public class UserVo {
    private User user;


    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    /*id集合*/
    private List<Integer> ids;
    
    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }


    

}

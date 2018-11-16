/**  
* <p>Title: OrderUser.java</p>  
* <p>Description: </p>  
* @author hmg  
* @date 2018年11月14日  
* @version 1.0  
*/  
 
package com.hmg.mybatis.pojo;

import java.util.Date;

/** 
* @author hmg 
* @version 创建时间：2018年11月14日 下午3:21:43 
* 类说明 :
*
*/
/**  
* <p>Title: OrderUser</p>  
* <p>Description: </p>  
* @author hmg 
* @date 2018年11月14日  
*/

public class OrderUser extends Order{
    private String username;// 用户姓名
    private String address;// 地址
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "OrderUser [username=" + username + ", address=" + address + ", getId()=" + getId() + ", getUserId()="
                + getUserId() + ", getNumber()=" + getNumber() + ", getCreatetime()=" + getCreatetime() + ", getNote()="
                + getNote() + "]";
    }
    
    
    
}

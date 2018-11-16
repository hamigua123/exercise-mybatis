package com.hmg.mybatis.utils;
/** 
* @author hmg 
* @version 创建时间：2018年11月8日 下午5:40:05 
* 类说明 :
* SqlSessionFactory工具类
*
*/

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {
    
    private static SqlSessionFactory sqlSessionFactory;
    
    static {
        try {
            //创建SqlSessionFactoryBuilder对象 
            SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
            //创建核心配置文件的输入流
            InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            //通过输入流创建SqlSessionFactory对象
            sqlSessionFactory = ssfb.build(inputStream);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * getSqlSessionFactory
     * @return
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}

 
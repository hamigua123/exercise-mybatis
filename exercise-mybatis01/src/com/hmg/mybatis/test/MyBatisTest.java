package com.hmg.mybatis.test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hmg.mybatis.pojo.User;
import com.hmg.mybatis.utils.SqlSessionFactoryUtils;
/** 
* @author hmg 
* @version 创建时间：2018年11月8日 下午2:46:32 
* 类说明 :
*
*/
public class MyBatisTest {
    
    
    /**
     * 直接使用SqlSessionFactory
     * @throws Exception
     */
//    @Test
//    public void testGetUserById() throws Exception {
//        //创建SqlSessionFactoryBuilder对象 
//        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
//        //创建核心配置文件的输入流
//        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//        //通过输入流创建SqlSessionFactory对象
//        SqlSessionFactory sqlSessionFactory = ssfb.build(inputStream);
//        //创建SqlSession对象
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //执行查询,参数1:sql id ,参数2 入参    
//        User user = sqlSession.selectOne("user.getUserById", 1);
//        //输出
//        System.out.println(user);
//        //关闭
//        sqlSession.close();
//    }
//    
//    /**
//     * 模糊查询
//     */
//    @Test
//    public void testGetUserByUserName() {
//        //获取SqlSessionFactory
//        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
//        //创建SqlSession对象
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //执行查询
////        sql:SELECT * FROM `user` WHERE username LIKE #{name} 需要在具体sql执行中加% %
////        List<User> list = sqlSession.selectList("user.getUserByUserName", "%张%");
////        sql:SELECT * FROM `user` WHERE username LIKE '%${value}%'  不需要在具体sql执行中加% %
//        List<User> list = sqlSession.selectList("user.getUserByUserName", "张");
//        for(User user : list) {
//            System.out.println(user);
//        }
//        //释放资源
//        sqlSession.close();
//    }
//    
    
    /*      提交失败
     *      console:DEBUG [main] - Setting autocommit to false on JDBC Connection [com.mysql.cj.jdbc.ConnectionImpl@442675e1]
     *      Mybatis默认设置事务不提交,需要手动设置 sqlSession.commit();
     *      也可以设置 sqlSessionFactory.openSession(true)进行自动
     */
    @Test
    public void testInsertUser() {
        //获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        //创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //设置事务自动提交
        //SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //新建user
        User user = new User();
        user.setUsername("张飞3");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("地球村");
        //执行插入
        int insert = sqlSession.insert("insertUser", user);
        System.out.println(user);
        //提交事务
        sqlSession.commit();
        //插入sql,返回主键
        //输出
        System.out.println(insert);
        //释放资源
        sqlSession.close();
        

    }
    
//    @Test
//    public void testInsertUserUUID() {
//      //获取SqlSessionFactory
//        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
//        //创建SqlSession对象
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //设置事务自动提交
//        //SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        //新建user
//        User user = new User();
//        user.setUsername("张飞7");
//        user.setSex("1");
//        user.setBirthday(new Date());
//        user.setAddress("地球村");
//        //执行插入
//        sqlSession.insert("insertUserUUID", user);
//        System.out.println(user);
//        //提交事务
//        sqlSession.commit();
//        //插入sql,返回主键
//        
//        //释放资源
//        sqlSession.close();
//    }
    
//    
//    @Test
//    public void testUpdateUser() {
//      //获取SqlSessionFactory
//      SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
//      //创建SqlSession对象
//      SqlSession sqlSession = sqlSessionFactory.openSession();
//      //设置事务自动提交
//      //SqlSession sqlSession = sqlSessionFactory.openSession(true);
//      User user = new User();
//      user.setId(33);
//      user.setUsername("龙角");
//      //更新用户
//      sqlSession.update("user.updateUser", user);
//      //提交事务
//      sqlSession.commit();
//      //插入sql,返回主键
//    
//      //释放资源
//      sqlSession.close();
//    }
//    
//    
//    
//    @Test
//    
//    public void testDeleteUser() {
//      //获取SqlSessionFactory
//      SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
//      //创建SqlSession对象
//      SqlSession sqlSession = sqlSessionFactory.openSession();
//      //设置事务自动提交
//      //SqlSession sqlSession = sqlSessionFactory.openSession(true);
//      //删除用户
//      sqlSession.delete("user.deleteUser", 32);
//      //提交事务
//      sqlSession.commit();
//      //插入sql,返回主键
//    
//      //释放资源
//      sqlSession.close();
//    }
}

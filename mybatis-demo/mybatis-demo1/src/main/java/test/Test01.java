package test;

import entity.User;
import mapper.userMapper;
import mapper.userMapper2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws IOException {
        // 1.读取加载mybatis-config.xml
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 2.获取到获取到
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 3.根据 mapper id=getByUsers 执行该s  ql 语句 通过  sql语句得到我们的对象 orm
        List<User> users1 = sqlSession.selectList("getByUsers", User.class);
        List<User> users2 = sqlSession.selectList("getByUsers2", User.class);
         userMapper userMapper = sqlSession.getMapper(userMapper.class);
         System.out.println(userMapper.getByUsers());

        userMapper2 userMapper2 = sqlSession.getMapper(userMapper2.class);
        System.out.println(userMapper2.getByUsers2());
        //System.out.println(users);
        sqlSession.close();
    }
}

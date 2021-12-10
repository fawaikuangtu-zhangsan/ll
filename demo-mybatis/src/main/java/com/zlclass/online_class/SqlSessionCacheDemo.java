package com.zlclass.online_class;


import com.zlclass.online_class.dao.UserMapper;
import com.zlclass.online_class.dao.VideoMapper;
import com.zlclass.online_class.dao.VideoOrderMapper;
import com.zlclass.online_class.domain.User;
import com.zlclass.online_class.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SqlSessionCacheDemo {
    public static void main(String[] args) throws IOException {
        String resouce = "config/mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try {
            SqlSession sqlSession1 = sqlSessionFactory.openSession();
            VideoMapper videoMapper1 = sqlSession1.getMapper(VideoMapper.class);
            Video video1 = videoMapper1.selectByID(44);
            System.out.println(video1.toString());
            sqlSession1.commit();

            SqlSession sqlSession2 = sqlSessionFactory.openSession();
            VideoMapper videoMapper2 = sqlSession2.getMapper(VideoMapper.class);
            Video video2 = videoMapper2.selectByID(44);
            System.out.println(video2.toString());
            sqlSession1.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

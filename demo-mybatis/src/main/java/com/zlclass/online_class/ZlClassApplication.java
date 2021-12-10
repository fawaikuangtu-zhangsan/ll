package com.zlclass.online_class;


import com.zlclass.online_class.dao.UserMapper;
import com.zlclass.online_class.dao.VideoMapper;
import com.zlclass.online_class.dao.VideoOrderMapper;
import com.zlclass.online_class.domain.User;
import com.zlclass.online_class.domain.Video;
import com.zlclass.online_class.domain.VideoOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.omg.CORBA.MARSHAL;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class ZlClassApplication {
    public static void main(String[] args) throws IOException {
        String resouce = "config/mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)){

            VideoMapper mapper = sqlSession.getMapper(VideoMapper.class);
            VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            //根据id查询video
//            Video video = mapper.selectByID(44);
//            System.out.println(video.toString());
//
//            //查询所有video
//            List<Video> videos = mapper.selectList();
//            System.out.println(videos);
//
            //根据评分和标题模糊查询video
//            List<Video> videoList = mapper.selectVideoByPointAndLikeTitle(8.7, "HTML");
//            System.out.println(videoList);

//            Video v = new Video();
//            v.setTitle("笑傲江湖");
//            v.setSummary("http:haha.png");
//            v.setCoverImg("http:hehe.png");
//            v.setPrice(999);
//            v.setCreateTime(new Date());
//            v.setPoint(8.7);
//            Integer rows = mapper.addVideo(v);
//            System.out.println(rows);
//            System.out.println(v.toString());



//            Video v = new Video();
//            v.setTitle("笑傲江湖1");
//            v.setSummary("http:haha.png1");
//            v.setCoverImg("http:hehe.png1");
//            v.setPrice(9991);
//            v.setCreateTime(new Date());
//            v.setPoint(8.71);
//
//            Video v2 = new Video();
//            v2.setTitle("笑傲江湖2");
//            v2.setSummary("http:haha.png2");
//            v2.setCoverImg("http:hehe.png2");
//            v2.setPrice(9992);
//            v2.setCreateTime(new Date());
//            v2.setPoint(8.72);
//
//            List<Video> list = new ArrayList<>();
//            list.add(v);
//            list.add(v2);
//
//            int i = mapper.addBatchVideo(list);
//            System.out.println(i);


//            Video v2 = new Video();
//            v2.setTitle("射雕英雄传");
//            v2.setCoverImg("http:hehe.pngs");
//            v2.setId(64);
//
//            int rows = mapper.updateVideo(v2);
//            System.out.println(rows);


//            Video v2 = new Video();
//            v2.setTitle("哈哈哈哈哈哈");
//            v2.setCoverImg("哈哈哈哈哈哈");
//            v2.setId(63);
//
//            int rows = mapper.updateVideoSelective(v2);
//            System.out.println(rows);

//            Map<String,Object> map=new HashMap<>();
//            map.put("createTime","2020-01-11 09:33:20");
//            map.put("price",666);
//            int rows = mapper.deleteByParam(map);
//            System.out.println(rows);


//            Video video = mapper.selectBaseFieldByIdWithResultMap(44);
//            System.out.println(video.toString());


//            List<VideoOrder> videoOrders = videoOrderMapper.queryVideoOrderList();
//            System.out.println(videoOrders.toString());

//            List<User> users = userMapper.queryUserOrders();
//            System.out.println(users);


            /**
             * 测试懒加载
             */
            List<VideoOrder> videoOrders = videoOrderMapper.queryVideoOrderListLazy();
            for (VideoOrder videoOrder : videoOrders){
                System.out.println(videoOrder.getVideoTitle());
                System.out.println(videoOrder.getUser().getName());
            }

        }
    }
}

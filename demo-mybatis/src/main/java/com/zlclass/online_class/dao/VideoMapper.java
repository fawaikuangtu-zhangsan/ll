package com.zlclass.online_class.dao;

import com.zlclass.online_class.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface VideoMapper {
    /**
     * 根据视频id查找视频对象
     * @param videoID
     * @return
     */
    Video selectByID(@Param("video_id") int videoID);

    /**
     * 查询全部视频列表
     * @return
     */
    @Select("select * from video")
    List<Video> selectList();


    /**
     * 根据评分和标题模糊查询
     * @param point
     * @param title
     * @return
     */
    List<Video> selectVideoByPointAndLikeTitle(@Param("point")double point,@Param("title") String title);

    /**
     * 添加一条video
     * @param video
     * @return
     */
    Integer addVideo(Video video);


    /**
     * 批量插入video
     * @param videos
     * @return
     */
    int addBatchVideo(List<Video> videos);

    /**
     * 更新修改video
     * @param video
     * @return
     */
    int updateVideo(Video video);

    /**
     * 选择性更新
     * @param video
     * @return
     */
    int updateVideoSelective(Video video);


    /**
     * 根据指定参数删除
     * @param paramMap
     * @return
     */
    int deleteByParam(Map<String,Object> paramMap);


    /**
     * 根据id查询video
     * @param id
     * @return
     */
    Video selectBaseFieldByIdWithResultMap(@Param("video_id") int id);
}

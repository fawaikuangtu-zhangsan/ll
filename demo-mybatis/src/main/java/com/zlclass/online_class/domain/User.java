package com.zlclass.online_class.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    private int id;
    private String name;
    private String pwd;
    private String headImg;
    private String phone;
    private Date createTime;

    private List<VideoOrder> videoOrders;

    public List<VideoOrder> getVideoOrders() {
        return videoOrders;
    }

    public void setVideoOrders(List<VideoOrder> videoOrders) {
        this.videoOrders = videoOrders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", headImg='" + headImg + '\'' +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                ", videoOrders=" + videoOrders +
                '}';
    }
}

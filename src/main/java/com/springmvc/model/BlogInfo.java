package com.springmvc.model;

import lombok.Data;

/**
 * Created by  Aileen on 2017/9/12.
 */
@Data
public class BlogInfo {
    private String id;
    private String creatTime; //博客的创作时间
    private String author; //作者
    private String title; //博客标题
    private String blogContext; //博客内容
}

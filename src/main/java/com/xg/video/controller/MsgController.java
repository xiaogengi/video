package com.xg.video.controller;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: video
 * @description: 聊天处理
 * @author: gzk
 * @create: 2020-01-08 10:07
 **/
@RestController
public class MsgController {

    //存储聊天记录
    private static List MSG_LIST = new ArrayList();

    //存储所有聊天室
    private static Map<String,List> CHANNEL_MAP =  new ConcurrentHashMap();

    @RequestMapping("addMsg")
    public void addMsg(String msg,String userId){
        MSG_LIST.add(userId + " : " + msg + "</br>");
        CHANNEL_MAP.put("XBB",MSG_LIST);
    }


    @RequestMapping("queryMsg")
    public List queryMsg(){
        List xbb = CHANNEL_MAP.get("XBB");
        return xbb == null ? new ArrayList() : xbb;
    }

}

package com.xg.video.controller;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIXDom;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: video
 * @description: 视频
 * @author: gzk
 * @create: 2020-01-08 11:07
 **/
@RestController
public class VideoController {


    //存储视频播放时间
    public static Map<String,String> TIME_MAP = new ConcurrentHashMap<>();


    private static BigDecimal BIGDECIMAL_1 = new BigDecimal("0.5");

    //用户id 反转
    public static Map<String,String> USER_AOP = new ConcurrentHashMap<>();

    /**
     * 同步视频播放时间
     * @param time
     */
    @RequestMapping("syncTime")
    public void syncTime(String time,String userId){
        TIME_MAP.put("XBB" + userId,time);
    }

    /**
     * 返回视频当前播放时间
     */
    @RequestMapping("queryTime")
    public String queryTime(String userId){
        List<String> userList = LoginController.USER_LIST;
        for (String str : userList) {
            if(!str.equals(userId)){
                userId = str;
                break;
            }
        }
        String xbb = TIME_MAP.get("XBB" + userId);
        if(xbb == null || xbb == ""){
            return "";
        }
        return new BigDecimal(xbb).add(BIGDECIMAL_1).toString();
    }


}

package com.xg.video.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: video
 * @description: 登陆
 * @author: gzk
 * @create: 2020-01-08 14:13
 **/
@RestController
public class LoginController {

    public static List USER_LIST = new ArrayList();


    /**
     * 登陆
     * @param userId
     */
    @RequestMapping("login")
    public void login(String userId){
        USER_LIST.add(userId);
    }

    /**
     * 清空登陆信息
     */
    @RequestMapping("loginNull")
    public void loginNull(){
        USER_LIST = new ArrayList();
    }


}

package com.xg.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller
public class VideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoApplication.class, args);
    }

    /**
     * 打开主页面
     * @return
     */
    @RequestMapping("hi")
    public String hi(){
        return "/index";
    }


}

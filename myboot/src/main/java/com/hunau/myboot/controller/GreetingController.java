package com.hunau.myboot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller

/**
 * @param
 * @Description:
 * @Return:
 * @Author: 蔡文静
 * @单位：湖南农业大学物联网工程专业
 * @Date:
 * @开发版本：综合练习VO.1
 */
public class GreetingController {
    @GetMapping("/greeting")           // 映射信息，访问方法为GET方法
    @ResponseBody                   //修改了@Controller的返回要求，返回结果是字符串
    public String greeting() {
        System.out.println("Hello");
        return "greeting";
    }
    @GetMapping("/hi")               // 映射信息，访问方法为GET方法
    @ResponseBody
    public String hi(@RequestParam(name="name", required=false, defaultValue="cwj") String name, Model model) {
        model.addAttribute("name", name);
        return "hi";                  //返回的是视图，即返回位于templates目录下的hi.html
    }
}

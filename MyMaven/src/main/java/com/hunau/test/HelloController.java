package com.hunau.test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @param
 * @Description:
 * @Return:
 * @Author: 蔡文静
 * @单位：湖南农业大学物联网工程专业
 * @Date:
 * @开发版本：综合练习VO.1
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "蔡文静，学号为201841882103";
    }

}

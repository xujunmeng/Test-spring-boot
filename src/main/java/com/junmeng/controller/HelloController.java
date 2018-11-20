package com.junmeng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by james on 2018/3/14.
 */
@RestController  //等同于同时加上了@Controller和@ResponseBody
public class HelloController {

    @GetMapping("/helloworld")
    public String helloworld() {
        return "the result : helloworld";
    }

    //访问/hello或者/hi任何一个地址，都会返回一样的结果
    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return "hi you!!!";
    }

}

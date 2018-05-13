package com.chen.demo4j.controller;

import com.chen.framework.annotation.Controller;
import com.chen.framework.annotation.RequestMapping;
import com.chen.framework.bean.Data;
import com.chen.framework.bean.Param;
import com.chen.framework.bean.Request;

import java.util.HashMap;

@Controller
public class HelloController {

    @RequestMapping(value = "hello",type = Request.REQUEST_METHOD_GET)
    public Data getHello(Param param){
        HashMap<String,String> map=new HashMap<>();
        map.put("hello","chenjinwei");
        Data data=new Data(map);
        return data;
    }
}

package com.binbin.controller;

import com.binbin.model.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.OnError;

/**
 * Created by weizhibin on 2017/3/3.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "*")
    public String pageNotFound(){
        return "errorPage";
    }


    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public Result greet(){

        return new Result("你好");

    }







}

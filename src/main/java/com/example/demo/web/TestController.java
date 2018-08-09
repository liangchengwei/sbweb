package com.example.demo.web;

import com.example.demo.bean.HelloMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @Autowired(required = false)
    HelloMessage helloMessage;

    @RequestMapping("/index")
    public String index() {
        return "indexth";
    }

    @RequestMapping("/index1")
    public ModelAndView index1() {
        ModelAndView mv = new ModelAndView("index1.jsp");
        return mv;
    }
    @RequestMapping("/indexhtml")
    public ModelAndView indexHtml() {
        ModelAndView mv = new ModelAndView("index.html");
        return mv;
    }

    @RequestMapping("/vueindex")
    public ModelAndView vueIndex() {
        System.out.println(helloMessage.getMsg());
        ModelAndView mav = new ModelAndView("vue/html/index.html");
        return mav;
    }
}

package com.springlegacy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InitController {
    
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String initView(){return "hello";}

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloView(){return "hello";}
}

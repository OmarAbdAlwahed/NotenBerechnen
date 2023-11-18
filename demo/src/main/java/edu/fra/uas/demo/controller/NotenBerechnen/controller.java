package edu.fra.uas.demo.controller.NotenBerechnen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class controller {
   @RequestMapping(value="hello", method=RequestMethod.GET)


    @ResponseBody
    public String  HelloWorldController() {
        return "<h1> Hallo world Sring Boot! </h1>";
    }
    
}

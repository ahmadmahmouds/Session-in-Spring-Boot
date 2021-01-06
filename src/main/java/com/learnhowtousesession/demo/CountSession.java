package com.learnhowtousesession.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CountSession {


    @RequestMapping("/")
    public String index(HttpSession session){
        if (session.isNew()) {
            session.setAttribute("count",0);
        } else {
            Integer count = (Integer) session.getAttribute("count");
            count++;
            session.setAttribute("count",count);
        }
        return "index.jsp";
    }



    @RequestMapping("/count")
    public String counter(Model model,HttpSession session){
//        model.addAttribute(count)
        ;
        if (session.isNew()) {
            return  "redirect:/";
        }
        else {
            model.addAttribute("count",session.getAttribute("count"));
        return "count.jsp";
        }


    }
}

package com.login.userloginapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("login")
public class LoginController {

    @RequestMapping("welcome")
    public String welcomePage(Model model){
        model.addAttribute("wish","good afternoon");
        return "welcome";
    }

    @RequestMapping("login")
    public String login(HttpServletRequest request, HttpServletResponse response){

        String username=request.getParameter("userName");
        String password= request.getParameter("password");
        if(username.equals("sudheer") && password.equals("1234")){
            return "success";
        }
            return "failure";
    }
}

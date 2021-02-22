package com.bjpowernode.web;

import com.bjpowernode.domian.User;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model, Integer id){
        User user=userService.queryById(id);
        model.addAttribute("user",user);
    return "userDetail";
    }
}

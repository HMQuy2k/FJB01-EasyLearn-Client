package com.easy.learn.web.controller;

import com.easy.learn.web.callApi.UserCallService;
import com.easy.learn.web.consts.UrlPath;
import com.easy.learn.web.dto.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
//    @Autowired
//    UserCallService userCallService;

//    @GetMapping(UrlPath.GET_ALL_USER)
//    public String getAllUser (Model model) {
//        List<User> users = userCallService.getAllUser();
//        model.addAttribute("users", users);
//        return "index";
//
//    }
}

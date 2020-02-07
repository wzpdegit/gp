package com.wzp.modules.system.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wzp.modules.system.entity.User;
import com.wzp.modules.system.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:wzp
 * @Description:用户操作
 * @Date:Created in 13:58 2020/2/7
 * @Version:1.0
 */
@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/saveUser")
    @ResponseBody
    public String saveUser(User user){
        if(user != null){
            user.setId("20200"+user.getDepartment()+"11");
            System.out.println("user:"+user.toString());
            boolean b = userService.save(user);
            return "success";
        } else {
            return "noNull";
        }
    }

    @RequestMapping ("/selectUserPage")
    @ResponseBody
    public List<User> selectUserPage(Integer current, Integer size){
            IPage<User> page = new Page<>(current,size);
            userService.page(page,null);
            return page.getRecords();
    }

    @RequestMapping("/findUserById")
    @ResponseBody
    public User findUserById(String id){
        if (id == null || id.equals("")){
            return null;
        }
        User user = userService.getById(id);
        System.out.println(user.toString());
        return user;
    }

    @RequestMapping("/deleteUserById")
    @ResponseBody
    public String deleteUserById(String id){
        if (id == null || id.equals("")){
            return "noNull";
        }
        boolean b = userService.removeById(id);
        return "deleteUserById:"+b;
    }

    @RequestMapping("/updateUserById")
    @ResponseBody
    public String updateUserById(User user){
        if (user == null){
            return "noNull";
        }
        boolean b = userService.updateById(user);
        return "updateUserById:"+b;
    }
}

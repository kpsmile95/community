package cn.wm.community.controller;

import cn.wm.community.mapper.UserMapper;
import cn.wm.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/{page}")
    public String showPage(@PathVariable("page")String page, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("token")) {
                String token = cookie.getValue();
                User user = userMapper.selectByToken(token);
                if (user != null) {
                    request.getSession().setAttribute("user",user);
                }
                break;
            }

        }
        return page;
    }
}

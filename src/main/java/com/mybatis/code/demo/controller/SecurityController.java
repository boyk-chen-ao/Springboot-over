package com.mybatis.code.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
public class SecurityController {

    /**
     * 其他没有限定的内容，可以访问
     * @return String
     */
    @GetMapping("/helloWorld")
    @ResponseBody
    public String helloWorld(){
        return "其他没有限定的内容，可以访问!";
    }

    /**
     * 不拦截 oauth 开放的资源
     * @return String
     */
    @GetMapping("/oauth/login")
    @ResponseBody
    public String oauthLogin() {
        return "不拦截 oauth 开放的资源!";
    }

    /**
     * 对admin下的接口 需要ADMIN权限（只对admin开放）
     * @return String
     */
    @GetMapping("/admin/greeting")
    @ResponseBody
    public String adminGreeting() {
        return "你的权限为Admin，恭喜访问成功!";
    }

    /**
     * 对decision和govern和employee 下的接口 需要 EMPLOYEE 或者 ADMIN 权限
     * @return String
     */
    @GetMapping("/employee/greeting")
    @ResponseBody
    public String employeeGreeting() {
        return "此为员工页面，你的权限为Employee 或者 Admin，恭喜你访问成功!";
    }

    /**
     * 对decision和govern和employee 下的接口 需要 EMPLOYEE 或者 ADMIN 权限
     * @return String
     */
    @GetMapping("/decision/greeting")
    @ResponseBody
    public String decisionGreeting() {
        return "此为运营页面，你的权限为Employee 或者 Admin，恭喜你访问成功!";
    }

    /**
     * 对decision和govern和employee 下的接口 需要 EMPLOYEE 或者 ADMIN 权限
     * @return String
     */
    @GetMapping("/govern/greeting")
    @ResponseBody
    public String governGreeting() {
        return "此为治理页面，你的权限为Employee 或者 Admin，恭喜你访问成功!";
    }

    /**
     * 测试登录成功后的用户数据
     * @return Map<String , Object>
     */
    @GetMapping("/govern/userInfo")
    @ResponseBody
    public Map<String , Object> getUserInfo() {

        User user= (User) SecurityContextHolder.getContext().getAuthentication() .getPrincipal();
        Map<String , Object> map = new HashMap<>();
        map.put("userInfo",user);

        return map;
    }

    /**
     * 注销操作
     * @return String
     */
    @GetMapping("/signOut")
    @ResponseBody
    public String signOut() {

        return "用户注销成功！";
    }

    /**
     * 注销操作
     * @return String
     */
    @GetMapping("/signOut/success")
    @ResponseBody
    public String signOutSuccess() {

        log.info("=============================用户注销成功！=================================");
        return "用户注销,跳转页面成功！";
    }

}
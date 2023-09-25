package com.morgan.iterone.controller;

import com.morgan.iterone.mapper.AccountMapper;
import com.morgan.iterone.pojo.Account;
import com.morgan.iterone.pojo.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountMapper accountMapper;

//    private PasswordEncoder delegateEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();


    @RequestMapping({"/"})
    public String toMain(Model model,HttpSession session){
        if(session.getAttribute("loginAccount")==null) {
            model.addAttribute("msg",null);
        }else {
            model.addAttribute("msg","");
        }
        return "index";
    }

    @RequestMapping("/sign")
    public String detSign(Model model,HttpSession session){
        if(session.getAttribute("loginAccount")==null) {
            return toLogin();
        }else return logout(model, session);
    }

    @RequestMapping("/tologin")
    public String toLogin(){
        return "login-register";
    }

    @RequestMapping("/logout")
    public String logout(Model model,HttpSession session){
        session.setAttribute("loginAccount",null);
        return toMain(model, session);
    }


    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session){

        Account account = accountMapper.queryByUsername(username);
        if(account!=null){

//            if(delegateEncoder.matches(delegateEncoder.encode(password), delegateEncoder.encode(account.getPassword())) ){
            if(password.equals(account.getPassword()) ){
                session.setAttribute("loginAccount",account.getUserID());
                return toMain(model, session);
            }
        }


        model.addAttribute("msg","Wrong username or password");
        return "login-register";
    }

    @RequestMapping("/register")
    public String register(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           @RequestParam("email") String email,
                           @RequestParam("phone") String phone,
                        Model model){

        Account checkAccount = accountMapper.queryByUsername(username);
        if(checkAccount!=null){
            model.addAttribute("msg2","invalid username");
            return toLogin();
        }

//        String hashedPassword = delegateEncoder.encode(password);

        if(accountMapper.addAccount(username,password,email,phone)==0){
            model.addAttribute("msg2","register failed");
        }else {
            model.addAttribute("msg2","register success");
        }

        return toLogin();
    }

    @RequestMapping("/checkUsername")
    public void checkUsername(@RequestParam("username") String username,
                              HttpServletResponse httpServletResponse) throws IOException {
        List<Account> accountList = accountMapper.queryAccountList();
        for(Account account : accountList){
            if(StringUtils.isEmpty(username) || account.getUsername().equals(username) ){
                httpServletResponse.getWriter().print("no");
                return;
            }
        }
        httpServletResponse.getWriter().print("yes");
    }

    @RequestMapping("/checkEmail")
    public void checkEmail(@RequestParam("email") String email,
                              HttpServletResponse httpServletResponse) throws IOException {
        List<Account> accountList = accountMapper.queryAccountList();
        for(Account account : accountList){
            if(StringUtils.isEmpty(email) || account.getEmail().equals(email) ){
                httpServletResponse.getWriter().print("no");
                return;
            }
        }
        httpServletResponse.getWriter().print("yes");
    }

    @RequestMapping("/userDetail")
    public String queryByUserID(Model model, HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("userID"));
        Account account = accountMapper.queryByUserID(id);
        model.addAttribute("account", account);
        return "game-details";
    }
}

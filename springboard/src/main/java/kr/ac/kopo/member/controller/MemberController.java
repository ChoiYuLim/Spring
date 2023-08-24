package kr.ac.kopo.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @GetMapping("login")
    public String loginForm() {
        return "member/loginForm";
        // member/loginForm.jsp
    }

    @PostMapping("/login")
    public String loginProcess() {
       
        System.out.println("post login");
        return "";
    }
}

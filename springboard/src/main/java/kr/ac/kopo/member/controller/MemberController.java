package kr.ac.kopo.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import kr.ac.kopo.member.vo.LoginVO;

@Controller
public class MemberController {
    @GetMapping("login")
    public String loginForm() {
        return "member/loginForm";
        // member/loginForm.jsp
    }

    @PostMapping("/login")
    public String loginProcess(LoginVO loginVO) {

        System.out.println("post login");
        return "";
    }
}

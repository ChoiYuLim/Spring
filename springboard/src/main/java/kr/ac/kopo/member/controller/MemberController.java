package kr.ac.kopo.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import kr.ac.kopo.member.service.MemberService;
import kr.ac.kopo.member.vo.LoginVO;
import kr.ac.kopo.member.vo.MemberVO;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/login")
    public String loginForm() {
        return "member/loginForm";
        // member/loginForm.jsp
    }

    @PostMapping("/login")
    public String loginProcess(LoginVO loginVO) {
        MemberVO memberVO = memberService.login(loginVO);
        System.out.println("login이 완료되었습니다.");
        System.out.println(memberVO);
        return "redirect:/board";
    }
}

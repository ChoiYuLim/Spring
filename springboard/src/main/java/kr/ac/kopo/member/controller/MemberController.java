package kr.ac.kopo.member.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
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
    public String loginForm(Model model) {
        LoginVO loginVO = new LoginVO();
        model.addAttribute(loginVO);
        return "member/loginForm";
        // member/loginForm.jsp
    }

    @PostMapping("/login")
    public String loginProcess(@Valid LoginVO loginVO, Errors errors) {

        if (errors.hasErrors()) {// error 존개
            return "member/loginForm";
        } else { // null값이 없을 때 DB query 실행
            MemberVO memberVO = memberService.login(loginVO);
            System.out.println("login이 완료되었습니다.");
            System.out.println(memberVO);
            return "redirect:/board";

        }

    }
}

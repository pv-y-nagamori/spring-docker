package com.example.app.controller.login; // このファイルが属するパッケージ（フォルダ）

// 必要なクラスをインポートします
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @GetMapping("/")
    public String redirectToIndex() {
        // ユーザー認証情報取得
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // ユーザーがログインしている場合
        if (authentication != null && authentication.isAuthenticated()) {
            logger.info("login!!");
            return "redirect:/menu";
        }
        logger.info("not login!!");
        return "redirect:/login";
    }
}


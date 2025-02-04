package com.example.app.controller.login; // このファイルが属するパッケージ（フォルダ）

// 必要なクラスをインポートします
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller // このクラスがWebコントローラーであることを示します
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(LoginController.class); // ログ インスタンス

    @GetMapping("/login") // "/login"というURLに対するGETリクエストを処理します
    public String login() {
        return "login";  // login.htmlを表示します
    }
    
    @GetMapping("/") // ルートURL ("/") に対するGETリクエストを処理します
    public String redirectToIndex() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); // 現在のユーザーの認証情報を取得します
        if (authentication != null && authentication.isAuthenticated()) { // ユーザーがログインしている場合
            logger.info("login!!");
            return "redirect:/index";  // "/index"にリダイレクトします
        }
        logger.info("not login!!");
        return "redirect:/login"; // ユーザーがログインしていない場合、"/login"にリダイレクトします
    }
    
    @GetMapping("/index") // "/index"というURLに対するGETリクエストを処理します
    public String index() {
        return "index"; // index.htmlを表示します
    }
}


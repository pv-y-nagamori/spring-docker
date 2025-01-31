// package com.example.app.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import com.example.app.repository.UserRepository;

// @RestController
// public class UserController {

//   private final UserRepository repository;

//   @Autowired
//   public UserController(UserRepository repository) {
//     this.repository = repository;
//   }

//   @RequestMapping("/")
//   public String user() {
//     return String.valueOf(repository.findAll());
//   }
// }

package com.example.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/")
    public String helloView(){
        // 戻り値は「ビュー名」を返す
        return "hello";
    }
}
package self.study.enrich.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import self.study.enrich.exception.UserNotFoundException;

@RestController
public class RootController {
    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        throw new UserNotFoundException();
//        return ResponseEntity.ok("hello world");
    }
}

package xyz.g1nha0.lostandound.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.g1nha0.lostandound.entity.R;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/R")
    public R test(){
        return R.ok("ok" );
    }
}

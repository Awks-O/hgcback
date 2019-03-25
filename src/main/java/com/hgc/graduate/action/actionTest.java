package com.hgc.graduate.action;

import com.hgc.graduate.core.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class actionTest {
    @GetMapping("/info")
    public Result query() {
        return Result.success(true);
    }

    @GetMapping("/")
    public Result index() {
        return Result.success(true);
    }
}

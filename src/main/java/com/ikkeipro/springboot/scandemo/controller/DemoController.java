package com.ikkeipro.springboot.scandemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    //mapping for "/scan"

    @GetMapping("/scan")
    public String scanCode() {
        return "scan";
    }
}

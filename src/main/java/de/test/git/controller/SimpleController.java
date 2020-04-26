package de.test.git.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("ApplikationsName", appName);
        double p  = calculate(7, 4.9f);
        return "zuhause " + p;
    }

    private double calculate(int x, float y) {
        return (double) x * y;
    }
    public int useless() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int e = 1;
        for (int i = 0; i < 90; i++) {
            d = 0;
        }

        return a + b + c;
    }
}


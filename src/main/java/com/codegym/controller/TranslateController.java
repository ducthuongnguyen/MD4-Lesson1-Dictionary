package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TranslateController {
    @GetMapping()
    public String index() {
        return "index";
    }

    @GetMapping("/translate")
    public String trans(@RequestParam String key, Model model) {
        Map<String, String> list = new HashMap<>();
        list.put("play", "chơi");
        list.put("road", "đường");
        list.put("cat", "mèo");
        if (list.containsKey(key)) {
            model.addAttribute("rs", list.get(key));
        } else
            model.addAttribute("rs", "Not found");
        return "result";
    }
}

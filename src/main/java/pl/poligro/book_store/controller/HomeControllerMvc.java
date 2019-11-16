/*
 * Copyright 2019 Marek Morawiec
 * User: marek
 * Date: 26.08.2019
 * Time: 17:16
 */

package pl.poligro.book_store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllerMvc {

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("sampleText", "th:text");
        model.addAttribute("a", 5);
        model.addAttribute("b", 100);
        return "test";
    }
}

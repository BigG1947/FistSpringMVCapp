package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;

@Controller
public class HelloController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) throws SQLException {
        model.addAttribute("message", "Hello, World!");
        return "index";
    }
}

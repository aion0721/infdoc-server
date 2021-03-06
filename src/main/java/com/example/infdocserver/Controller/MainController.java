package com.example.infdocserver.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("sysgrps")
    public String sysgrps() {
        return "sysgrps/index";
    }

    @GetMapping("sysgrps/new")
    public String sysgrpsNew() {
        return "sysgrps/new";
    }

    @GetMapping("sysgrps/edit")
    public String sysgrpsEdit() {
        return "sysgrps/edit";
    }

    @GetMapping("sysgrps/delete")
    public String sysgrpDelete() {
        return "sysgrps/delete";
    }

}
package com.example.infdocserver.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.example.infdocserver.Domain.Sysgrp;
import com.example.infdocserver.Service.SysgrpService;

import java.util.List;

@RestController
@RequestMapping("/sysgrps")
public class SysgrpController {

    @Autowired
    private SysgrpService sysgrpService;

    @GetMapping("list")
    public List<Sysgrp> index(@ModelAttribute Sysgrp sysgrp) {
        return sysgrpService.findAll();
    }

}
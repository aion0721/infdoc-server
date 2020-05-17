package com.example.infdocserver.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;

import com.example.infdocserver.Domain.Sysgrp;
import com.example.infdocserver.Service.SysgrpService;

import java.util.List;

@RestController
@RequestMapping("/api/sysgrps")
public class SysgrpController {

    @Autowired
    private SysgrpService sysgrpService;

    @GetMapping("list")
    public List<Sysgrp> list(@ModelAttribute Sysgrp sysgrp) {
        return sysgrpService.findAll();
    }

    @PostMapping("create")
    @ResponseStatus(HttpStatus.OK)
    public Sysgrp create(@RequestBody Sysgrp sysgrp) {
        sysgrpService.save(sysgrp);
        return sysgrp;
    }

}
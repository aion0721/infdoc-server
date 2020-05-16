package com.example.infdocserver.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.infdocserver.Domain.Servconfig;
import com.example.infdocserver.Service.ServconfigService;

import java.util.List;

@RestController
@RequestMapping("/servconfigs")
public class ServconfigController {

    @Autowired
    private ServconfigService servconfigService;

    @GetMapping("list")
    public List<Servconfig> index(@ModelAttribute Servconfig servconfig) {
        return servconfigService.findAll();
    }

    @GetMapping("id/{id}")
    public Servconfig findById(@PathVariable Long id, @ModelAttribute Servconfig servconfig) {
        return servconfigService.findOne(id);
    }

    @GetMapping("servid/{servId}")
    public List<Servconfig> findByServId(@PathVariable Long servId, @ModelAttribute Servconfig servconfig) {
        return servconfigService.findByServId(servId);
    }

}
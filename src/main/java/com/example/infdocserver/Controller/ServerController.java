package com.example.infdocserver.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.infdocserver.Domain.Server;
import com.example.infdocserver.Service.ServerService;

import java.util.List;

@RestController
@RequestMapping("/servers")
public class ServerController {

    @Autowired
    private ServerService serverService;

    @GetMapping("list")
    public List<Server> index(@ModelAttribute Server server) {
        return serverService.findAll();
    }

    @GetMapping("id/{id}")
    public Server findById(@PathVariable Long id, @ModelAttribute Server server) {
        return serverService.findOne(id);
    }

    @GetMapping("sysgrpid/{sysgrpId}")
    public List<Server> findBySysgrpId(@PathVariable Long sysgrpId, @ModelAttribute Server server) {
        return serverService.findBySysgrpId(sysgrpId);
    }

}
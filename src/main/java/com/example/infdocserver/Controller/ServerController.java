package com.example.infdocserver.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;

import com.example.infdocserver.Domain.Server;
import com.example.infdocserver.Service.ServerService;

import java.util.List;

@RestController
@RequestMapping("/api/sysgrps/{sysgrpId}/servers")
public class ServerController {

    @Autowired
    private ServerService serverService;

    @GetMapping("list")
    public List<Server> list(@ModelAttribute Server server) {
        return serverService.findAll();
    }

    @GetMapping("{id}")
    public Server findById(@PathVariable Long id, @ModelAttribute Server server) {
        return serverService.findOne(id);
    }

    @GetMapping()
    public List<Server> findBySysgrpId(@PathVariable Long sysgrpId, @ModelAttribute Server server) {
        return serverService.findBySysgrpId(sysgrpId);
    }

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public Server create(@RequestBody Server server) {
        serverService.save(server);
        return server;
    }

}
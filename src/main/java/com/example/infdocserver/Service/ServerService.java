package com.example.infdocserver.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.infdocserver.Domain.Server;
import com.example.infdocserver.Repository.ServerRepository;

@Service
public class ServerService {
    @Autowired
    private ServerRepository serverRepository;

    public List<Server> findAll() {
        return serverRepository.findAll();
    }

    public List<Server> findBySysgrpId(Long sysgrpId) {
        return serverRepository.findBySysgrpId(sysgrpId);
    }

    public Server findOne(Long id) {
        return serverRepository.findById(id).get();
    }

    public Server save(Server server) {
        return serverRepository.save(server);
    }

    public void delete(Long id) {
        serverRepository.deleteById(id);
    }

}
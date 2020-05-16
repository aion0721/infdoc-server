package com.example.infdocserver.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.infdocserver.Domain.Servconfig;
import com.example.infdocserver.Repository.ServconfigRepository;

@Service
public class ServconfigService {

    @Autowired
    private ServconfigRepository servconfigRepository;

    public List<Servconfig> findAll() {
        return servconfigRepository.findAll();
    }

    public List<Servconfig> findByServId(Long servId) {
        return servconfigRepository.findByServId(servId);
    }

    public Servconfig findOne(Long id) {
        return servconfigRepository.findById(id).get();
    }

    public Servconfig save(Servconfig servconfig) {
        return servconfigRepository.save(servconfig);
    }

    public void delete(Long id) {
        servconfigRepository.deleteById(id);
    }
}
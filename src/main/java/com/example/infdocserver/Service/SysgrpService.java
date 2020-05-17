package com.example.infdocserver.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.infdocserver.Domain.Sysgrp;
import com.example.infdocserver.Repository.SysgrpRepository;

@Service
public class SysgrpService {
    @Autowired
    private SysgrpRepository sysgrpRepository;

    public List<Sysgrp> findAll() {
        return sysgrpRepository.findAll();
    }

    public Sysgrp findOne(Long id) {
        return sysgrpRepository.findById(id).get();
    }

    public Sysgrp save(Sysgrp sysgrp) {
        return sysgrpRepository.save(sysgrp);
    }

    public void delete(Long id) {
        sysgrpRepository.deleteById(id);
    }

}
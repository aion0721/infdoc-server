package com.example.infdocserver.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.infdocserver.Domain.Sysgrp;

@Repository
public interface SysgrpRepository extends JpaRepository<Sysgrp, Long> {

}
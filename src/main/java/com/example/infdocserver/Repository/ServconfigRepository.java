package com.example.infdocserver.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.infdocserver.Domain.Servconfig;

import java.util.List;

@Repository
public interface ServconfigRepository extends JpaRepository<Servconfig, Long> {

    List<Servconfig> findByServId(Long servId);

}
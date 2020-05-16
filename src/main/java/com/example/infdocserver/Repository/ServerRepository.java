package com.example.infdocserver.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.infdocserver.Domain.Server;

@Repository
public interface ServerRepository extends JpaRepository<Server, Long> {

}
package com.example.infdocserver.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long sysgrpId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSysgrpId() {
        return sysgrpId;
    }

    public void setSysgrpId(Long sysgrpId) {
        this.sysgrpId = sysgrpId;
    }

    @Override
    public Stirng toString() {
        return "Server (id=" + id + ", name=" + name + ", sysgrpId=" + sysgrpId + ")";
    }

}
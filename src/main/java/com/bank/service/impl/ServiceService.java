package com.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.repository.ServiceRepository;

import java.util.List;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public List<com.bank.entity.Service> getAllServices(){
        return serviceRepository.findAll();
    }
}

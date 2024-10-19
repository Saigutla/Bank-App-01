package com.bank.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bank.entity.Branch;
import com.bank.entity.Service;
import com.bank.service.BranchService;
import com.bank.service.impl.ServiceService;
@Controller
public class BankController {

    @Autowired
    private BranchService branchService;

    @Autowired
    private ServiceService serviceService;
    
    @GetMapping("/branches")
    public String getBranches(Map<String,Object> map){
    	System.out.println("==============================");
        List<Branch> branches = branchService.getAllBranches();
        System.out.println(branches);
        map.put("branches",branches);
        map.put("bankName","SBI");
        return "branches";
    }

    @GetMapping("/services")
    public String getServices(Map<String,Object> map) {
        List<Service> services = serviceService.getAllServices();
        map.put("services", services);
        map.put("bankName", "SBI");
        return "services";
    }
}

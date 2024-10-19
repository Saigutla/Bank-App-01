package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.Branch;
import com.bank.repository.BranchRepository;

import java.util.List;

@Service
public class BranchService {
	@Autowired
	private BranchRepository branchRepository;

	public List<Branch> getAllBranches() {
		return branchRepository.findAll();
	}

}

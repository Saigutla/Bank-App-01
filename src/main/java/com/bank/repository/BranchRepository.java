package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch,Long> {
}

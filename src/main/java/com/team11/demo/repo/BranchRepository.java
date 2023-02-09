package com.team11.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team11.demo.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

}

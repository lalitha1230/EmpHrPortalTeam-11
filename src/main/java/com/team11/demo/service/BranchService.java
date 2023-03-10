package com.team11.demo.service;

import java.util.List;

import com.team11.demo.model.Branch;

public interface BranchService {
	List<Branch> getAllBranches();
	void saveBranch(Branch branch);
	Branch getBranchById(int id);
	void deleteBranchById(int id);
}

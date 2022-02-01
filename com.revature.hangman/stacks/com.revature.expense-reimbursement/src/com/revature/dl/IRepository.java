package com.revature.dl;

import java.util.List;

import com.revature.bl.Solution;

public interface IRepository {
	public void addIssue(Issue newissue);
	List<Issue> getIssues();
	public Issue getIssueById(int id) throws Exception;
	public void addSolution(Solution solution) throws Exception;
	void addSolution1(Solution newSolution) throws Exception;
	void updateSolution(Solution updatedSolution);
	Solution getSolutionById(int id);

}

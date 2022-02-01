package com.revature.bl;

import java.util.List;

import com.revature.dl.Issue;

public interface IIssueBL {

	List<Issue> getIssues();

	void addIssue(Issue newIssue);

	Issue getIssueById(int parseInt) throws Exception;

	void addSolution(Solution solution) throws Exception;

	void upVoteSolution(int id);

	void updateSolution(Solution updatedSolution);

	void updateSolution(Integer solutionId, Integer newUpVote);

}

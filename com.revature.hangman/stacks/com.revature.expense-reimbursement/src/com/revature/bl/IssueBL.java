package com.revature.bl;

import java.util.List;
import com.revature.dl.IRepository;
import com.revature.dl.Issue;

public class IssueBL implements IIssueBL {
	private IRepository repo1;

	public IssueBL(IRepository repo){
		this.repo1 = repo;
	}

	@Override
	public void addIssue(Issue issue) {
		// call my dl
		// call my dl
		repo1.addIssue(issue);
	}

	@Override
	public List<Issue> getIssues() {
		return repo1.getIssues();
	}

	@Override
	public Issue getIssueById(int id) throws Exception {
		// TODO Auto-generated method stub
		return repo1.getIssueById(id);
	}

	@Override
	public void addSolution(Solution solution) throws Exception {
		// TODO Auto-generated method stub
		repo1.addSolution(solution);
	}

	@Override
	public void upVoteSolution(int id) {
		// TODO Auto-generated method stub
		Solution solution2UpVote = repo1.getSolutionById(id);
		int currentUpvote = solution2UpVote.getUpvote();
		try {
			// diff ++x vs x++: both increment x but ++x returns incremented value, x++
			// returns old value, then increments value of x
			// diff ++x vs x++: both increment x but ++x returns incremented value, x++
			// returns old value, then increments value of x
			solution2UpVote.setUpvote(++currentUpvote);
			repo1.updateSolution(solution2UpVote);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateSolution(Solution updatedSolution) {
		// TODO Auto-generated method stub
		repo1.updateSolution(updatedSolution);

	}

	@Override
	public void updateSolution(Integer solutionId, Integer newUpVote) {
		// TODO Auto-generated method stub
		Solution solution2Update = repo1.getSolutionById(solutionId);
		try {
			solution2Update.setUpvote(newUpVote);
			repo1.updateSolution(solution2Update);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}

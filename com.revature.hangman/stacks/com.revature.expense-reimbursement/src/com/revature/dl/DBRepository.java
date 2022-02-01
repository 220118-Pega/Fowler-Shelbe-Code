package com.revature.dl;

import java.util.ArrayList;
import java.util.List;

import com.revature.bl.Solution;
import com.revature.bl.SolutionDAO;
import com.revature.dl.*;


public class DBRepository implements IRepository{
	private DAO<Issue,Integer> issueDAO;
	private DAO<Solution,Integer> solutionDAO;
	
	
	
	public DBRepository(DAO<Issue,Integer> issueDAO, DAO<Solution, Integer> solutionDAO) {
		this.issueDAO = issueDAO;
		this.solutionDAO = solutionDAO;
	}
	@Override
	public void addIssue(Issue newIssue) {
		// TODO Auto-generated method stub
		issueDAO.add(newIssue);
	}

	

	@Override
	public Issue getIssueById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
		
	}

	
	@Override
	public void updateSolution(Solution updatedSolution) {
		// TODO Auto-generated method stub
		solutionDAO.update(updatedSolution);
	}
	@Override
	public Solution getSolutionById(int id) {
		// TODO Auto-generated method stub
		return solutionDAO.findbyId(id);
	}

	@Override
	public List<Issue> getIssues() {
		// TODO Auto-generated method stub
		return issueDAO.findAll();
	}

	@Override
	public void addSolution(Solution solution) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSolution1(Solution newSolution) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
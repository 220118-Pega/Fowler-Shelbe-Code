package com.revature.bl;

import java.util.Scanner;

import com.revature.dl.DBRepository;
import com.revature.dl.IssueDAO;
import com.revature.ui.MainMenu;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainMenu menu = new MainMenu(new Scanner(System.in), new IssueBL(new DBRepository(new IssueDAO(), new SolutionDAO())));
		menu.start();
	}

}
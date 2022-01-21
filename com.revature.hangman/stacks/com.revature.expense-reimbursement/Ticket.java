
package reimbursementrequest;

import java.util.Scanner;

public class Ticket {
	String userId;
	String transactionAmount;
	String date;
	String transactiontype;

	//constructor
//	public Transaction(String userId, String transactionAmount, String date, String transaction type) {
	//	super();
		//this.userId = userId;
		//this.transactionAmount = transactionAmount;
		//this.date = date;
		//this.transactiontype = transaction type;
	//}




	//methods
	@SuppressWarnings("resource")
	public Ticket() {
		System.out.println("Please enter transaction type: ");
		transactiontype = new Scanner(System.in).nextLine();
		System.out.println("Please enter transaction amount: ");
		transactionAmount = new Scanner(System.in).nextLine();
		System.out.println("Please enter transaction date: ");
		date = new Scanner(System.in).nextLine();
	}

	public Ticket(String userId2, String transactionAmount2, String transactionDate, String transactionType2) {
		// TODO Auto-generated constructor stub
		this.userId = userId2;
		this.transactionAmount = transactionAmount;
		this.date = date;
		this.transactiontype = transactiontype;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTransactiontype() {
		return transactiontype;
	}
	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}	}


package com.masai;

public class PaymentPresentation {
	private TransactionService transactionService;

	public TransactionService getTransactionService() {
		return transactionService;
	}

	public void setTransactionService(TransactionService transactionService) {
		this.transactionService = transactionService;
	}

	public void transfer(int i) {
		System.out.println("Activiting payment mode trough secure Payment method....... ");
		System.out.println("Tansfering amount : " + i);
		System.out.println("Amount transfered.");
	}

}

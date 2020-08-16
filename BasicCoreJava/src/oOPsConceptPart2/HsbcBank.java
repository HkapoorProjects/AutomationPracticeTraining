package oOPsConceptPart2;

public class HsbcBank implements USBank, BrazilBank {

	public void Credit() {
		System.out.println("HSBC--Credit");
	}

	public void Debit() {
		System.out.println("HSBC--Debit");
	}

	public void TransferMoney() {
		System.out.println("HSBC--TransferMoney");
	}

	public void EduLoan() {
		System.out.println("HSBC--EduLoan");
	}

	public void CarLoan() {
		System.out.println("HSBC--CarLoan");
	}

	public void SavingBank() {
		System.out.println("HSBC--SavingBank");
	}

}

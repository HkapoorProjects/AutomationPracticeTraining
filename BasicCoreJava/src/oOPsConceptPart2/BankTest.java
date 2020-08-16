package oOPsConceptPart2;

public class BankTest {

	public static void main(String[] args) {

		// Static Polymorphism--Compile time polymorphism

		HsbcBank hb = new HsbcBank();
		hb.Credit();
		hb.Debit();
		hb.TransferMoney();
		hb.EduLoan();
		hb.CarLoan();
		hb.SavingBank();
		// for accessing the min balence
		System.out.println(USBank.Min_Balnc);
		System.out.println("******************");

		// Dymaic Polymorphism--Child class object can be referred by parent interface var.
		USBank ub = new HsbcBank();

		ub.Credit();
		ub.Debit();
		ub.TransferMoney();

	}

}

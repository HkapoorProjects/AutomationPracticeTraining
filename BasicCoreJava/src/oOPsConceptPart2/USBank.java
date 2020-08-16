package oOPsConceptPart2;

public interface USBank {
	int Min_Balnc = 100;

	public void Credit();

	public void Debit();

	public void TransferMoney();

	// Interface doesn't contain Main method
	// Interface doesn't contain method body
	// Interface is called IS-A relationship
	// In interface we declare variable and it is by default static in nature
	// No static method present in the interface
	// In interface while creating a relationship between class and interface we use
	// "implements" keyword.
	// we can not create an object of the interface
	// Interface are abstract in nature.

}

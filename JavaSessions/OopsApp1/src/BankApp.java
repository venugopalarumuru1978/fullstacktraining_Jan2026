
public class BankApp {
	
	public static void main(String[] args)
	{
		Bank b1 = new Bank();
		b1.getCustInfo("Roja", 120000);
		
		Bank b2 = new Bank();
		b2.getCustInfo("Rani", 150000);
		
		b1.PrintCustInfo();
		b2.PrintCustInfo();
		
		System.out.println("--------------");
		
		Bank.PrintBankBal();
	}
}

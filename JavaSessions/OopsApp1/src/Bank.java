
public class Bank {
	private String cname;
	private int Acc_Bal;
	
	private static int Bank_Bal;
	
	void getCustInfo(String cn, int bal)
	{
		cname = cn;
		Acc_Bal = bal;
		
		Bank_Bal = Bank_Bal+bal;
	}
	
	void PrintCustInfo()
	{
		System.out.println("Customer Name : " + cname);
		System.out.println("Account Balance : " + Acc_Bal);
	}
	
	static void PrintBankBal()
	{
		System.out.println("Total Amount In Bank : " + Bank_Bal);
	}
	
}

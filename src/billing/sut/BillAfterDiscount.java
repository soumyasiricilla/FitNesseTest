package billing.sut;

public class BillAfterDiscount {

	public String discount(double bill)
	{
		if(bill>0 && bill<=2000) return "10%";
		else if (bill>2000) return "20%";
		else
			return"0%";
		
	}
public double calculateBillAfterDiscount(double bill) {
		
		if(bill>0 && bill<=1000)
		{
			bill=bill-((bill/100)*10);
		}
		else if (bill>1000)
				{
			bill=bill-((bill/100)*20);
		}
		else 
			bill=0;
		 return (double) bill;
}
}

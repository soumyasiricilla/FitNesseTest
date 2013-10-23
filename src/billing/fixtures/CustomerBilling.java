package billing.fixtures;
import billing.sut.BillAfterDiscount;


public class CustomerBilling {
	private double bill;
	private double billAfterDiscount;
	private String discount;
	private String customerName;
	
	public void execute() { // Execute after each table row
	this.billAfterDiscount = new BillAfterDiscount().calculateBillAfterDiscount(bill);
	this.discount= new BillAfterDiscount().discount(bill);
	}
	public void setName(String name) {
	      this.customerName = name;
	   }
	public void setBill(double bill) { // Set method
	this.bill = bill;
	}
	public double billAfterDiscount() { // Returning function in the test 
		return this.billAfterDiscount;
	}
	public String discount(){
		return this.discount;
	}

}

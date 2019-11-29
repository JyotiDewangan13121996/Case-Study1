package payments;

import java.util.Date;

public class Payments 
{
    private int id ;
    private int userid ;
    private float amount ;
    private String type;
    private Date transaction_time ;
    private Date nextpayment_duedate;
    
    public Payments() 
    {
		
	}

	public Payments(int id, int userid, float amount, String type, Date transaction_time, Date nextpayment_duedate) 
	{
		this.id = id;
		this.userid = userid;
		this.amount = amount;
		this.type = type;
		this.transaction_time = transaction_time;
		this.nextpayment_duedate = nextpayment_duedate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getTransaction_time() {
		return transaction_time;
	}

	public void setTransaction_time(Date transaction_time) {
		this.transaction_time = transaction_time;
	}

	public Date getNextpayment_duedate() {
		return nextpayment_duedate;
	}

	public void setNextpayment_duedate(Date nextpayment_duedate) {
		this.nextpayment_duedate = nextpayment_duedate;
	}
	
	
    
    
}

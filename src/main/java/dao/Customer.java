package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Email;

public class Customer {

	private long id;
	
	private String firstName;
	
	private String lastName;
	
	@Email
	private String email;
	
	private String identityNumber;
	
	private String identityType;
	
	private Date lastOrderDate;
	
	private List<Address> addresses;
	
	private List<BillingInfo> BillingInfos;

	public Customer() {
		
	}
	public Customer(String t) {
		super();
		if(t != null && !t.isEmpty()) {
			this.firstName = t;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getIdentityType() {
		return identityType;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public Date getLastOrderDate() {
		return lastOrderDate;
	}

	public void setLastOrderDate(Date lastOrderDate) {
		this.lastOrderDate = lastOrderDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public void setAddresses(String t) {
		this.addresses =  new ArrayList<Address>();
	}

	public List<BillingInfo> getBillingInfos() {
		return BillingInfos;
	}

	public void setBillingInfos(List<BillingInfo> billingInfos) {
		BillingInfos = billingInfos;
	}
	public void setBillingInfos(String t) {
		this.BillingInfos = new ArrayList<BillingInfo>();
	}
	
	
}

package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Email;

public class Order {
	
	private long id;
	
	private String type;
	
	@Email
	private Customer customer;	
	
	private List<OrderAttribute> orderAttributes;
	
	private List<OrderItem> orderItems;
	
	private Date innitedDate;
	
	private Date finnishedDate;
	
	private User createdBy;
	
	private BillingInfo billingInfo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderAttribute> getOrderAttributes() {
		return orderAttributes;
	}

	public void setOrderAttributes(List<OrderAttribute> orderAttributes) {
		this.orderAttributes = orderAttributes;
	}

	public void setOrderAttributes(String t) {
		this.orderAttributes = new ArrayList<OrderAttribute>();
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public void setOrderItems(String t) {
		this.orderItems = new ArrayList<OrderItem>();
	}
	public Date getInnitedDate() {
		return innitedDate;
	}

	public void setInnitedDate(Date innitedDate) {
		this.innitedDate = innitedDate;
	}

	public Date getFinnishedDate() {
		return finnishedDate;
	}

	public void setFinnishedDate(Date finnishedDate) {
		this.finnishedDate = finnishedDate;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public BillingInfo getBillingInfo() {
		return billingInfo;
	}

	public void setBillingInfo(BillingInfo billingInfo) {
		this.billingInfo = billingInfo;
	}
	
	
}

package com.ogs.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_tbl")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customer Id")
	private int cid;
	@Column(name="Customer Name")
	private String cname;
	@Column(name="Mail Id")
	private String mail;
	@Column(name="Mobile Number")
	private long mobile;
	@OneToOne(cascade = CascadeType.ALL, targetEntity = Order.class)
	@JoinColumn(name="oid")
	private Order order;
	public Customer() {
		super();
		
	}
	public Customer(int cid, String cname, String mail, long mobile, Order order) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mail = mail;
		this.mobile = mobile;
		this.order = order;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mail=" + mail + ", mobile=" + mobile + ", order="
				+ order + "]";
	}
	

}

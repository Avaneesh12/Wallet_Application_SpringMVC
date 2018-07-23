package com.cg.mypaymentapp.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Customer2")
public class Customer implements Serializable {
	private static final long serialVersionUID = 8166615222405189202L;

	
	//@GeneratedValue
	@Id
	@NotEmpty
	@Pattern(regexp="(^$|[0-9]{10})")
	@Size(min=10,max=10)
	private String mobileNo;
	@NotEmpty
	@Pattern(regexp="[^0-9]*")
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="walletID")
	private Wallet wallet;
	
	public Customer() {
		super();
	}
	public Customer(String name2, String mobileNo2, Wallet wallet2) {
		this.name = name2;
		mobileNo = mobileNo2;
		wallet = wallet2;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	
	@Override
	public String toString() {
		return "Customer name=" + name + ", mobileNo=" + mobileNo
				 + wallet;
	}
	
	
}



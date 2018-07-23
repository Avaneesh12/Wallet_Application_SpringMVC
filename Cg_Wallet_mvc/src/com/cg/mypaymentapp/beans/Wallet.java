package com.cg.mypaymentapp.beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.jboss.logging.annotations.Message;

@Entity
public class Wallet implements Serializable {
	private static final long serialVersionUID = 3480868867683830340L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="walletID2")
	private Integer walletID;

	private BigDecimal balance;

	
	public Wallet() {
		super();
	}


	public Wallet(BigDecimal amount) {
		this.balance=amount;
	}


	public BigDecimal getBalance() {
		return balance;
	}


	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return ", balance="+balance;
	}
}

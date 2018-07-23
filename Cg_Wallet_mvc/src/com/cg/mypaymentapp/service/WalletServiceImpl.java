package com.cg.mypaymentapp.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Wallet;
import com.cg.mypaymentapp.repo.WalletRepo;


@Component(value="walletService")
public class WalletServiceImpl implements WalletService {
 
	@Autowired
	WalletRepo repo;
	
	public Customer createAccount(Customer customer)  {
		
		return repo.save(customer);	
	}

	public Customer showBalance(String mobileNo) {
		
		/*Pattern p=Pattern.compile("[0-9]{10}");
		Matcher m=p.matcher(mobileNo);
		
		if(m.find()&& m.group().equals(mobileNo)) {	   
			Customer customer=null;*/
			
		        Customer customer = repo.findOne(mobileNo);
		            
		         /*if(customer!=null)*/
		        	 return customer;
		                    
		        /* else
		             throw new MobileNumberNotRegistered("your mobile number not registered");
		}
		
		else
			throw new InvalidInputException("please correctly enter 10 digit mobile number");*/	
	}
	
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) {
		Customer cust1=repo.findOne(sourceMobileNo);
	Customer cust2=repo.findOne(targetMobileNo);
	if(cust1==null || cust2==null)
		return null;
	cust1.getWallet().setBalance(cust1.getWallet().getBalance().subtract(amount));
	cust2.getWallet().setBalance(cust2.getWallet().getBalance().add(amount));
	repo.save(cust1);
	repo.save(cust2);
	return cust1;
		
		
		
	}
	
	public Customer withdrawAmount(String mobileNo, BigDecimal amount)  {
		Customer customer=repo.findOne(mobileNo);
		if(customer==null)
			return null;
		customer.getWallet().setBalance(customer.getWallet().getBalance().subtract(amount));
		repo.save(customer);
		return customer;
		
		
	}

	@Override
	public List<String> showTransaction(String mobileNo) {
		return null;
		// TODO Auto-generated method stub
	
	}

	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount) {
	Customer customer=repo.findOne(mobileNo);
	if(customer==null)
		return null;
	customer.getWallet().setBalance(customer.getWallet().getBalance().add(amount));
	repo.save(customer);
	return customer;
		
	}
}
package com.cg.mypaymentapp.controllers;

import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.service.WalletService;

@Controller
public class CustomerActionController
{

	@Autowired
	WalletService walletServices;

	@RequestMapping(value="/registerCustomer")
	public ModelAndView registerCustomer(@Valid @ModelAttribute("customer") Customer customer,BindingResult result) {

		try {
			if(result.hasErrors()) return new ModelAndView("registrationPage");
			customer=walletServices.createAccount(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}



		return new ModelAndView("registrationSuccessPage","customer",customer);

	}
	
	@RequestMapping(value="/getCustomer")
	public ModelAndView getCustomer(@ModelAttribute("customer") Customer customer,BindingResult result) {

		try {
			if(result.hasErrors()) return new ModelAndView("loginPage");
			customer=walletServices.showBalance(customer.getMobileNo());
		} catch (Exception e) {
			e.printStackTrace();
		}

      if(customer==null)
    	  return new ModelAndView("loginFailPage","customer",customer);

		return new ModelAndView("loginSuccessPage","customer",customer);

	}
	
	@RequestMapping(value="/depositPage")
	public ModelAndView depositPage(@RequestParam("mobileNo") String mobileNo,@RequestParam("amount") BigDecimal amount) 
	{

		
			Customer customer=walletServices.depositAmount(mobileNo, amount);
			 if(customer==null)
		    	  return new ModelAndView("loginFailPage","customer",customer);
		
		return new ModelAndView("depositSuccessPage","customer",customer);

	}
	
	@RequestMapping(value="/withdrawPage")
	public ModelAndView Page(@RequestParam("mobileNo") String mobileNo,@RequestParam("amount") BigDecimal amount)
	{

		
			Customer customer=walletServices.withdrawAmount(mobileNo, amount);
			 if(customer==null)
		    	  return new ModelAndView("loginFailPage","customer",customer);
				return new ModelAndView("withdrawSuccessPage","customer",customer);

	}
	
	@RequestMapping(value="/transferPage")
	public ModelAndView transferPage(@RequestParam("sourceMobileNumber") String sourceMobileNo,@RequestParam("targetMobileNumber") String targetMobileNo,@RequestParam("amount") BigDecimal amount) {

		
			Customer customer=walletServices.fundTransfer(sourceMobileNo, targetMobileNo, amount);
			 if(customer==null)
		    	  return new ModelAndView("loginFailPage","customer",customer);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("transferSuccessPage");
       mv.addObject("finalbalance",customer.getWallet().getBalance());
       return mv;
	}
}

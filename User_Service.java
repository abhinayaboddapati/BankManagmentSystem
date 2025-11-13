package com.Bank.Service;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.Bank.Entity.User_Information;
import com.Bank.dao.User_Dao;
@Component
public class User_Service 
{
	@Autowired
	Scanner sc;
	@Autowired
	User_Dao user_Dao;
	public void user_Registration()
	{
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the address");
		String address=sc.next();
		System.out.println("enter the pincode");
		int pincode=sc.nextInt();
		System.out.println("enter the Gender");
		String gender=sc.next();
		System.out.println("enter the aadhar number");
		long aadharNumber=sc.nextLong();
		System.out.println("enter the pin");
		int pin=sc.nextInt();
		System.out.println("enter the ifsc code");
		String ifsc=sc.next();
		System.out.println("enter the pan number");
		String number=sc.next();
		System.out.println("enter the amount");
        double amount=sc.nextDouble();
        System.out.println("enter the account number");
        long Accnum=sc.nextInt();
        System.out.println("enter the mail id");
        String mailid=sc.next();
        System.out.println("enter the mobile number");
        long mobilenumber=sc.nextLong();
        User_Information userInformation=new User_Information();
    	userInformation.setName(name);
    	userInformation.setMobileNumber(mobilenumber);
    	userInformation.setEmailid(mailid);
    	userInformation.setAddress(address);
    	userInformation.setGender(gender);
    	userInformation.setAadharNumber(aadharNumber);
    	userInformation.setAccNum(Accnum);
    	userInformation.setPin(pin);
    	userInformation.setIfsccode(ifsc);
    	userInformation.setPanNumber(number);
    	userInformation.setAmount(amount);
		user_Dao.insertUserDetails(userInformation);//DAO method
    	System.out.println("Data Inserted");
		
	}

}

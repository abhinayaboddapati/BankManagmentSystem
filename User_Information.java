package com.Bank.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GenerationTime;
@Entity
public class User_Information 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false,unique = true)
	private long mobileNumber;
	@Column(nullable=false,unique = true)
	private String emailid;
	@Column(nullable=false)
	private String address;
	@Column(nullable=false)
	private String gender;
	@Column(nullable=false,unique = true)
	private long aadharNumber;
	@Column(nullable=false,unique = true)
	private int pin;
	private String ifsccode;
	@Column(nullable=false,unique = true)
	private String panNumber;
	@Column(nullable=false)
	private double amount;
	@Column(nullable=false,unique = true)
	private long AccNum;
	public User_Information() {
		// TODO Auto-generated constructor stub
	}
	public User_Information(int userid, String name, long mobileNumber, String emailid, String address, String gender,
			long aadharNumber, int pin, String ifsccode, String panNumber, double amount,long AccNum) {
		this.userid = userid;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailid = emailid;
		this.address = address;
		this.gender = gender;
		this.aadharNumber = aadharNumber;
		this.pin = pin;
		this.ifsccode = ifsccode;
		this.panNumber = panNumber;
		this.amount = amount;
		this.AccNum=AccNum;
	}
	public long getAccNum() {
		return AccNum;
	}
	public void setAccNum(long accNum) {
		AccNum = accNum;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
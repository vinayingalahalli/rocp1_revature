package com.app.customer.main;

import java.util.List;
import java.util.Scanner;

import com.app.customer.exception.BusinessException;
import com.app.customer.model.Customer;
import com.app.customer.service.CustomerService;
import com.app.customer.service.impl.CustomerServiceImpl;

public class CustomerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch = 0;
		CustomerService service=new CustomerServiceImpl();
		System.out.println("Welcome to Customer App V1.0");
		System.out.println("----------------------------------");
		do {
			System.out.println("Menu");
			System.out.println("=====");
			System.out.println("1)Add Customer");
			System.out.println("2)Update Customer");
			System.out.println("3)Delete Customer");
			System.out.println("4)Search Customer By Id");
			System.out.println("5)Search Customers By Name");
			System.out.println("6)Search Customers By Age");
			System.out.println("7)Search Customer By Contact");
			System.out.println("8)Search Customers By City");
			System.out.println("9)Search Customers By Gender");
			System.out.println("10)List All Customers");
			System.out.println("11)EXIT");
			System.out.println("Enter your choice between 1-11");
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (ch) {
			case 1:System.out.println("Please enter below details to create a customer");
					Customer c=new Customer();
					System.out.println("Enter Name");
					c.setName(sc.nextLine());
					System.out.println("Enter City");
					c.setCity(sc.nextLine());
					System.out.println("Enter gender(m/f/o)");
					c.setGender(sc.nextLine());
					try {
						System.out.println("Enter Age");
					c.setAge(Integer.parseInt(sc.nextLine()));
					}catch(NumberFormatException e) {
						System.out.println("Age cannot be alphabets");
						break;
					}
					System.out.println("Enter Contact");
					c.setContact(Long.parseLong(sc.nextLine()));
				try {
					if(service.addCustomer(c)!=0) {
						System.out.println("Customer Added sucessfully.....");
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:System.out.println("Thanks for your interest.. This is still under construction");

				break;
			case 3:System.out.println("Thanks for your interest.. This is still under construction");

				break;
			case 4:System.out.println("Thanks for your interest.. This is still under construction");

				break;
			case 5:System.out.println("Thanks for your interest.. This is still under construction");

				break;
			case 6:System.out.println("Thanks for your interest.. This is still under construction");

				break;
			case 7:System.out.println("Thanks for your interest.. This is still under construction");

				break;
			case 8:System.out.println("Thanks for your interest.. This is still under construction");

				break;
			case 9:System.out.println("Enter gender(m/f/o) to get the details of customer matching to the gender");
					String gender=sc.nextLine();
				try {
					List<Customer> customersByGenderList=service.getCustomersByGender(gender);
					if(customersByGenderList.size()>0) {
						System.out.println("There are "+customersByGenderList.size()+" customer/s.. Details are ");
						for(Customer c1:customersByGenderList) {
							System.out.println(c1);
						}
					}
				} catch (BusinessException e1) {
					System.out.println(e1.getMessage());
				}
					

				break;
			case 10:try {
					List<Customer> customersList=service.getAllCustomers();
					if(customersList.size()>0) {
						System.out.println("There are "+customersList.size()+" customer/s.. Details are ");
						for(Customer c1:customersList) {
							System.out.println(c1);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}

			break;
			case 11:System.out.println("Thank you for using our Customer App V1.0..............");

				break;

			default:
				System.out.println("Invalid choice... Please enter any option between 1-11 only");
				break;
			}
		} while (ch != 11);

	}

}

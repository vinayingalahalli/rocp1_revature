package com.app.customer.service.impl;

import java.util.List;

import com.app.customer.dao.CustomerDAO;
import com.app.customer.dao.impl.CustomerDAOImpl;
import com.app.customer.exception.BusinessException;
import com.app.customer.model.Customer;
import com.app.customer.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO dao=new CustomerDAOImpl();
	@Override
	public int addCustomer(Customer customer) throws BusinessException {
		int c=0;
		if(!isValidName(customer.getName())) {
			throw new BusinessException("Entered name "+customer.getName()+" is Invalid");
		}else if(!isValidContact(customer.getContact())) {
			throw new BusinessException("Entered contact = "+customer.getContact()+" is Invalid");
		}else if(!isValidGender(customer.getGender())) {
			throw new BusinessException("Entered gender = "+customer.getGender()+" is Invalid");
		}else if(!isValidAge(customer.getAge())) {
			throw new BusinessException("Entered Age = "+customer.getAge()+" is Invalid.. Only Age is valid between 19-44");
		}else {
			//code here for DAO
			c=dao.addCustomer(customer);
		}
		return c;
	}
	
	private boolean isValidName(String name) {
		boolean b=false;
		if(name.matches("[ a-z A-Z]{5,12}")) {
			b=true;
		}
		return b;
	}
	
	private boolean isValidAge(int age) {
		boolean b=false;
		if(age>18 && age<45) {
			b=true;
		}
		return b;
	}
	
	private boolean isValidGender(String gender) {
		boolean b=false;
		if(gender.matches("[mMfFoO]{1}")) {
			b=true;
		}
		return b;
	}
	
	private boolean isValidContact(long contact) {
		boolean b=false;
		if((contact+"").matches("[0-9]{10}")) {
			b=true;
		}
		return b;
	}

	@Override
	public int updateCustomer(int id, long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomer(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> getAllCustomers() throws BusinessException {
		List<Customer> customersList=null;
		customersList=dao.getAllCustomers();
		return customersList;
	}

	@Override
	public Customer getCustomerById(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByContact(long contact) throws BusinessException {
		Customer customer=null;
		if(isValidContact(contact)) {
			customer=dao.getCustomerByContact(contact);
		}else {
			throw new BusinessException("Entered contact - "+contact+" is INVALID");
		}
		return customer;
	}

	@Override
	public List<Customer> getCustomersByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomersByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomersByCity(String city) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomersByGender(String gender) throws BusinessException {
		List<Customer> customersList=null;
		if(!isValidGender(gender)) {
			throw new BusinessException("Entered gender "+gender+" is INVALID....");
		}else {
		customersList=dao.getCustomersByGender(gender);
		}
		return customersList;
	}

}

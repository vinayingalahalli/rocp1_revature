package com.app.customer.dao;

import java.util.List;

import com.app.customer.exception.BusinessException;
import com.app.customer.model.Customer;

public interface CustomerDAO {

	public int addCustomer(Customer customer) throws BusinessException;
	public int updateCustomer(int id, long contact) throws BusinessException;
	public int deleteCustomer(int id) throws BusinessException;
	public List<Customer> getAllCustomers() throws BusinessException;
	public Customer getCustomerById(int id) throws BusinessException;
	public Customer getCustomerByContact(long contact) throws BusinessException;
	public List<Customer> getCustomersByAge(int age) throws BusinessException;
	public List<Customer> getCustomersByName(String name) throws BusinessException;
	public List<Customer> getCustomersByCity(String city) throws BusinessException;
	public List<Customer> getCustomersByGender(String gender) throws BusinessException;
}

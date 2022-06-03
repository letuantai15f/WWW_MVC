package iuh.minh.file.service;

import java.util.List;

import iuh.minh.file.entity.Customer;



public interface CustomerService {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
                   
	public Customer getCustomer(int theId);
	public void deleteCustomer(int theId);
}

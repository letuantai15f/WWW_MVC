package iuh.minh.file.dao;

import java.util.List;

import iuh.minh.file.entity.Customer;



public interface CustomerDAO {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public void deleteCustomer(int id);
	public Customer getCustomer(int id);
}

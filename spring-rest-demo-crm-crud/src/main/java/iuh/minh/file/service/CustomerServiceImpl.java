package iuh.minh.file.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import iuh.minh.file.dao.CustomerDAO;
import iuh.minh.file.entity.Customer;



@Service
public class CustomerServiceImpl implements CustomerService {
    // need to inject customer dao
    @Autowired
    private CustomerDAO customerDAO;
    
    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {
            customerDAO.saveCustomer(theCustomer);    }
 
    @Override
    @Transactional
    public Customer getCustomer(int theId) {
            return customerDAO.getCustomer(theId);   }
    @Override
    @Transactional
    public void deleteCustomer(int theId) {
            customerDAO.deleteCustomer(theId);   }
   
    @Override
    @Transactional
    public List<Customer> getCustomers() {
            return customerDAO.getCustomers();
    }
    
}






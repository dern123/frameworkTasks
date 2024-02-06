package app.task1.services;

import app.task1.dao.CustomerDAO;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO){
        this.customerDAO = customerDAO;
    }
}

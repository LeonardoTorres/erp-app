/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.erp.domain.customer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardo
 */
public class CustomerRepository {
    
    private List<Customer> customerList;

    public CustomerRepository() {
       customerList = new ArrayList<>();
    }
   
    public void save(Customer customer){
        customerList.add(customer);
    }
    
    public List<Customer> list(){
        return customerList;
    }
}

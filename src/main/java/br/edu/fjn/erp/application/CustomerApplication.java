/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.erp.application;

import br.edu.fjn.erp.domain.customer.Customer;
import br.edu.fjn.erp.domain.customer.CustomerRepository;
import br.edu.fjn.erp.domain.customer.CustomerService;

/**
 *
 * @author leonardo
 */
public class CustomerApplication {
 
    private CustomerRepository customerRepository;
    private CustomerService customerService;
       
    public void save(Customer customer){
         if (customerService.validateCpf(customer.getCpf())){
             customerRepository.save(customer);
         }        
    }
}

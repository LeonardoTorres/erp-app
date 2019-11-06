/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.erp.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.erp.annotations.Private;
import br.edu.fjn.erp.domain.customer.Customer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@Controller
@Path("customer")
@Private
public class CustomerController {
    
    @Inject
    private Result result;
    
    @Get("new")
    public void formView(){
       List<String> citiesList = Arrays.asList("Juazeiro", "Abaiara", "Crato", "Barbalha");
       result.include("citiesList", citiesList);
    }
    
    @Post("save")
    public void save(Customer customer){
        System.out.println("Customer " + customer.getAddress().getCity());
        result.include("msgSuccess", "Feito! "
                 + customer.getName() + " salvo com sucesso!" );    
        result.redirectTo(this).formView();       
    }
    
    @Get("list")
    public void list(){
       Customer customer1 = new Customer();
       customer1.setName("João da Silva");
       Customer customer2 = new Customer();
       customer2.setName("Zezim das tapioca");
       Customer customer3 = new Customer();    
       customer3.setName("Mariazinha das tapioca");
       
       List<Customer> customerList = new ArrayList();
       customerList.add(customer1);
       customerList.add(customer2);
       customerList.add(customer3);
       result.include("customerList", customerList);
    }
}






















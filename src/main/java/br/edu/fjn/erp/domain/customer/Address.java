/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.erp.domain.customer;

/**
 *
 * @author leonardo
 */
public class Address {
    
    private String street;
    private String city;

    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }   
}

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
import br.edu.fjn.erp.components.UserSession;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@Controller
@Path("auth")
public class AuthController {
    
    
    @Inject
    private UserSession userSession;
    @Inject
    private Result result;
    
    @Get("signin")
    public void signinView(){
          
    }
    
    @Post("authenticate")
    public void signIn(String userName, String password){
        if(userName.equalsIgnoreCase("joao") 
                && password.equalsIgnoreCase("123")){
            userSession.setUserName(userName);
            result.redirectTo(IndexController.class).index();
        }  
    }
    
    @Get("signout")
    public void signOut(){
      userSession.logout();
      result.redirectTo(this).signinView();
    }
    
}

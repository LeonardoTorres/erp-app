/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.erp.interceptors;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.edu.fjn.erp.annotations.Private;

/**
 *
 * @author leonardo
 */
@Intercepts
public class AuthInterceptor implements Interceptor{

    @Override
    public void intercept(InterceptorStack is, ControllerMethod cm, Object o) 
            throws InterceptionException {
        System.out.println("Interceptor " + cm.getMethod());
    }

    @Override
    public boolean accepts(ControllerMethod cm) {
        return cm.containsAnnotation(Private.class);
    }
    
    
}

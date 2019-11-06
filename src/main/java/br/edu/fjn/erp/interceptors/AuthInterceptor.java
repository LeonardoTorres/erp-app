/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.erp.interceptors;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.edu.fjn.erp.annotations.Private;
import br.edu.fjn.erp.components.UserSession;
import br.edu.fjn.erp.controller.AuthController;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@Intercepts
public class AuthInterceptor implements Interceptor{

    @Inject // new UserSession() ?!
    private UserSession userSession;
    @Inject
    private Result result;
    
    @Override
    public void intercept(InterceptorStack is, ControllerMethod cm, Object o) 
            throws InterceptionException {
        if (userSession.isLogged()){
            is.next(cm, o);
        }else{
           result.redirectTo(AuthController.class).signinView();
        }
    }

    @Override
    public boolean accepts(ControllerMethod cm) {
        return cm.getController()
                 .getType()
                 .isAnnotationPresent(Private.class) 
                    || cm.containsAnnotation(Private.class);
//        
//          return isAnnotationPresentInController(cm, Private.class) 
//                  || isAnnotationPresentInMethod(cm, Private.class);
        
    }
    
    private boolean isAnnotationPresentInController(ControllerMethod cm, 
            Class<Private> annotation){
        return cm.getController()
                 .getType()
                 .isAnnotationPresent(annotation);
    }
    
    private boolean isAnnotationPresentInMethod(ControllerMethod cm, 
            Class<Private> annotation){
        return cm.containsAnnotation(annotation);
    }
    
    
}

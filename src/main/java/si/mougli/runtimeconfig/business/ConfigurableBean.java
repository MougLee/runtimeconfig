/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si.mougli.runtimeconfig.business;

import javax.ejb.Stateless;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 *
 * @author mougli
 */
@Stateless
public class ConfigurableBean {
    
    @Inject
    private Instance<Service> service; 
    
    public String echo() {
        return "Runtime configuration of service: " + service.get().getServiceName();
    }
}
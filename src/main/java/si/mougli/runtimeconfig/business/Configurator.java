/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si.mougli.runtimeconfig.business;

import javax.enterprise.inject.Produces;

/**
 *
 * @author mougli
 */
public class Configurator {
    
    @Produces
    public Service getConfiguredService() {
        // TODO: get values from Database;
        return RuntimeConfigServlet.CONFIG == 1 ? new ServiceMock(System.currentTimeMillis()) : new ServiceTest(System.currentTimeMillis());
    }
}

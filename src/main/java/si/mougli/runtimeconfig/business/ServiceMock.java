package si.mougli.runtimeconfig.business;

import javax.enterprise.inject.Alternative;

/**
 *
 * @author mougli
 */
public class ServiceMock implements Service {

    private long time;

    public ServiceMock(long time) {
        this.time = time;
    }
    
    @Override
    public String getServiceName() {
        return "Mock Service " + time;
    }
}
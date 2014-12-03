package si.mougli.runtimeconfig.business;

/**
 *
 * @author mougli
 */
public class ServiceTest implements Service {
    
    private final long time;

    public ServiceTest(long time) {
        this.time = time;
    }
    
    @Override
    public String getServiceName() {
        return "Test Service " + time;
    }   
}
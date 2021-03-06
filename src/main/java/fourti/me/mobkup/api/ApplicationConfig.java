package fourti.me.mobkup.api;


import javax.ws.rs.core.Application;
import java.util.Set;

/**
 * @author dirceubelem
 */
@javax.ws.rs.ApplicationPath("v1")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {

//        resources.add(ServiceAccount.class);
        resources.add(ServiceBanner.class);
        resources.add(ServiceProduct.class);
        resources.add(ServiceVersion.class);

    }

}
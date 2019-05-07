package fourti.me.mobkup.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("product")
public class ServiceProduct {

    @GET
    @Produces("application/json; charset=utf-8")
    public String getProducts(){
        return "xxx";
    }

}

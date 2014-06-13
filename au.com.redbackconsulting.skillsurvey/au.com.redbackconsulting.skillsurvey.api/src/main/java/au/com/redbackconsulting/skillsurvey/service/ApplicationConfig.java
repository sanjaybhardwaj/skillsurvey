package au.com.redbackconsulting.skillsurvey.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;



import au.com.redbackconsulting.skillsurvey.api.SystemService;
import au.com.redbackconsulting.skillsurvey.api.util.GsonMessageBodyHandler;


public class ApplicationConfig extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public ApplicationConfig() {
        singletons.add(new GsonMessageBodyHandler<>());
        //singletons.add(new UserService());
        singletons.add(new SystemService());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}

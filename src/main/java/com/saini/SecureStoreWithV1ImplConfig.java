package com.saini;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
public class SecureStoreWithV1ImplConfig {

    @Value("#{'${com.saini.server.list}'.split(',')}")
    private List<String> serverlist;

    @Value("#{${com.saini.server.config.params}}")
    private Map<String, String> configParams;

    @Bean
    public SecureStoreAccess secureStoreAccess(){
        return  new SecureStoreImplV1(11011, "user123", "pwd123", serverlist, configParams);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ManageAppDataWithV1Impl manageAppDataWithV1Impl(SecureStoreAccess secureStoreAccess){
        return new ManageAppDataWithV1Impl(secureStoreAccess);
    }

}

package com.saini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecureStoreAccessApplicationRunner {

    public static void main(String[] args){
        ApplicationContext ctx =SpringApplication.run(SecureStoreAccessApplicationRunner.class, args);

        ManageAppDataWithV1Impl manageAppDataWithV1 = (ManageAppDataWithV1Impl) ctx.getBean("manageAppDataWithV1Impl");
        manageAppDataWithV1.storeDate();
        manageAppDataWithV1.getDate();
        manageAppDataWithV1.disconnect();

    }

}

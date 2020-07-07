package com.saini;

import java.util.List;
import java.util.Map;

public class SecureStoreImplV1 implements SecureStoreAccess {

    private int accountId;
    private String username;
    private String password;
    private List<String> serverList;
    private Map<String, String > configParams;

    public SecureStoreImplV1(int accountId, String username, String password, List<String> serverList, Map<String, String> configParams) {
        this.accountId = accountId;
        this.username = username;
        this.password = password;
        this.serverList = serverList;
        this.configParams = configParams;
    }

    @Override
    public void configureServers(int accountId, String username, String password, List<String> serverList, Map<String, String> configParams) {
        System.out.println("Configurations are set... ");
    }

    @Override
    public void connect() {
        configureServers(accountId, username, password, serverList, configParams);
        System.out.println("Connected to servers... ");
    }

    @Override
    public void accessData() {
        System.out.println("Data Accessed... ");
    }

    @Override
    public void putData() {
        System.out.println("Data Inserted... ");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected... ");
    }

}

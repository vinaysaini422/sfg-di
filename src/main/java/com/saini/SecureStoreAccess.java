package com.saini;

import java.util.List;
import java.util.Map;

public interface SecureStoreAccess {

    void configureServers(int accountId, String username, String password, List<String> serverList, Map<String, String> configParams);
    void connect();
    void accessData();
    void putData();
    void disconnect();

}

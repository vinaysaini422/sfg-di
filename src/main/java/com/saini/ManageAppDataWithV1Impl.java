package com.saini;

public class ManageAppDataWithV1Impl {

    SecureStoreAccess secureStore;

    public ManageAppDataWithV1Impl() {
    }

    public ManageAppDataWithV1Impl(SecureStoreAccess secureStore) {
        this.secureStore = secureStore;
    }

    public void  storeDate(){
        secureStore.connect();
        secureStore.putData();
    }

    public void  getDate(){
        secureStore.connect();
        secureStore.accessData();
    }

    public void disconnect(){
        secureStore.disconnect();
    }

    public void init(){
        System.out.println("Init called");
    }

    public void destroy(){
        System.out.println("Destroy called");
    }

}

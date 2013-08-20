package com.snippets.designpatterns.structural.proxy;

import java.util.List;

public class UserServerProxy implements Server {

    private String securityCode = "1111";
    private UserServer userServer = new UserServer();

    public UserServerProxy(String securityCode) {
        verifySecurityCode(securityCode);
    }

    @Override
    public List<String> getUsers() {
        return userServer.getUsers();
    }

    @Override
    public void addUser(String user) {
        userServer.addUser(user);
    }

    @Override
    public boolean userExists(String user) {
        return userServer.userExists(user);
    }

    private void verifySecurityCode(String securityCode) {
        if (securityCode.equals(this.securityCode)) return;
        throw new SecurityException("Wrong security code");
    }
}

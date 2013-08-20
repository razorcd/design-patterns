package com.snippets.designpatterns.structural.proxy;

import java.util.List;

public interface Server {
    List<String> getUsers();
    void addUser(String user);
    boolean userExists(String user);
}

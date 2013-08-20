package com.snippets.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class UserServer implements Server {

    private final List<String> users = new ArrayList<>();

    @Override
    public List<String> getUsers() {
        return users;
    }

    @Override
    public void addUser(String user) {
        users.add(user);
    }

    @Override
    public boolean userExists(String user) {
        return users.contains(user);
    }
}

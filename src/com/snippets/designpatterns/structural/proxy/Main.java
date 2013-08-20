package com.snippets.designpatterns.structural.proxy;

public class Main {

    public static void main(String[] args) {
        Server userServer = new UserServer();

        userServer.addUser("userA");
        System.out.println(userServer.getUsers());
        System.out.println(userServer.userExists("userA"));


        // proxy class limits access to Server class
        Server userServerProxy = new UserServerProxy("1111");

        userServerProxy.addUser("userB");
        System.out.println(userServerProxy.getUsers());
        System.out.println(userServerProxy.userExists("userB"));

        // proxy class limits access to Server class
        Server userServerProxy2 = new UserServerProxy("wrong code");
    }

}

package com.snippets.designpatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        SingletonEagerClass s1 = SingletonEagerClass.getInstance();
        s1.setValue(1);
        SingletonEagerClass s2 = SingletonEagerClass.getInstance();
        s2.setValue(2);

        System.out.println(s1.getClass().getName() + "@" + Integer.toHexString(s1.hashCode()));
        System.out.println(s2.getClass().getName() + "@" + Integer.toHexString(s2.hashCode()));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2); // reference compare


        System.out.println();


        SingletonLazyClass s1lazy = SingletonLazyClass.getInstance();
        s1lazy.setValue(10);
        SingletonLazyClass s2lazy = SingletonLazyClass.getInstance();
        s2lazy.setValue(20);

        System.out.println(s1lazy.getClass().getName() + "@" + Integer.toHexString(s1lazy.hashCode()));
        System.out.println(s2lazy.getClass().getName() + "@" + Integer.toHexString(s2lazy.hashCode()));
        System.out.println(s1lazy);
        System.out.println(s2lazy);
        System.out.println(s1lazy == s2lazy); // reference compare
    }
}

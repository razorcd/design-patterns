package com.snippets.designpatterns.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Child c1 = new Child(1);
        DeepCopyChild dcc1 = new DeepCopyChild(10);

        Resource r1 = new Resource("param1", true, c1, dcc1);

        Resource r1clone = r1.clone();
        Resource r1copy = new Resource(r1);

        System.out.print("Main resource:         ");
        System.out.println(r1);
        System.out.println();
        System.out.print("Clone resource:        ");   // clone will not do deepclone
        System.out.println(r1clone);
        System.out.print("Copy resource:         ");
        System.out.println(r1copy);



        //USING REGISTRY

        PrototypeRegistry prototypeRegistry = PrototypeRegistry.getInstance();
        prototypeRegistry.register("r1", r1);

        Resource r1cloneFromRegistry = prototypeRegistry.getByClone("r1");
        Resource r1copyFromRegistry = prototypeRegistry.getByCopy("r1");

        System.out.print("Clone from registry:   ");
        System.out.println(r1clone);
        System.out.print("Copy from registry:    ");
        System.out.println(r1copy);
    }

}

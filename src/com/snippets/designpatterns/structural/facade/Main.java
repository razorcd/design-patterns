package com.snippets.designpatterns.structural.facade;

import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        FileFacade fileFacade = new FileFacade();
        fileFacade.createFile(Paths.get("test2.txt"), "lorem ipsum....".getBytes());
        System.out.println(fileFacade.fileExists(Paths.get("test2.txt")));

    }
}

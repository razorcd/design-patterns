package com.snippets.designpatterns.structural.decorator;

import java.io.*;

public class MainWithCoreJava {

    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        file.createNewFile();

        //decorator
        OutputStream outputStream = new FileOutputStream(file);

        //decorator
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        dataOutputStream.writeUTF("some text");

        dataOutputStream.close();
        outputStream.close();
    }


}

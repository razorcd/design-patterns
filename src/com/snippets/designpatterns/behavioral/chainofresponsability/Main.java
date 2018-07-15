package com.snippets.designpatterns.behavioral.chainofresponsability;

public class Main {

    public static void main(String[] args) {

        //define the handlers from the chain and link them
        Handler h1 = new Handler1();
        Handler h2 = new Handler2();
        h1.setSuccessor(h2);
        Handler h3 = new Handler3();
        h2.setSuccessor(h3);
        Handler h4 = new Handler() {
            @Override
            public void handleInput(Input input) {
                System.out.println("END");
                successor.ifPresent(s -> s.handleInput(input));   // calling next successor
            }
        };
        h3.setSuccessor(h4);

        // calling first handler of the chain will trigger the linked handlers too
        Input input1 = new Input("A", 1, true);
        Input input2 = new Input("B", 1, false);
        h1.handleInput(input1);
        h1.handleInput(input2);
    }
}

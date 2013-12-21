package com.snippets.designpatterns.behavioral.interpreter;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String context = "Tom, Martin, Jane, Marry and Laura.";  // data that will be interpreted

        Pattern p = Pattern.compile("(Tom|Martin|Jane|Marry|Laura)");
        Matcher m = p.matcher(context);

        // interpret (parses and shows result):
        while (m.find()) {
            System.out.println("Found: " + m.group());
        }


//        StringTokenizer stringTokenizer = new StringTokenizer(context);
//        System.out.println(stringTokenizer.nextToken());

        ////////////////////////////////////////////////////////////////////////////////////////////////


        String context1 = "Tom, Martin, Jane, Marry and Laura.";  // data that will be interpreted

        // AnyMatchExpression
        AnyMatchExpression anyMatchExpression1 = new AnyMatchExpression(context1);   // interpreter class
        String[] interpreterParams1 = new String[]{"Tom", "Laura"};                  // interpreter params
        boolean interpreted1 = anyMatchExpression1.interpret(interpreterParams1);    // interpreter result

        System.out.println("AnyMatch1: '" + context1 + "' has '" + Arrays.toString(interpreterParams1) + "': " + interpreted1);



        String context2 = "Steve and Martin.";                    // data that will be interpreted

        // AnyMatchExpression
        AnyMatchExpression anyMatchExpression2 = new AnyMatchExpression(context2);   // interpreter class
        String[] interpreterParams2 = new String[]{"Jane", "Chris"};                 // interpreter params
        boolean interpreted2 = anyMatchExpression2.interpret(interpreterParams2);    // interpreter result

        System.out.println("AnyMatch2: '" + context2 + "' has '" + Arrays.toString(interpreterParams2) + "': " + interpreted2);



        // AndExpression:  execute same parameters on multiple AnyMatchExpressions with same Context.
        AndExpression andExpression = new AndExpression(anyMatchExpression1, anyMatchExpression2);  // combined interpreter class
        String[] interpreterParams3 = new String[]{"Martin"};                                       // interpreter params
        boolean andInterpreter = andExpression.interpret(interpreterParams3);                       // interpreter result

        System.out.println("AndExpression: '" + context1 + "' AND '"+context2+"' has '" + Arrays.toString(interpreterParams3) + "': " + andInterpreter);
    }
}

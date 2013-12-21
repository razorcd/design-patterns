package com.snippets.designpatterns.behavioral.interpreter;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

// terminal expressions run once. Not recursive.
public class AnyMatchExpression implements Expression {

    private String context;

    /**
     * Constructor with context that will be interpreted.
     * @param context the string to interpret.
     */
    public AnyMatchExpression(String context) {
        this.context = context;
    }

    /**
     * Checks if any interpretParams string tokens are present in context string.
     *
     * @param interpretParams params as array of string tokens
     * @return [boolean] if any interpretParams are present in context
     */
    @Override
    public boolean interpret(String[] interpretParams) {
        String regex = Arrays.stream(interpretParams).collect(Collectors.joining("|"));
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(context);
        return m.find(); // find one and move cursor
    }
}

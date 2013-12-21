package com.snippets.designpatterns.behavioral.interpreter;


public class AndExpression implements Expression {

    private Expression expression1;
    private Expression expression2;

    /**
     * Creates new AND interpreter between 2 other interpreters.
     * @param expression1
     * @param expression2
     */
    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String[] interpretParams) {
        return expression1.interpret(interpretParams) && expression2.interpret(interpretParams);
    }
}

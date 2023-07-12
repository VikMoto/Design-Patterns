package org.patterns.behavioral.interpreter;

public class TerminalExpression implements Expression{
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String context) {
        if (context.contains(data)) return true;
        else return false;
    }
}

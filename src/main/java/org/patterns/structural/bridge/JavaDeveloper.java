package org.patterns.structural.bridge;

public class JavaDeveloper  implements Developer{
    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper write Java code...");
    }
}

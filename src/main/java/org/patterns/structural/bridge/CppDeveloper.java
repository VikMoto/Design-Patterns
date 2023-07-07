package org.patterns.structural.bridge;

public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("C++ Developer write C++ code...");
    }
}

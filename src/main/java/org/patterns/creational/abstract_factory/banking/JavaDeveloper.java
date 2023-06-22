package org.patterns.creational.abstract_factory.banking;

import org.patterns.creational.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write code...");
    }
}

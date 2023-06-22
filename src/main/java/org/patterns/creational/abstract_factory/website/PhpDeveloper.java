package org.patterns.creational.abstract_factory.website;

import org.patterns.creational.abstract_factory.Developer;

import java.lang.annotation.Annotation;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer write code on php...");
    }
}

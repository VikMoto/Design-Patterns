package org.patterns.creational.abstract_factory.website;

import org.patterns.creational.abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester is testing code...");
    }
}

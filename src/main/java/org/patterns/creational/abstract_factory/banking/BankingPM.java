package org.patterns.creational.abstract_factory.banking;

import org.patterns.creational.abstract_factory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM is managing project...");
    }
}

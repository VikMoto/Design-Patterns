package org.patterns.creational.abstract_factory;

import org.patterns.creational.abstract_factory.banking.BankTeamFactory;

public class BankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        Tester tester = projectTeamFactory.getTester();

        System.out.println("Creating BankSystem project...");
        developer.writeCode();
        projectManager.manageProject();
        tester.testCode();
    }
}

package org.patterns.creational.abstract_factory;

import org.patterns.creational.abstract_factory.banking.BankTeamFactory;

public class BankSystem {
    public static void main(String[] args) {
        BankTeamFactory bankTeamFactory = new BankTeamFactory();
        Developer developer = bankTeamFactory.getDeveloper();
        ProjectManager projectManager = bankTeamFactory.getProjectManager();
        Tester tester = bankTeamFactory.getTester();

        System.out.println("Creating BankSystem project...");
        developer.writeCode();
        projectManager.manageProject();
        tester.testCode();
    }
}

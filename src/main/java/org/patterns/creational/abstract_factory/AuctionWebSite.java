package org.patterns.creational.abstract_factory;

import org.patterns.creational.abstract_factory.website.WebSiteTeamFactory;

public class AuctionWebSite {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactoryy = new WebSiteTeamFactory();

        Developer developer = projectTeamFactoryy.getDeveloper();
        ProjectManager projectManager = projectTeamFactoryy.getProjectManager();
        Tester tester = projectTeamFactoryy.getTester();

        System.out.println("Creating website project...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}

package org.patterns.creational.abstract_factory;

import org.patterns.creational.abstract_factory.website.WebSiteTeamFactory;

public class AuctionWebSite {
    public static void main(String[] args) {
        WebSiteTeamFactory webSiteTeamFactory = new WebSiteTeamFactory();
        Developer developer = webSiteTeamFactory.getDeveloper();
        ProjectManager projectManager = webSiteTeamFactory.getProjectManager();
        Tester tester = webSiteTeamFactory.getTester();

        System.out.println("Creating website project...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}

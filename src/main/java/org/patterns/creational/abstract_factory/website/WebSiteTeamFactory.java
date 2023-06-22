package org.patterns.creational.abstract_factory.website;

import org.patterns.creational.abstract_factory.Developer;
import org.patterns.creational.abstract_factory.ProjectManager;
import org.patterns.creational.abstract_factory.ProjectTeamFactory;
import org.patterns.creational.abstract_factory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }
}

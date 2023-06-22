package org.patterns.creational.abstract_factory.banking;

import org.patterns.creational.abstract_factory.Developer;
import org.patterns.creational.abstract_factory.ProjectManager;
import org.patterns.creational.abstract_factory.ProjectTeamFactory;
import org.patterns.creational.abstract_factory.Tester;

public class BankTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }
}

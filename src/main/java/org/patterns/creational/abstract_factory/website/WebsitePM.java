package org.patterns.creational.abstract_factory.website;

import org.patterns.creational.abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM managing project...");
    }
}

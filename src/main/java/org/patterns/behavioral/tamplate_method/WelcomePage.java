package org.patterns.behavioral.tamplate_method;

public class WelcomePage extends WebsiteTemplate{

    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}

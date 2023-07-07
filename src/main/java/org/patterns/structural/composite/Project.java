package org.patterns.structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstDeveloper = new  JavaDeveloper();
        Developer secondDeveloper = new  JavaDeveloper();
        Developer cppDeveloper = new  CppDeveloper();

        team.addDeveloper(firstDeveloper);
        team.addDeveloper(secondDeveloper);
        team.addDeveloper(cppDeveloper);

        team.createProject();

    }
}

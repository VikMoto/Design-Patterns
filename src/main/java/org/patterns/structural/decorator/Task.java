package org.patterns.structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer developer2 = new JavaTeamLead(new JavaDeveloper());
        Developer developer3 = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
        System.out.println(developer2.makeJob());
        System.out.println(developer3.makeJob());
    }
}

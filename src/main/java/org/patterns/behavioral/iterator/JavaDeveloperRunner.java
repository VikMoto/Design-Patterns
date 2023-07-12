package org.patterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Gradle", "Postgres" };
        JavaDeveloper javaDeveloper = new JavaDeveloper("Hans", skills);
        Iterator iterator = javaDeveloper.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

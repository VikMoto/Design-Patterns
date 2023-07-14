package org.patterns.behavioral.memento;



public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);

        System.out.println("saving current version to Github");
        githubRepo.setSave(project.save());

        System.out.println("Updating project to Version 1.1");

        System.out.println("Writing poor code...");
        Thread.sleep(5000L);
        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong....");

        System.out.println("Rolling back to version 1.0...");

        project.load(githubRepo.getSave());
        System.out.println("Project after rollback");
        System.out.println(project);


    }
}

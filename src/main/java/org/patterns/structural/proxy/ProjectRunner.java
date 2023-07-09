package org.patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args){
        String url = "https://www.github.com/regraeh/realproject";
//        Project project = new RealProject(url);
        Project project = new ProxyProject(url);
        project.run();
    }
}

package org.patterns.structural.fasad;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solveing problems...");
        }else {
            System.out.println("Developer is reading Dou...");
        }
    }
}

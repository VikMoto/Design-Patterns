package org.patterns.structural.fasad;

public class SprintRunner {
    public static void main(String[] args) {
//        Job job = new Job();
//        job.doJob();
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.startSprint();
//        Developer developer = new Developer();
//        developer.doJobBeforeDeadline(bugTracker);
        /** 2 rows instead 6 upper rows !!!*/
        WorkFlowFasad workFlowFasad = new WorkFlowFasad();
        workFlowFasad.solveProblems();

//        bugTracker.stopSprint();
//        developer.doJobBeforeDeadline(bugTracker);

    }
}

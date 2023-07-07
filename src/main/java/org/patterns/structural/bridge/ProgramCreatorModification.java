package org.patterns.structural.bridge;



public class ProgramCreatorModification {
    public static void main(String[] args) {
        Program [] programs = new Program[]{
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }

}

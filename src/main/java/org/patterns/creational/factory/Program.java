package org.patterns.creational.factory;

class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = new CppDeveloperFactory();
        Developer developer = factory.createDeveloper();
        developer.writeCode();

        DeveloperFactory factoryBySpeciality = createDeveloperBySpeciality("python");
        Developer developer2 = factoryBySpeciality.createDeveloper();
        developer2.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if(speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        }else if (speciality.equalsIgnoreCase("python")) {
            return new PythonDeveloperFactory();
        }else {
            throw new RuntimeException(speciality + " is invalid speciality.");
        }
    }
}

package org.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed{
    List<String> vacancies = new ArrayList<>();
    List<Observer> subscriber = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        subscriber.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscriber.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscriber) {
            observer.handleEvent(this.vacancies);
        }
    }
}

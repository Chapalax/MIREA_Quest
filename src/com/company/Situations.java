package com.company;

public class Situations {
    private Answer[][] answers;
    private Persons[] persons;

    public void setPersons(Persons[] persons) {
        this.persons = persons;
    }

    public Persons[] getPersons() {
        return persons;
    }

    public Answer[][] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[][] answers) {
        this.answers = answers;
    }

}

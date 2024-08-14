package se.lexicon.exceptions.workshop.domain;

public enum Gender {
	MALE,FEMALE;

    public String toString(){
        return this.name().toLowerCase();
    }
}

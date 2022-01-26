package com.company;

public class Author {
    private String firstName;
    private String lastName;

    public Author( String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAuthorFirstName () {
        return this.firstName;
    }
    public String getAuthorLastName () {
        return this.lastName;
    }

    public String getFullAuthorsName () {
        return this.firstName + " " + this.lastName;
    }
}
package com.company;

public class Book {
    private String bookName;
    private Author author;
    private Integer publicationYear;

    public Book (String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookName () {
        return this.bookName;
    }

    public Author getAuthor () {
        return this.author;
    }

    public int getPublicationDate () {
        return this.publicationYear;
    }

    public void setPublicationYear (int year) {
        this.publicationYear = year;
    }

    public String getFullBookDescription () {
        return this.bookName + " by " + this.getAuthor().getAuthorFirstName()
                + " " + this.getAuthor().getAuthorLastName()
                + " published on " + this.publicationYear + ".";
    }

}
package test;

import author.Author;
import book.Book;

public class Test {
    public static void main(String[] args) {
        Author author = new Author("real","nodady@gmail.com",'m');
        System.out.println(author);

        Book dummyBook = new Book("Java for dummy",author,5.0,1);
        System.out.println(dummyBook);

        Book java = new Book("java",author,15.6,1);
        System.out.println(java.getAuthor().getName());
    }


}

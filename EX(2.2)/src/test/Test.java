package test;

import author.Author;
import book.Book;

public class Test {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Annie","yasuo@gmail.com",'m');
        authors[1] = new Author("Zed","zed@gmail.com",'f');

        Book javaDummy = new Book("java",authors,5.9,2);
        System.out.println(javaDummy);
    }
}

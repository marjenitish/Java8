package com.marje.Lambda.Example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class BookService {

    public List<Book> getBooksInSort(){
        List<Book> booksList = new BookDao().getBooks();
        Collections.sort(booksList, (o1, o2) -> o1.getName().compareTo(o1.getName()));
        return booksList;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}


/* Traditional Way

    public class BookService {

    public List<Book> getBooksInSort(){
        List<Book> booksList = new BookDao().getBooks();
        Collections.sort(booksList, new MyComparator());
        return booksList;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}

class MyComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
*/

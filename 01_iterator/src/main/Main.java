package main;

import design_pattern.Book;
import design_pattern.BookShelf;
import design_pattern.Iterator;

/**
 * 動作を確認するクラス
 * 
 * @author hryk
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("BOOK A"));
        bookShelf.appendBook(new Book("BOOK B"));
        bookShelf.appendBook(new Book("BOOK C"));
        bookShelf.appendBook(new Book("BOOK D"));
        
        Iterator it = bookShelf.iterator();
        
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}

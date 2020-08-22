package operation;

import book.Book;
import book.BookList;

/**
 * @program: TestBook
 * @description
 * @author: sun
 * @create: 2020-08-22 18:57
 **/
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}

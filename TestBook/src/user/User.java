package user;

import book.BookList;
import operation.IOperation;

/**
 * @program: TestBook
 * @description
 * @author: sun
 * @create: 2020-08-22 19:06
 **/
public abstract class User {
    protected String name;

    protected IOperation[] operations;

    public User(String name){
        this.name = name;
    }

    public abstract int menu();
    public void doOperation(BookList bookList,int choice){
        this.operations[choice].work(bookList);
    }
}

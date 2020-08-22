package operation;

import book.BookList;

/**
 * @program: TestBook
 * @description
 * @author: sun
 * @create: 2020-08-22 18:57
 **/
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);

    }
}

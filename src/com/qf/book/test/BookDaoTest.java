package com.qf.book.test;

import com.qf.book.dao.BookDao;
import com.qf.book.dao.impl.BookDaoImpl;
import com.qf.book.domain.Book;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author wgy
 * @version V1.0
 * @Project day34_commons_dbutils
 * @Package com.qf.book.test
 * @Description: ${TODO}
 * @Date 2021/4/13 10:22
 */
public class BookDaoTest{

    public static void main(String[] args) throws Exception{
        BookDao bookDao=new BookDaoImpl();
        List<Book> books = bookDao.selectAll();
        //List<Book> books = bookDao.selectByTitle("java");
        for (Book book : books) {
            System.out.println(book.toString());
        }
        System.out.println("-------------");
        Book book = bookDao.selectById(10);
        System.out.println(book.toString());
        System.out.println("--------------");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        //bookDao.insert(new Book(0, "天龙八部", "金庸", sdf.parse("1990-1-10"), "清华出版社", "12311234", new BigDecimal(100),"" ,10 ));
        //System.out.println("添加成功");
//        bookDao.update(new Book(14, "天龙八部2", "金庸", sdf.parse("1990-1-10"), "清华出版社", "12311234", new BigDecimal(100),"" ,10 ));
//        System.out.println("更新成功");
        bookDao.delete(15);
        System.out.println("删除成功");
        long count = bookDao.selectCount();
        System.out.println("数据个数:"+count);
    }
}

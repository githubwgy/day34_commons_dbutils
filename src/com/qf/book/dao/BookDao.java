package com.qf.book.dao;

import com.qf.book.domain.Book;

import java.util.List;

/**
 * @author wgy
 * @version V1.0
 * @Project day34_commons_dbutils
 * @Package com.qf.book.dao
 * @Description: ${TODO}
 * @Date 2021/4/13 10:05
 */
public interface BookDao {
    //查询所有书籍
    List<Book> selectAll();
    //根据书名查询
    List<Book> selectByTitle(String title);
    //根据id查询
    Book selectById(int bookId);

    //添加
    void insert(Book book);

    //更新
    void update(Book book);

    //删除
    void delete(int bookId);

    //查询书籍个数

    long selectCount();
}

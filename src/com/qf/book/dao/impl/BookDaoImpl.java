package com.qf.book.dao.impl;

import com.qf.book.dao.BookDao;
import com.qf.book.domain.Book;
import com.qf.book.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author wgy
 * @version V1.0
 * @Project day34_commons_dbutils
 * @Package com.qf.book.dao.impl
 * @Description: ${TODO}
 * @Date 2021/4/13 10:07
 */
public class BookDaoImpl implements BookDao {
    private QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
    @Override
    public List<Book> selectAll() {
        //1创建QueryRunner对象
        try {
            return qr.query("select * from book", new BeanListHandler<>(Book.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Book> selectByTitle(String title) {
       // QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
        try {
            return qr.query("select * from book where title like ?", new BeanListHandler<>(Book.class),"%"+title+"%");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Book selectById(int bookId) {
        try {
            return qr.query("select * from book where id=?", new BeanHandler<>(Book.class),bookId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insert(Book book) {
        Object[] params={book.getTitle(),book.getAuthor(),book.getPublishDate(),book.getPublisher(),book.getIsbn(),book.getPrice(),book.getPicture(),book.getCid()};
        try {
            qr.update("insert into book values(null,?,?,?,?,?,?,?,?)",params);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void update(Book book) {
        Object[] params={book.getTitle(),book.getAuthor(),book.getPublishDate(),book.getPublisher(),book.getIsbn(),book.getPrice(),book.getPicture(),book.getCid(),book.getId()};
        try {
            qr.update("update book set title=?,author=?,publishDate=?,publisher=?,isbn=?,price=?,picture=?,cid=? where id=?",params);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void delete(int bookId) {
        try {
            qr.update("delete from book where id=?",bookId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public long selectCount() {
        try {
            return qr.query("select count(*) from book", new ScalarHandler<>());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void show() {

    }

    public void heihei(){

    }
}

package com.qf.book.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wgy
 * @version V1.0
 * @Project day34_commons_dbutils
 * @Package com.qf.book.domain
 * @Description: ${TODO}
 * @Date 2021/4/13 10:03
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private Date publishDate;
    private String publisher;
    private String isbn;
    private BigDecimal price;
    private String picture;
    private int cid;

    public Book(int id, String title, String author, Date publishDate, String publisher, String isbn, BigDecimal price, String picture, int cid) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.publisher = publisher;
        this.isbn = isbn;
        this.price = price;
        this.picture = picture;
        this.cid = cid;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishDate=" + publishDate +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", cid=" + cid +
                '}';
    }
}

package com.example.jissen.practice.chap4;

import java.util.Date;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public String getTitle() {
        return title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public String getComment() {
        return comment;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if (!(o instanceof Book)) return false;
        var b = (Book) o;
        // 書名と発行日が同じならばtrue
        if (this.title.equals(b.title) && this.publishDate.equals(this.publishDate)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = 37;
        result = result * 31 + title.hashCode();
        result + result * 31 + hp;
        return result;
    }
    
    @Override
    public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);
    }

    public Book clone() {
        var newBook = new Book();
        newBook.title = this.title;
        newBook.publishDate = (Date) this.publishDate.clone();
        newBook.comment = this.comment;
    }
}

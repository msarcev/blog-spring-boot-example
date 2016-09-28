package com.exo.web.model;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="POST")
public class Post {
    private int id;
    private int accountId;
    private String title;
    private String body;
    private java.sql.Date sql_Date;

    @Id
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "accountId")
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Basic
    @Column(name = "datetime")
    public Date getDatetime() {
        return sql_Date;
    }

    public void setDatetime(java.util.Date util_Date) {
        this.sql_Date = new java.sql.Date( util_Date.getTime() );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (id != post.id) return false;
        if (accountId != post.accountId) return false;
        if (title != null ? !title.equals(post.title) : post.title != null) return false;
        if (body != null ? !body.equals(post.body) : post.body != null) return false;
        if (sql_Date != null ? !sql_Date.equals(post.sql_Date) : post.sql_Date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + accountId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (sql_Date != null ? sql_Date.hashCode() : 0);
        return result;
    }
}

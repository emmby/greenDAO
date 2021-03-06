package de.greenrobot.daoexample;

import de.greenrobot.dao.HasId;
// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table NOTE.
 */
public class Note implements HasId<Long> {

    private Long id;
    /** Not-null value. */
    private String text;
    private String comment;
    private java.util.Date date;

    public Note() {
    }

    public Note(Long id) {
        this.id = id;
    }

    public Note(Long id, String text, String comment, java.util.Date date) {
        this.id = id;
        this.text = text;
        this.comment = comment;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    /** Not-null value. */
    public Long getId( Long defaultValue ) {
        final Long val = getId();
        return val != null ? val : defaultValue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getText() {
        return text;
    }

    /** Not-null value. */
    public String getText( String defaultValue ) {
        final String val = getText();
        return val != null ? val : defaultValue;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setText(String text) {
        this.text = text;
    }

    public String getComment() {
        return comment;
    }

    /** Not-null value. */
    public String getComment( String defaultValue ) {
        final String val = getComment();
        return val != null ? val : defaultValue;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public java.util.Date getDate() {
        return date;
    }

    /** Not-null value. */
    public java.util.Date getDate( java.util.Date defaultValue ) {
        final java.util.Date val = getDate();
        return val != null ? val : defaultValue;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

}

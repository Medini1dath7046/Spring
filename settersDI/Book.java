/**
 * 
 */
package com.bridgelabz.settersDI;

/**
 * Created By:Medini P.D 
 * Date:- 27/06/2018 
 * Purpose:pojo file of the book
 */
public class Book {

	private int id;

	private String bookName;

	private String author;
    public Book()
    {
    	
    }
    public Book(int id)
    {
    	this.id=id;
    }
    public Book(String bookname)
    {
    	this.bookName=bookname;
    }
	public int getId() {

		return id;

	}
public Book(int id, String bookname)
{
	this.id=id;
	this.bookName=bookname;
}
	public void setId(int id) {

		this.id = id;

	}

	public String getBookName() {

		return bookName;

	}

	public void setBookName(String bookName) {

		this.bookName = bookName;

	}

	public String getAuthor() {

		return author;

	}

	public void setAuthor(String author) {

		this.author = author;

	}

	void display() {

		System.out.println(id + " " + bookName + " " + author);

	}

}

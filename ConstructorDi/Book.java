/**
 * 
 */
package com.bridgelabz.ConstructorDi;

/**
 * Created By:Medini P.D 
 * Date:- 12/06/2018 
 * Purpose:pojo file of the book
 */
public class Book {

	private int id;

	private String bookName;

	public Book() {
		System.out.println("Java");
	}

	public Book(int id) {
		this.id = id;
	}
public Book(int id, String bookname)
{
	this.id=id;
	this.bookName=bookname;
}
	public Book(String bookName) {
		this.bookName = bookName;
	}
	void display() {

		System.out.println(id + " " + bookName);

	}

}
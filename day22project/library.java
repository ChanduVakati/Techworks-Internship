// Library Management System: Create classes for "Book" and "Author" that represent books and authors in a library. The Book class should have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor. The Author class should have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook.

import java.util.Scanner;

class Books
{
String title;
String author;
String isbn;
String publisher;
 
void getDetails()
{
System.out.println(" Book title is " +title);
System.out.println(" Book authoris " +author);
System.out.println(" Book isbn is " +isbn);
System.out.println(" Book publisher is " +publisher);
}
 
void setDetails()
{
  
System.out.println("enter deatils of a book");
Scanner s=new Scanner(System.in); 
  
System.out.println("enter book title");
title=s.nextLine();
  
System.out.println("enter book author");
author=s.nextLine();
  
System.out.println("enter book isbn");
isbn=s.nextLine();
  
System.out.println("enter book publisher");
publisher=s.nextLine();
  
}
 
}
 
class Author
{
String name;
String email;
String listofbooks[]={"a","b"};
  
void getDetails()
{
  
System.out.println(" author name is " +name);
System.out.println(" author eamil is " +email);
System.out.println(" Books written by this autor is ");
  
}
  
void setDetails()
{
System.out.println("enter deatils of an author");
Scanner s=new Scanner(System.in);
System.out.println("enter author name");
name=s.nextLine();
  
System.out.println("enter author email ");
email=s.nextLine();
  
}
 
}
 
class LibrayManagement
{
public static void main(String a[])
{
Books b=new Books();
b.setDetails();
b.getDetails();
Author A=new Author();
A.setDetails();
A.getDetails();
}
}
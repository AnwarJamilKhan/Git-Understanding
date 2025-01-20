package org.example;

 class Book {

    static int totalNoOfBooks;
    String title,author,isbn;
    boolean isBorrowed;

    //Object Init
    static {
       totalNoOfBooks = 0;
    }
    {
       totalNoOfBooks++;
    }

    Book(String title,String author, String isbn)
    {
         this.author = author;
         this.isbn = isbn;
         this.title = title;
    }
    Book(String isbn)
    {
       this(isbn,"Unknown","Unknown");
    }
    public static void getTotalBooks()
    {

    }

    public void borrowBook()
    {
       if(isBorrowed)
       {
          System.out.println("Book is Already Borrowed ");
       }
       else
       {
          this.isBorrowed = true;
          System.out.println("Enjoy the Book " + this.title);
       }

    }

    public void returnBook()
    {
      if (isBorrowed)
      {
         this.isBorrowed = false;
         System.out.println("Hope you enjoyed the book, Please leave a review");
      }
      else{
         System.out.println("This book is already in the Library");
      }
    }
    static int getTotalNumberOfBooks()
    {
       return totalNoOfBooks;
    }

    public static void main(String[] args) {

       Book designofThing = new Book("Ibna Batota","Bill Khan", "AJK786");
       Book myBook = new Book("SK456");
       System.out.println(Book.getTotalNumberOfBooks());
       designofThing.borrowBook();
       myBook.borrowBook();
       designofThing.borrowBook();
       designofThing.returnBook();
       designofThing.returnBook();
    }

}

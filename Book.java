class Book {
    private int bookId;
    private String bookName;
    private double price;

    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Name: " + bookName + ", Price: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return bookId == book.bookId && Double.compare(book.price, price) == 0 && bookName.equals(book.bookName);
    }
}

class BookDriver {
    public static void main(String[] himanshu) {
        Book book1 = new Book(1, "Book A", 1250);
        Book book2 = new Book(2, "Book B", 1575);

        if (book1.getPrice() > book2.getPrice()) {
            System.out.println("Book 1 is more expensive: ");
            System.out.println(book1);
        } else if (book1.getPrice() < book2.getPrice()) {
            System.out.println("Book 2 is more expensive: ");
            System.out.println(book2);
        } else {
            System.out.println("Both books have the same price.");
            System.out.println("Book 1: " + book1);
            System.out.println("Book 2: " + book2);
        }
    }
}


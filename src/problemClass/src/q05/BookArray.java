package q05;

import java.util.Scanner;

class Book{
    String title, author;
    public Book(String title, String author) { // 생성자
        this.title = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Book [] book = new Book[2]; // Book 배열 선언
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<book.length; i++) {
            System.out.print("제목은>>");
            String title = scanner.nextLine();
            System.out.print("저자는>>");
            String author = scanner.nextLine();
            book[i] = new Book(title, author);

        }
        for (Book value : book) System.out.println("(" + value.title + ", " + value.author + ")");

        scanner.close();
    }
}

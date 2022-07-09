package lesson11;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();
        System.out.println("������� ��������� �����: ");
        title.setTitle(scanner.next());
        System.out.println("������� ��� ������: ");
        author.setAuthor(scanner.next());
        System.out.println("������� ����� �����: ");
        content.setContent(scanner.next());
        author.show();
        title.show();
        content.show();
    }
}
class Title {
    public String title;

    void setTitle(String title) {
        this.title = title;
    }
    void show() {
        System.out.println("��������� �����: " + title);
    }
}
class Author {
    public String author;

    public void setAuthor(String author) {
        this.author = author;
    }
    void show() {
        System.out.println("��� ������: " + author);
    }
}
class Content {
    public String content;
    public void setContent(String content) {
        this.content = content;
    }
    void show() {
        System.out.println("����� �����: " + content);
    }
}



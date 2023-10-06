package lab2;

import lab2.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Dostoevskiy", "dostoevsky@gmail.com", 'm');
        System.out.println("Author name is "+author.getName());
        System.out.println("Author email is "+author.getEmail());
        if(author.getGender()=='m')
            System.out.println("Author is male");
        else
            System.out.println("Author is female");
        System.out.println(author);
    }
}

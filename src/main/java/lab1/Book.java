package lab1;

public class Book {
    private String name;
    private String author;
    private int yearOfRelease;
    private int pagesCount;
    public Book(String name, String author, int yearOfRelease, int pagesCount){
        this.name = name;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
        this.pagesCount = pagesCount;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getYearOfRelease(){
        return this.yearOfRelease;
    }
    public int getPagesCount(){
        return this.pagesCount;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYearOfRelease(int yearOfRelease){
        this.yearOfRelease = yearOfRelease;
    }
    public void setPagesCount(int pagesCount){
        this.pagesCount = pagesCount;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", pagesCount=" + pagesCount +
                '}';
    }
    public void hoursToRead(){
        float hoursNeeded = ((float) this.pagesCount)/60;
        System.out.println("To read this book you need to have "+hoursNeeded+" hours to read");
    }
}

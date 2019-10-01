package AhmadMalik;

public class Article extends ReadingMaterials{
    private String author;
    private String publisher;
    private String genre;
    public Article(String name, int noPage, String language, String access, String author, String publisher, String genre) {
        super(name, noPage, language, access);
        this.author=author;
        this.publisher= publisher;
        this.genre= genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }
    public void disp(){
        System.out.println("NAME: "+getName());
        System.out.println("NO OF PAGES: "+ getNoPage());
        System.out.println("LANGUAGE :"+getLanguage());
        System.out.println("MODE OF ACCESS: "+getAccess());
        System.out.println("AUTHOR NAME: "+getAuthor());
        System.out.println("PUBLISHER :"+ getPublisher());
        System.out.println("GENRE: "+getGenre());
    }
}

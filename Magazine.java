package AhmadMalik;

public class Magazine extends ReadingMaterials {
    private String publisher;
    private String genre;
    public Magazine(String name, int noPage, String language, String access, String publisher, String genre) {
        super(name, noPage, language, access);
        this.publisher=publisher;
        this.genre=genre;
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
        System.out.println("PUBLISHER NAME: "+getPublisher());
        System.out.println("GENRE: "+getGenre());
    }
}

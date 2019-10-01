package AhmadMalik;

public class TextBook extends ReadingMaterials {
    private String authors;
    private String subject;

    public TextBook(String name, int noPage, String language, String access, String authors, String subject) {
        super(name, noPage, language, access);
        this.authors= authors;
        this.subject = subject;
    }

    public String getAuthors() {
        return authors;
    }

    public String getSubject() {
        return subject;
    }
    public void disp(){
        System.out.println("NAME: "+getName());
        System.out.println("NO OF PAGES: "+ getNoPage());
        System.out.println("LANGUAGE :"+getLanguage());
        System.out.println("MODE OF ACCESS: "+getAccess());
        System.out.println("AUTHORS NAMES: "+getAuthors());
        System.out.println("SUBJECT: "+getSubject());
    }
}

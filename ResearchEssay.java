package AhmadMalik;

public class ResearchEssay extends ReadingMaterials{
    private String author;
    private String format;
    public ResearchEssay(String name, int noPage, String language, String access, String author, String format) {
        super(name, noPage, language, access);
        this.author= author;
        this.format=format;
    }

    public String getAuthor() {
        return author;
    }

    public String getFormat() {
        return format;
    }
    public void disp(){
        System.out.println("NAME: "+getName());
        System.out.println("NO OF PAGES: "+ getNoPage());
        System.out.println("LANGUAGE :"+getLanguage());
        System.out.println("MODE OF ACCESS: "+getAccess());
        System.out.println("AUTHOR NAME: "+getAuthor());
        System.out.println("Format: "+getFormat());
    }
}

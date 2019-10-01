package AhmadMalik;

public class ReadingMaterials {
    private String name;
    private int noPage;
    private String language;
    private String Access;

    public ReadingMaterials(String name, int noPage, String language, String access) {
        this.name = name;
        this.noPage = noPage;
        this.language = language;
        this.Access = access;
    }

    public String getName() {
        return name;
    }

    public int getNoPage() {
        return noPage;
    }

    public String getLanguage() {
        return language;
    }

    public String getAccess() {
        return Access;
    }
}

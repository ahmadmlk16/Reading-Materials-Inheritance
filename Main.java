package AhmadMalik;

public class Main {

    public static void main(String[] args) {
        ReadingMaterials r1, r2, r3, r4, r5;
        r1 = new StoryBook("Harry Potter", 356, "English", "Hard Cover", "J.K Rowling", "Fiction");
        r2= new Magazine ("Time", 60,"English", "Soft Cover", "Meredith Corporation", "News");
        r3= new TextBook("Multivaribale Calulus", 355, "English", "Soft Cover","Anti-Students", "Math");
        r4= new Article("US pulls troops from Libya amid a surge in violence", 2, "English", "Online","Nada Altaher", "CNN","News" );
        r5= new ResearchEssay("Child Labor", 7,"English", "PDF viewer", "Ahmad Malik","MLA");

        System.out.println("READING MATERIALS: ");
        System.out.println("");
        ((StoryBook) r1).disp();
        System.out.println("");
        ((Magazine) r2).disp();
        System.out.println("");
        ((TextBook) r3).disp();
        System.out.println("");
        ((Article) r4).disp();
        System.out.println("");
        ((ResearchEssay) r5).disp();
    }
}
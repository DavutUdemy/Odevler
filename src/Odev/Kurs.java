package Odev;

public class Kurs {
    public Kurs() {
        System.out.println("bu bir Engin hocanin Kursu");
    }

    public Kurs(int id,String name,String details,String image) {
        this();
        this.id=id;
        this.name=name;
        this.details=details;
        this.image=image;
    }
    int id;
    String name;
    String details;
    String image;
}

package Odev;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Kurs kurs1= new Kurs(1,"Java Kamp Kursu","Sifirdan Zirveye","Java.jpeg");


        Kurs kurs2= new Kurs();
        kurs2.name="C# KAMP KURSU";
        kurs2.id=2;
        kurs2.details="C# SIFIRDAN ZIRVEYE PROFESYONEL TEKNIKLERLE";
        kurs2.image="C#.jpeg";


        Kurs[] kurslar= {kurs1,kurs2};

        for (Kurs kurs : kurslar) {
            System.out.println(kurs.name+" "+kurs.details);
        }

        System.out.println(kurs1.id+"  "+kurs1.name+"  "+kurs1.details+"  "+kurs1.image);

        Category category1=new Category();
        category1.id=1;
        category1.Name="KURSLAR";


        KursManager kursManager=new KursManager();
        kursManager.kaydol(kurs1);



    }

}

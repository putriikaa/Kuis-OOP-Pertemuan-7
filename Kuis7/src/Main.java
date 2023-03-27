public class Main {
    public static void main(String[] args) {
        //Membuat 3 objek dengan 1 class Cylinder
        Cylinder cylinder1 = new Cylinder(8); //Memiliki 1 parameter
        Cylinder cylinder2 = new Cylinder(8,10);//Memiliki 2 parameter
        Cylinder cylinder3 = new Cylinder(8,10,"red");//Memiliki 3 parameter

        //Print objek 1
        System.out.println("Cylinder ke-1:");
        System.out.println("Radius awal : " + cylinder1.getRadius());
        cylinder1.setRadius(10);
        System.out.println("Radius saat ini: " + cylinder1.getRadius());
        System.out.println("Volume Cylinder 1 adalah : " +cylinder1.getVolume());
        System.out.println(cylinder1.toString());
        System.out.println();
        System.out.println("-------------------------------------------------------");

        //Print objek 2
        System.out.println("Cylinder ke-2:");
        System.out.println("Radius awal : " + cylinder2.getRadius());
        cylinder2.setRadius(10);
        System.out.println("Radius saat ini: " + cylinder2.getRadius());
        System.out.println("Height awal: " + cylinder2.getHeight());
        cylinder1.setHeight(25);
        System.out.println("Height saat ini: " + cylinder2.getHeight());
        System.out.println("Volume Cylinder 2 adalah : " +cylinder2.getVolume());
        System.out.println(cylinder2.toString());
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");

        //Print objek 3
        System.out.println("Cylinder ke-3:");
        System.out.println("Radius awal : " + cylinder3.getRadius());
        cylinder3.setRadius(10);
        System.out.println("Radius saat ini: " + cylinder3.getRadius());
        System.out.println("Height awal: " + cylinder3.getHeight());
        cylinder3.setHeight(25);
        System.out.println("Height saat ini: " + cylinder3.getHeight());
        System.out.println("Warna awal: " + cylinder3.getColor());
        cylinder3.setColor("blue");
        System.out.println("Warna saat ini: " + cylinder3.getColor());
        System.out.println("Volume Cylinder 2 adalah: " +cylinder3.getVolume());
        System.out.println(cylinder3.toString());
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
    }
}
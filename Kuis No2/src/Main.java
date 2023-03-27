public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nanda","Karanganyar");
        Student student = new Student("Ana","Beasiswa","Surakarta",2022, 25000000);
        Staff staff = new Staff("Salsa","Sukoharjo","UGM", 6000000);

        System.out.println("-----------------------------------------------------");
        System.out.println("Class Person");
        System.out.println("Nama : " + person.getName());
        System.out.println("Alamat : " + person.getAddress());
        person.setAddress("Jogja");
        System.out.println("Alamat terbaru: " + person.getAddress());
        System.out.println(person.toString());
        System.out.println();
        System.out.println("-----------------------------------------------------");

        System.out.println("Class Student");
        System.out.println("Nama : " + student.getName());
        System.out.println("Alamat : " + student.getAddress());
        student.setAddress("Jogja");
        System.out.println("Alamat terbaru: " + student.getAddress());
        System.out.println("Program : " + student.getProgram());
        student.setProgram("TRIK");
        System.out.println("Program terbaru: " + student.getProgram());
        System.out.println("Year : " + student.getYear());
        student.setYear(2022);
        System.out.println("Year saat ini : " + student.getYear());
        System.out.println("Fee: " + student.getFee());
        student.setFee(3000000);
        System.out.println("Fee saat ini: " + student.getFee());
        System.out.println(student.toString());
        System.out.println();
        System.out.println("-----------------------------------------------------");

        System.out.println("Class Staff");
        System.out.println("Nama : " + staff.getName());
        System.out.println("Alamat : " + staff.getAddress());
        staff.setAddress("Jogja");
        System.out.println("Alamat terbaru: " + staff.getAddress());
        System.out.println("School : " + staff.getSchool());
        staff.setSchool("Biologi");
        System.out.println("Program terbaru : " + staff.getSchool());
        System.out.println("Pay: " + staff.getPay());
        staff.setPay(6000000);
        System.out.println("Fee terbaru: " + staff.getPay());
        System.out.println(staff.toString());
        System.out.println();



    }
}
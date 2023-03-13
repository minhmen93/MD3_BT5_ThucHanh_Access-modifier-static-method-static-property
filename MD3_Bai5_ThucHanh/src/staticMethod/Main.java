package staticMethod;

public class Main {
    public static void main(String[] args) {
      Student.change(); // Gọi phuong thức thay đổi

        // Khởi tạo objects
         Student s1 = new Student(111," Chinh ");
         Student s2 = new Student(222," Toan ");
         Student s3 = new Student(333," Dung ");

         //Gọi sự thay đổi
        s1.display();
        s2.display();
        s3.display();
    }
}

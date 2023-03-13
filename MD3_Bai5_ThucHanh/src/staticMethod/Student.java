package staticMethod;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";
    // Khởi tạo constructor
    Student (int r, String n){
        rollNo = r;
        name = n;
    }

    // Phương thức thay đổi giá trị của phương thức
    static void change(){
        college = "RIKKEI ACADEMY";
    }

    //phương thức để hiển thị lại các giá trị
    void display() {
        System.out.println(rollNo + "" + name + "" + college);
    }
}

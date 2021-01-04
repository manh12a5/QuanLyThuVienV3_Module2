package Library;

import java.util.Scanner;

public class Person {

    //Danh sách thuộc tính
    private String name;
    private int numberIDPerson;
    private String birthday;
    private String classOfPerson;

    //Constructor
    public Person() {
    }

    public Person(String name, int numberIDPerson, String birthday, String classOfPerson) {
        this.name = name;
        this.numberIDPerson = numberIDPerson;
        this.birthday = birthday;
        this.classOfPerson = classOfPerson;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberIDPerson() {
        return numberIDPerson;
    }

    public void setNumberIDPerson(int numberIDPerson) {
        this.numberIDPerson = numberIDPerson;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClassOfPerson() {
        return classOfPerson;
    }

    public void setClassOfPerson(String classOfPerson) {
        this.classOfPerson = classOfPerson;
    }

    //Danh sách phương thức
    public void addPerson() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        name = scanner.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        numberIDPerson = scanner1.nextInt();
        do {
            System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
            birthday = scanner1.nextLine();
        } while (birthday.length() < 8);
        System.out.println("Nhập lớp của sinh viên: ");
        classOfPerson = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "{ Thông tin sinh viên }" + "\n" +
                "Họ tên: " + name + "\n" +
                "MSV: " + numberIDPerson + "\n" +
                "Ngày sinh: " + birthday + "\n" +
                "Lớp: " + classOfPerson + "\n" +
                " -------------------- ";
    }

}

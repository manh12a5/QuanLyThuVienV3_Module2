import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ManagerLibrary managerLibrary = new ManagerLibrary();

    public static void main(String[] args) {
        System.out.println("---- Quản Lý Thư Viện ----");
        byte choice;
        do {
            listChoice();
            choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    //Nhập thông tin
                    managerLibrary.addNewBook();
                    break;
                case 2:
                    //Search
                    managerLibrary.searchPerson();
                    break;
                case 3:
                    //Display all
                    managerLibrary.displayAll();
                    break;
                case 4:
                    //Check Term
                    managerLibrary.dateTerm();
                    break;
                case 5:
                    //Sort number ID
                    managerLibrary.sortBook();
                    break;
            }
        } while (choice != 0);
        System.exit(0);
    }

    private static void listChoice() {
        System.out.println("1. Nhập thông tin");
        System.out.println("2. Tìm kiếm");
        System.out.println("3. Hiển thị toàn bộ thông tin");
        System.out.println("4. Hạn trả");
        System.out.println("5. Sắp xếp theo MSV");
        System.out.println("0. Exit");
        System.out.print("Choice number: ");
    }

}

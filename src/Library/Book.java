package Library;



import java.util.Scanner;

public class Book extends Person {

    //Danh sách thuộc tính
    private int numberBorrow;
    private String dateBorrow;
    private String term;
    private int numberOfBook;
    private String informationPerson;

    //Constructor
    public Book() {
    }

    public Book(int numberBorrow, String dateBorrow, String term, int numberOfBook, String informationPerson) {
        this.numberBorrow = numberBorrow;
        this.dateBorrow = dateBorrow;
        this.term = term;
        this.numberOfBook = numberOfBook;
        this.informationPerson = informationPerson;
    }

    public Book(String name, int numberIDPerson, String birthday, String classOfPerson, int numberBorrow, String dateBorrow, String term, int numberOfBook, String informationPerson) {
        super(name, numberIDPerson, birthday, classOfPerson);
        this.numberBorrow = numberBorrow;
        this.dateBorrow = dateBorrow;
        this.term = term;
        this.numberOfBook = numberOfBook;
        this.informationPerson = informationPerson;
    }

    //Getter and Setter
    public int getNumberBorrow() {
        return numberBorrow;
    }

    public void setNumberBorrow(int numberBorrow) {
        this.numberBorrow = numberBorrow;
    }

    public String getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(String dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public String getInformationPerson() {
        return informationPerson;
    }

    public void setInformationPerson(String informationPerson) {
        this.informationPerson = informationPerson;
    }

    //Danh sách thuộc tính
    public void addBook() {
        super.addPerson();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập số phiếu mượn: ");
        numberBorrow = scanner.nextInt();
        do {
            System.out.println("Nhập ngày mượn (dd/MM/yyyy): ");
            dateBorrow = scanner1.nextLine();
        } while (dateBorrow.length() < 8);
        do {
            System.out.println("Nhập hạn trả (dd/MM/yyyy): ");
            term = scanner.nextLine();
        } while (term.length() < 8);
        System.out.println("Nhập số hiệu sách: ");
        numberOfBook = scanner1.nextInt();
        System.out.println("Nhập thông tin của sinh viện mượn: ");
        informationPerson = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "{ Thông tin sách }" + "\n" +
                "Số phiếu mượn: " + numberBorrow + "\n" +
                "Ngày mượn: " + dateBorrow + "\n" +
                "Hạn trả: " + term + "\n" +
                "Số hiệu sách: " + numberOfBook + "\n" +
                "Thông tin sinh viên mượn sách: " + informationPerson + "\n";
    }

}

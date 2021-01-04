import Library.Book;

import java.util.*;

public class ManagerLibrary {

    //Danh sách thuộc tính
    List<Book> arrBooks = new ArrayList<Book>();

    //Danh sách phương thức
    public void addNewBook() {
        Book book = new Book();
        book.addBook();
        arrBooks.add(book);
    }

    public void searchPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên cần tìm: ");
        int searchID = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < arrBooks.size(); i++) {
            if (searchID == arrBooks.get(i).getNumberIDPerson()) {
                System.out.println(arrBooks.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy");
        }
    }

    public void displayAll() {
        for (int i = 0; i < arrBooks.size(); i++) {
            System.out.println(arrBooks.get(i));
        }
    }

    public void dateTerm() {
        byte count = 0;
        for (int i = 0; i < arrBooks.size(); i++) {
            if (checkYear(i)
            ) {
                System.out.println(arrBooks.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có");
        }

    }

    private boolean checkYear(int i) {
        return arrBooks.get(i).getTerm().startsWith("30")
                || arrBooks.get(i).getTerm().startsWith("31")
                || arrBooks.get(i).getTerm().startsWith("28") && arrBooks.get(i).getTerm().startsWith("2", 3)
                || arrBooks.get(i).getTerm().startsWith("28") && arrBooks.get(i).getTerm().startsWith("02", 3)
                || arrBooks.get(i).getTerm().startsWith("29") && arrBooks.get(i).getTerm().startsWith("2", 3) && Integer.parseInt(arrBooks.get(i).getTerm().substring(5, 8)) / 400 == 0
                || arrBooks.get(i).getTerm().startsWith("29") && arrBooks.get(i).getTerm().startsWith("02", 3) && Integer.parseInt(arrBooks.get(i).getTerm().substring(6, 9)) / 400 == 0;
    }

    public void sortBook() {
        Collections.sort(arrBooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getNumberIDPerson() > o2.getNumberIDPerson()) {
                    return 1;
                } else if (o1.getNumberIDPerson() < o2.getNumberIDPerson()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (int i = 0; i < arrBooks.size(); i++) {
            System.out.println(arrBooks.get(i));
        }
    }

}

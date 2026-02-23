//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    String bookID;
    String bookName;
    int publishYear;
    double price;
    boolean isAvailable;

    System.out.println("Nhâp mã sách: ");
    bookID = sc.nextLine();
    System.out.println("Nhập tên sách: ");
    bookName = sc.nextLine();
    System.out.println("Nhập năm xuất bản: ");
    publishYear = sc.nextInt();
    System.out.println("Nhập giá bìa: ");
    price = sc.nextDouble();
    System.out.println("Sách còn trong kho (true/false)");
    isAvailable = sc.hasNext();

    System.out.println("\n--- Thông tin sách ---");
    System.out.println("Tên sách: " + bookName);
    System.out.printf("Mã số: %s | Tuổi thọ: %d%n", bookID, (2026 - publishYear));
    System.out.println("Giá bán: " + price + " VND");

    if (isAvailable) {
        System.out.println("Còn sách");
    } else {
        System.out.println("Đã mượn");
    }

    sc.close();

}

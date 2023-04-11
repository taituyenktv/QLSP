package view;

import entity.Product;
import handle.ProductHandle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Show {
    public void viewMenu(Scanner sc) {
        System.out.println("=== Chào mừng bạn đến với chương trình quản lý sản phẩm ===");
        System.out.println("1. Xem danh sách sản phẩm. ");
        System.out.println("2. Tìm sản phẩm theo tên. ");
        System.out.println("3. Tìm sản phẩm theo ID:  ");
        System.out.println("4. Tìm sản phẩm có số lượng dưới 5 ");
        System.out.println("5. Tìm sản phẩm theo mức giá. ");
        System.out.println("6. Sắp xếp theo giá từ thấp đến cao ");
        System.out.println("7. Thoát ");
        System.out.print("Mời bạn chọn chức  nặng :");

    }

    public int viewSelectByPri(Scanner sc) {
        System.out.println(
                "1. Giá từ 0 ~ 50.000 \n" +
                        "2. Giá từ 50.000 ~ 100.000 \n" +
                        "3. Giá từ 100.000 ~ ");
        System.out.println("Mời bạn chọn mục tương ứng : ");
        int n = Integer.parseInt(sc.nextLine());
        return n;

    }
    public boolean inPutUpdateById(Product product, Scanner sc, String newName, String newDescribe, double newQuantity, double newPrice) {

        System.out.println("Mời bạn nhập tên mới của sản phẩm : ");

        newName = sc.nextLine();
        System.out.println("Mời bạn nhập mô tả mới về sản phẩm: ");

        newDescribe = sc.nextLine();
        System.out.println("Mời bạn nhập tổng số lượng sản phẩm :  ");

        newQuantity = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập giá sản phẩm :  ");
        newPrice = Double.parseDouble(sc.nextLine());
        ProductHandle productHandle = new ProductHandle();

        boolean checkUP = productHandle.upDateById(product,newName,newDescribe,newQuantity,newPrice);
        if (checkUP) {
            System.out.println("Cập nhật sản phẩm thành công.");
        } else System.out.println("Không tìm thấy sản phẩm cần cập nhật.");

        return checkUP;
    }

}



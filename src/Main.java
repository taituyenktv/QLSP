import entity.Product;
import handle.ProductHandle;
import view.Show;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Show show = new Show();
        ProductHandle productHandle = new ProductHandle();

        System.out.println("Mời bạn nhập số lượng sản phẩm cần tạo ra: ");
        int n = Integer.parseInt(sc.nextLine());
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            Product product = productHandle.inputProduct(sc, i);
            products[i] = product;
        }
        do {
            show.viewMenu(sc);
            int choose = 0;
            choose = Integer.parseInt(sc.nextLine());
            while (choose <= 0 || choose > 7) {
                System.out.println("Bạn chọn sai số mời bạn chọn lại!");
                choose = Integer.parseInt(sc.nextLine());
            }
            switch (choose) {
                case 1:
                    productHandle.show(products);
                    break;
                case 2:
                    productHandle.fineName(sc, products);
                    break;
                case 3:
                    Product product = productHandle.findById(products,sc);
                    String newName = null;
                    String newDescribe = null;
                    double newQuantity = 0;
                    double newPrice = 0;
//                    productHandle.findById(products, sc);
                    show.inPutUpdateById(product, sc, newName, newDescribe, newQuantity, newPrice);

                    break;
                case 4:
                    productHandle.findbyQuantity(products);
                    break;
                case 5:
                    int s = show.viewSelectByPri(sc);
                    productHandle.filterByPrice(products, s);
                    break;
                case 6:
                    productHandle.sortByPrice(products);
                    break;
                case 7:
                    break;

            }

        } while (true);


    }
}


package handle;

import entity.Product;

import java.util.Scanner;

public class ProductHandle {
    public Product inputProduct(Scanner sc, int i) {

        System.out.println("Mời bạn nhập tên sản phẩm thứ " + (i + 1) + " : ");
        String name = sc.nextLine();

        System.out.println("Mời bạn mô tả về sản phẩm thứ " + (i + 1) + " : ");
        String describe = sc.nextLine();

        System.out.println("Mời bạn nhập số lượng sản phẩm thứ " + (i + 1) + ":  ");
        double quantity = Double.parseDouble(sc.nextLine());

        System.out.println("Mời bạn nhập giá sản phẩm thứ " + (i + 1) + " :  ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.println("Mời bạn đơn vị của sản phẩm thứ " + (i + 1) + " : ");
        String unit = sc.nextLine();

        Product product = new Product(name, describe, quantity, price, unit);

        return product;
    }

    public void show(Product[] products) {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public String fineName(Scanner sc, Product[] products) {
        boolean check = false;
        System.out.println("Mời bạn nhập tên sản phẩm :");
        String name = sc.nextLine();
        for (Product p : products) {
            while (p.getName().equalsIgnoreCase(String.valueOf(name))) {
                System.out.println(p);
                check = true;
                break;

            }

        }
        if (!check) {
            return "Không tìm thấy sản phẩm có tên là : " + name;
        }

        return "Đã tìm thấy sản phẩm";
    }

    public Product findById(Product[] products, Scanner sc) {
        System.out.println("Mời bạn nhập ID ");
        int id = Integer.parseInt(sc.nextLine());
        for (Product p : products) {
            if (id == p.getId()) {

                return p;
            }

        }
        return null;
    }

    public void findbyQuantity(Product[] products) {

        for (Product p : products) {
            if (p.getQuantity() < 5) System.out.println(p);
        }
    }

    public boolean upDateById(Product product, String name, String describe, double quantity, double price) {

        if (product == null) return false;
        else {
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            product.setDescribe(describe);
            return true;
        }
    }


    public void filterByPrice(Product[] products, int n) {

        for (Product p : products) {
            if (n == 1 && p.getPrice() < 50000) {
                System.out.println(p);
            } else if (n == 2 && p.getPrice() >= 50000 && p.getPrice() < 100000) {
                System.out.println(p);
            } else if ((n == 3 && p.getPrice() >= 100000)) {
                System.out.println(p);
            }
        }
    }

    public void sortByPrice(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length - 1; j++) {
                if (products[j].getPrice() > products[j + 1].getPrice()) {
                    Product temp = products[j];
                    //a[0] = 0
                    products[j] = products[j + 1];
                    //a[1] = 1
                    products[j + 1] = temp;
                }
            }
        }
        System.out.println("Sau khi sắp xếp lại: ");
        for (Product p : products
        ) {
            System.out.println(p);
        }
    }


}

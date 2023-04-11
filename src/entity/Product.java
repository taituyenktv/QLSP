package entity;

public class Product {
    private static int AUTOID;
    private int id;
    private String name;
    private String describe;
    private double quantity;
    private double price;
    private String unit;

    public Product( String name, String describe, double quantity, double price, String unit) {
        this.id = ++AUTOID;
        this.name = name;
        this.describe = describe;
        this.quantity = quantity;
        this.price = price;
        this.unit = unit;
    }


    public static int getAUTOID() {
        return AUTOID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id =" + id +
                ", Tên sản phẩm: " + name +
                ", Mô tả : " + describe +
                ", Số lượng : " + quantity  +
                ", Giá : " + price +
                ", Đơn vị: " + unit +
                '}';
    }
}

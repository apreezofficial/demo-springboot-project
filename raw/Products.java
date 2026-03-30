public class Products {
    String name;
    int price;
    int id;
    public Products(String name, int price, int id){
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }
}

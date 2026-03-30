public class OutputClass {
    public static void main(String[] args) {
        Products hole = new Products("holes", 20000, 100);
        System.out.println("Product Name " + hole.getName());
        System.out.println("Product Price " + hole.getPrice());
        System.out.println("Product id " + hole.getId());

        hole.setPrice(3500);
        System.out.println("Updated Price " + hole.getPrice());

    }
}
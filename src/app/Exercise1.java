package app;

public class Exercise1 {

    public static void main(String[] args) {
    String[] products = {"brange", "plum", "tomato", "onibn", "grape"};
    String[] corrProducts = corrProducts(products);
    outputProducts(corrProducts);
}
    public static String[] corrProducts(String[] products) {
        String[] corrProducts = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            corrProducts[i] = products[i].replaceAll("b", "o");
        }
        return corrProducts;
    }
    public static void outputProducts(String[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ") " + products[i]);
        }
    }
}



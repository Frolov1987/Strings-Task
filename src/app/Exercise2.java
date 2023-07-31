package app;
import java.util.ArrayList;


public class Exercise2 {

    public static void main(String[] args) {

        String[] products = {"orange", "plum", "tomato", "onion", "grape", "onion"};
        String[] updatedProducts = deleteProducts(products, "onion");
        outputProducts(updatedProducts);
    }
    public static String[] deleteProducts(String[] products, String productToDelete) {
        ArrayList<String> updatedProductsList = new ArrayList<String>();
        for (String product : products) {
            if (!product.equals(productToDelete)) {
                updatedProductsList.add(product);
            }
        }
        String[] updatedProducts = new String[updatedProductsList.size()];
        updatedProducts = updatedProductsList.toArray(updatedProducts);
        return updatedProducts;
    }
    public static void outputProducts(String[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ") " + products[i]);
        }
    }
}


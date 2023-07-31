package app;
import java.util.Scanner;


public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
        System.out.println("Enter name to search:");
        String nameToSearch = scanner.nextLine();
        int count = countNames(names, nameToSearch);
        StringBuilder sb = new StringBuilder();
        if (count == 0) {
            sb.append("Name not found ");
        } else {
            sb.append("Name found ").append(count).append(" times ");
        }
        System.out.println(sb);
    }
    public static int countNames(String[] names, String nameToSearch) {

        int count = 0;
        for (String name : names) {
            if (name.equals(nameToSearch)) {
                count++;
            }
        }
        return count;
    }
}



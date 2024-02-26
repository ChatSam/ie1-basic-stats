import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class MinMaxCalculation {
    public static void main(String ... args){
        ArrayList<Integer> num_list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers (type a non-number to stop): ");

        while (scan.hasNextInt()){
            int num = scan.nextInt();
            num_list.add(num);
        }
        
        scan.close();
        
        int max_val = Collections.max(num_list);
        int min_val = Collections.min(num_list);

        System.out.println("Maximum number is: " + max_val);
        System.out.println("Minimum number is: " + min_val);

    }
    
}


import java.io.*;
import java.util.*;

public class Solution {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        // lines is a list of lists
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt(); 
            
            ArrayList<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                row.add(scan.nextInt()); 
            }
            lines.add(row); 
        }
        
        int q = scan.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt(); 
            int y = scan.nextInt(); 
            
            int rowIndex = x - 1;
            int colIndex = y - 1;
            
            if (rowIndex < lines.size() && colIndex < lines.get(rowIndex).size()) {
                System.out.println(lines.get(rowIndex).get(colIndex));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        scan.close();
}
}
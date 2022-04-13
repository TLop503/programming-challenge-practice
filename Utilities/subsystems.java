package Utilities;

import java.util.Scanner;

public class subsystems {
    
    /**Next Line Scanners */
    public static Scanner scan = new Scanner(System.in);
    
    public static int nextInt(){
        return Integer.parseInt(scan.nextLine());
    }
    public static String next(){
        return scan.nextLine();
    }

}

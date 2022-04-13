//This program is finished, example input can be found in the link in the readme

package Challenges;
//inputs: int total sets, length of set, contents of set

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Q_Star_Student {

    public static Scanner scan = new Scanner(System.in);

    public static int setLength = -1;
    public static int maxScore = -1;
    public static String maxName = "";

    public static String output = "";

    public static void main(String[] args){
        int dataSets = nextInt();
        for (int i = 0; i < dataSets; i++){  //iterate through total datasets
            setLength = nextInt();
            for (int j = 0; j < setLength; j++){    //interate through dataset contents
                String[] part = next().split("(?<=\\D)(?=\\d)"); 
                
                if (Integer.parseInt(part[1]) > maxScore){  //simple "find largest" algo
                    maxScore = Integer.parseInt(part[1]);
                    maxName = part[0];
                }
            }
            output = output + maxName + " " + maxScore + "\n";  //adds results to output each iteration
        }
        System.out.println(output);
    }

    public static int nextInt(){
        return Integer.parseInt(scan.nextLine());
    }

    public static String next(){
        return scan.nextLine();
    }

}

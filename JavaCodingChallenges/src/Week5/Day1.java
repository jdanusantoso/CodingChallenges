package Week5;

import java.util.Scanner;

//Write a function that takes an integer minutes and converts it to seconds.

public class Day1 {

    public static int convertingMinutesToSeconds(int n){

        //Default value

        int result = -404;

        if(n !=0){
            int seconds = n *60;
            return seconds;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of minutes that you want to convert to seconds.");
        int n = in.nextInt();
        in.close();

        System.out.println(convertingMinutesToSeconds(n));

    }

}

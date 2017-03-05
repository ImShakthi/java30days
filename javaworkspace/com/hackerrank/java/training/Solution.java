package com.hackerrank.java.training;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        try{
            int n;
            int strLen;
            String temp;
            String mainString;
            String oddString = "";
            String evenString = "";

            n = scan.nextInt();

            for(int i = 0 ; i <= n ; i++){

                mainString = scan.next();
                strLen = mainString.length();
                
                evenString = "";
                oddString = "";
                
                for(int j = 0 ; j < strLen ; j++){
                    temp = mainString.charAt(j) + "";
                    if(j%2==0){
                	evenString = evenString + temp;
                    }else{
                	oddString = oddString + temp;
                    }
                }
                temp = evenString + " " + oddString;
                System.out.println(temp);
            }
        }
        catch(Exception e){
            System.out.println("Error caused due to " + e);
        }
        finally{
            try{
                scan.close();
            }
            catch(Exception e){
                System.out.println("Error caused while closing scanner due to " + e);
            }
        }
            
    }
}
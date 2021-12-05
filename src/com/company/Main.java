package com.company;

import java.util.Scanner;


public class Main {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        int count=0;
        String value="";
        int size=s.length();
        for(int i=0;i<=size-k;i++){
            value=s.substring(i,i+k);

            if(count==0){
                smallest=value;
                largest=value;
                count++;
            }else{
                if(value.compareTo(smallest)<=0){
                    smallest=value;
                }
                if(value.compareTo(largest)>0){
                    largest=value;
                }
            }


        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}









/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classreports;

/**
 *
 * @author nyawira
 */
import java.util.Scanner;

public class ClassReports {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num, nums, number, sum;
    double average;
    
    System.out.println("Enter first mark:");
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    
    System.out.println("Enter second mark:");
    Scanner out = new Scanner(System.in);
    nums = in.nextInt();
    
    System.out.println("Enter third mark:");
    Scanner up = new Scanner(System.in);
    number = in.nextInt();
   
    sum = num + nums + number;
    average = sum/3;
    
    System.out.println("Total Marks = " + sum);
    System.out.println("Average Mark = " + average);
    
    if (average>80 && average<=100){
          System.out.println("GRADE = A");
          System.out.println("Comment: Distinction");
      }
    else if (average>60 && average<=80){
          System.out.println("GRADE = B");
          System.out.println("Comment: First Class Honours");
      }
    else if (average>40 && average<=60){
          System.out.println("GRADE = C");
          System.out.println("Comment: Credit");
      }
    else if (average>20 && average<=40){
          System.out.println("GRADE = D");
          System.out.println("Comment: Pass");
      }
    else{
        System.out.println(" Comment: Fail");
      }
     
    }
    
}

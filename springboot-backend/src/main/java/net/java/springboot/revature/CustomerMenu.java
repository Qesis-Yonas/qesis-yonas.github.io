package net.java.springboot.revature;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerMenu {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        String[] row1={"1.Water","2.Coca Cola","3.Beer"};
        String[] row2={"1.Chicken","2.Beef","3.Shiro"};
        String[] row3={"1.Chips","2.Grape","3.Chocolate"};

        System.out.println("Choose Your Menu from the Dropdown Menu by selecting the number");
        System.out.println("1) Drinks");
        System.out.println("2) Meal");
        System.out.println("3) Dessert");
        System.out.println("By selecting the number You will choose your Menu");

        int input= sc.nextInt();
        int chooseFrom;

        boolean exit=false;
        String selected;
        do {
            switch (input){
                case 1:
                    System.out.println("You have slected a drink");
                    System.out.println("Please Select Which Drink you want to Have from the following menu");
                    System.out.println(Arrays.toString(row1));
                    System.out.println("Please choose the number for your drink");
                    chooseFrom = sc.nextInt();
                    selected= row1[chooseFrom-1];
                    System.out.println("You Chose the following drink ==> "+selected.substring(2));
                    System.out.println("Do You want to contniue to select from the Menu? if you dont want please select 0");
//                    if (input<=1){
//                        break;
//                    }
                case 2:
                    System.out.println("You have slected a Meal");
                    System.out.println("Please Select Which Meal you want to Have from the following menu");
                    System.out.println(Arrays.toString(row2));
                    System.out.println("Please choose the number for your Meal");
                    chooseFrom = sc.nextInt();
                    selected= row2[chooseFrom-1];
                    System.out.println("You Chose the following Meal ==> "+selected.substring(2));
                    System.out.println("Do You want to contniue to select from the Menu? if you dont want please select 0");
//                    if (input<=2){
//                        break;
//                    }
                case 3:
                    System.out.println("You have slected a Dessert");
                    System.out.println("Please Select Which Dessert you want to Have from the following menu");
                    System.out.println(Arrays.toString(row3));
                    System.out.println("Please choose the number for your Dessert");
                    chooseFrom = sc.nextInt();
                    selected= row3[chooseFrom-1];
                    System.out.println("You Chose the following Meal ==> "+selected.substring(2));
                default:
                    System.out.println("Thank you for choosing our restaurant \nPlease wait for a certain amount of time for your oder to be finished");

            }
            exit=true;

        }while (!exit);
    }


}

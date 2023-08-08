package net.java.springboot;

import java.util.stream.Collectors;

public class Stock {
    public static void main(String[] args) {
        int[] array = {1,7,5,2,4};
        System.out.println(maxProfit(array));

        String name = "Yonas";

        System.out.println(convertToConcatinatedIntegers(name));

    }
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice = prices[0];
        if(prices == null || prices.length<2) {
            return 0;
        }
        for(int i=0; i<prices.length; i++) {
            if(prices[i]<minPrice) {
                minPrice = prices[i];
            }else {
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;

    }

    public static String convertToConcatinatedIntegers(String input){
        return input.chars()
                .mapToObj(Character::getNumericValue)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    //"SELECT e.name As employee_name, m.name As namager_name FROM Employee e LEFT JOIN Employee m ON e.managerName = m.id"


    /*"SELECT  e.id, ename, e.salary, e.department
    FROM employee e
    JOIN (
    SELECT department , AVG(salary) AS avg_salary
    FROM employee
     Group by department)
     AS dept_avg ON e.department = dept_avg.department
     WHERE e.salary>dept_avg.avg_salary;
     */




}

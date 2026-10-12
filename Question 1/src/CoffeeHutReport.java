/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

public class CoffeeHutReport {

    public static void main(String[] args) {

        // Declare and populate a single-dimensional array
        try (Scanner input = new Scanner(System.in)) {
            // Declare and populate a single-dimensional array
            String[] cities = {
                "CAPE TOWN", "PORT ELIZABETH", "PRETORIA"
            };
            
            String[] beverages = {
                "COFFEE", "TEA", "BOBA TEA"
            };
            
            // Declare a two-dimensional array for sales
            double[][] sales = new double[3][3];
            
            // Get monthly sales from the user
            System.out.println("NUMBER 1 COFFEE HUT APPLICATION");
            System.out.println("==============================================");
            
            for (int i = 0; i < cities.length; i++) {
                
                for (int j = 0; j < beverages.length; j++) {
                    
                    System.out.print("Enter the number of "
                            + beverages[j] + " sales for "
                            + cities[i] + ": ");
                    
                    sales[i][j] = input.nextDouble();
                }
            }
            
            // Display the beverage sales report
            System.out.println("\nNUMBER 1 COFFEE HUT REPORT");
            System.out.println("==============================================");
            
            System.out.printf("%-20s", "CITY");
            
            for (String beverage : beverages) {
                System.out.printf("%-15s", beverage);
            }

            System.out.println();
            
            System.out.println("----------------------------------------------");
            
            for (int i = 0; i < cities.length; i++) {
                
                System.out.printf("%-20s", cities[i]);
                
                for (int j = 0; j < beverages.length; j++) {
                    System.out.printf("R%-14.2f", sales[i][j]);
                }
                
                System.out.println();
            }
            
            // Calculate total sales for each city
            System.out.println("\nPRODUCT SALES TOTALS FOR EACH CITY");
            System.out.println("==============================================");
            
            double grandTotal = 0;
            
            for (int i = 0; i < cities.length; i++) {
                
                double cityTotal = 0;
                
                for (int j = 0; j < beverages.length; j++) {
                    cityTotal += sales[i][j];
                }
                
                System.out.printf("%-20s R%.2f%n",
                        cities[i], cityTotal);
                
                grandTotal += cityTotal;
            }
            
            // Display total sales for all cities
            System.out.println("----------------------------------------------");
            
            System.out.printf("TOTAL SALES FOR CITIES: R%.2f%n",
                    grandTotal);
        }
    }
}
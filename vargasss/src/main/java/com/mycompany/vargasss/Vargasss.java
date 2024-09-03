/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vargasss;
import java.util.Scanner;
/**
 *
 * @author CL3-PC28
 */
public class Vargasss {

    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int c1, c2, c3, c4;
       System.out.println();
       System.out.println();
       System.out.println("****************************** [ M E N U ] ******************************");
       System.out.println();
       System.out.println();
       System.out.println("[1] = Snacks");
       System.out.println("[2] = Drinks");
       
       System.out.println("Enter your choice: ");
       c1 = input.nextInt();
       
       if(c1==1)
       {
           System.out.println("You chose Snacks");
           System.out.println();
           System.out.println("[1] - Mang Juan 10 pesos");
           System.out.println("[2] - Corn Ole 12 pesos");
           System.out.println();
           System.out.println("Enter your choice: ");
           c2 = input.nextInt();
           if(c2==1)
           {
                System.out.println("You chose Mang Juan 10 pesos");
                int mj, co;
                mj = 10;
                co = 12;
               
                System.out.println("Would you like to order drinks? [1] - yes or [2] no");
                c3 = input.nextInt();
                
                if(c3 != 1 && c3 !=2)
                {
                    System.out.println("Invalid Input");
                    System.out.println();
                    System.out.println("You Ordered Mang Juan 10 pesos");
                        int total;
                        total = 0 + mj;
                        System.out.println("Total is " + total);
                        System.out.println("Enter your cash: " );
                        int cash = input.nextInt();
                            
                            while(cash<total)
                            {
                                System.out.println("Try again" );
                                System.out.println("Enter your cash: ");
                                cash = input.nextInt();
                            }
                            if(cash>=total)
                            {
                                int change;
                                change = cash - total;
                                System.out.println("Change is : " + change);
                            }  
                }
                
                if(c3==2)
                {
                    System.out.println("You Ordered Mang Juan 10 pesos");
                        int total;
                        total = 0 + co;
                        System.out.println("Total is " + total);
                        System.out.println("Enter your cash: " );
                        int cash = input.nextInt();
                            
                            while(cash<total)
                            {
                                System.out.println("Try again" );
                                System.out.println("Enter your cash: ");
                                cash = input.nextInt();
                            }
                            if(cash>=total)
                            {
                                int change;
                                change = cash - total;
                                System.out.println("Change is : " + change);
                            }  
                }
                
                if(c3==1)
                {
                    System.out.println();
                    System.out.println("Order your drink");
                    System.out.println("[1] = Water 15 pesos");
                    System.out.println("[2] = Coke 20 pesos");
                    
                    System.out.println("Enter your choice");
                    c4 = input.nextInt();
                    int coke, water;
                    coke = 20;
                    water = 15;
                    
                    if(c4 != 1)
                {
                    System.out.println("Invalid Input");
                    System.out.println();
                    System.out.println("You Ordered Mang Juan 10 pesos");
                        int total;
                        total = 0 + mj;
                        System.out.println("Total is " + total);
                        System.out.println("Enter your cash: " );
                        int cash = input.nextInt();
                            
                            while(cash<total)
                            {
                                System.out.println("Try again" );
                                System.out.println("Enter your cash: ");
                                cash = input.nextInt();
                            }
                            if(cash>=total)
                            {
                                int change;
                                change = cash - total;
                                System.out.println("Change is : " + change);
                            }  
                }
                    
                    if(c4==1)
                    {
                        System.out.println("You chose Water 15 pesos");
                        int total;
                        total = water + mj;
                        System.out.println("Total is " + total);
                        System.out.println("Enter your cash: " );
                        int cash = input.nextInt();
                            
                            while(cash<total)
                            {
                                System.out.println("Try again" );
                                System.out.println("Enter your cash: ");
                                cash = input.nextInt();
                            }
                            if(cash>=total)
                            {
                                int change;
                                change = cash - total;
                                System.out.println("Change is : " + change);
                            }  
                        
                    }
                     
                    
                }
           }
           else if(c2==2)
           {
               System.out.println("You chose Corn Ole 12 pesos");
               int mj, co;
               mj = 10;
               co = 12;
               
               System.out.println("Would you like to order drinks? [1] - yes or [2] - no");
               c3 = input.nextInt();
               if(c3 != 1 && c3 !=2)
                {
                    System.out.println("Invalid Input");
                    System.out.println();
                    System.out.println("You Ordered Corn Ole 12 pesos");
                        int total;
                        total = 0 + co;
                        System.out.println("Total is " + total);
                        System.out.println("Enter your cash: " );
                        int cash = input.nextInt();
                            
                            while(cash<total)
                            {
                                System.out.println("Try again" );
                                System.out.println("Enter your cash: ");
                                cash = input.nextInt();
                            }
                            if(cash>=total)
                            {
                                int change;
                                change = cash - total;
                                System.out.println("Change is : " + change);
                            }  
                }
               
               if(c3==2)
               {
                   System.out.println("You Ordered Corn Ole 12 pesos");
                        int total;
                        total = 0 + co;
                        System.out.println("Total is " + total);
                        System.out.println("Enter your cash: " );
                        int cash = input.nextInt();
                            
                            while(cash<total)
                            {
                                System.out.println("Try again" );
                                System.out.println("Enter your cash: ");
                                cash = input.nextInt();
                            }
                            if(cash>=total)
                            {
                                int change;
                                change = cash - total;
                                System.out.println("Change is : " + change);
                            }  
               }
               
               if(c3==1)
               {
                   System.out.println();
                   System.out.println("Order your drink");
                   System.out.println("[1] = Water 15 pesos");
                   System.out.println("[2] = Coke 20 pesos");
                   
                   System.out.println("Enter your choice: ");
                   c4 = input.nextInt();
                   int coke, water;
                   coke = 20;
                   water = 15;
                   
                   if(c4 != 1)
                {
                    System.out.println("Invalid Input");
                    System.out.println();
                    System.out.println("You Ordered Corn Ole 12 pesos");
                        int total;
                        total = 0 + co;
                        System.out.println("Total is " + total);
                        System.out.println("Enter your cash: " );
                        int cash = input.nextInt();
                            
                            while(cash<total)
                            {
                                System.out.println("Try again" );
                                System.out.println("Enter your cash: ");
                                cash = input.nextInt();
                            }
                            if(cash>=total)
                            {
                                int change;
                                change = cash - total;
                                System.out.println("Change is : " + change);
                            }  
                }
                   
                   if(c4==2)
                   {
                    System.out.println("You chose Coke 20 pesos");
                    int total;
                    total = coke + co;
                    System.out.println("Total is " + total);
                    System.out.println("Enter your cash: ");
                    int cash = input.nextInt();
                        
                        while(cash<total)
                        {
                            System.out.println("Try again" );
                            System.out.println("Enter your cash: ");
                            cash = input.nextInt();
                        }
                        if(cash>=total)
                        {
                            int change;
                            change = cash - total;
                            System.out.println("Change is : " + change);
                        }
                   }
                   
               }
               
           }
           
       }
            if(c1 !=1 || c1 !=2)
                {
                    System.out.println("Invalid Input");
                }
                
       
       ////////////////// DRINKS //////////////////
       
       
       
         if(c1==2)
           {
               System.out.println();
               System.out.println("You chose Drinks");
               System.out.println();
               System.out.println("[1] - Water 15 pesos");
               System.out.println("[2] - Coke 20 pesos");
               System.out.println();
               System.out.println("Enter your choice: ");
               c2 = input.nextInt();
               if(c2==1)
               {
                    System.out.println("You chose Water 15 pesos");
                    int coke, water;
                    coke = 20;
                    water = 15;
                    
                    System.out.println("Would you like to order Snacks? [1] - yes or [2] no");
                    c3 = input.nextInt();
                    
                    if(c3 != 1 && c3 !=2)
                {
                    System.out.println("Invalid Input");
                    System.out.println();
                    System.out.println("You Ordered Water 15 pesos");
                        int total;
                        total = 0 + water;
                        System.out.println("Total is " + total);
                        System.out.println("Enter your cash: " );
                        int cash = input.nextInt();
                            
                            while(cash<total)
                            {
                                System.out.println("Try again" );
                                System.out.println("Enter your cash: ");
                                cash = input.nextInt();
                            }
                            if(cash>=total)
                            {
                                int change;
                                change = cash - total;
                                System.out.println("Change is : " + change);
                            }  
                }
                    if(c3==2)
                    {
                        System.out.println("You Ordered Water 15 pesos");
                        int total;
                        total = 0 + water;
                        System.out.println("Total is " + total);
                        System.out.println("Enter your cash: " );
                        int cash = input.nextInt();
                            
                            while(cash<total)
                            {
                                System.out.println("Try again" );
                                System.out.println("Enter your cash: ");
                                cash = input.nextInt();
                            }
                            if(cash>=total)
                            {
                                int change;
                                change = cash - total;
                                System.out.println("Change is : " + change);
                            }  
                    }
                    
                    if(c3==1)
                    {
                        System.out.println();
                        System.out.println("Order your Snack");
                        System.out.println("[1] = Mang Juan - 10 pesos");
                        System.out.println("[2] = Corn Ole - 12 pesos");
                    
                        System.out.println("Enter your choice");
                        c4 = input.nextInt();
                        int mj, co;
                        mj = 10;
                        co = 12;
                    
                        if(c4==2)
                        {
                            System.out.println("You chose Corn Ole 12 pesos");
                            int total;
                            total = water + co;
                            System.out.println("Total is " + total);
                            System.out.println("Enter your cash: " );
                            int cash = input.nextInt();
                            
                                while(cash<total)
                                {
                                    System.out.println("Try again" );
                                    System.out.println("Enter your cash: ");
                                    cash = input.nextInt();
                                }
                                if(cash>=total)
                                {
                                    int change;
                                    change = cash - total;
                                    System.out.println("Change is : " + change);
                                }
                        }
                    }
               }
               else if(c2==2)
               {
                  System.out.println("You chose Coke 20 pesos");
                  int coke, water;
                  coke = 20;
                  water = 15;
                  
                   System.out.println("Would you like to order Snacks? [1] - yes or [2] no");
                   c3 = input.nextInt();
                   if(c3 != 1 && c3 !=2)
                    {
                        System.out.println("Invalid Input");
                        System.out.println();
                        System.out.println("You Ordered Coke 20 pesos");
                        int total;
                        total = 0 + coke;
                        System.out.println("Total is " + total);
                        System.out.println("Enter your cash: " );
                        int cash = input.nextInt();
                            
                            while(cash<total)
                            {
                                System.out.println("Try again" );
                                System.out.println("Enter your cash: ");
                                cash = input.nextInt();
                            }
                            if(cash>=total)
                            {
                                int change;
                                change = cash - total;
                                System.out.println("Change is : " + change);
                            }  
                        
                    }
                   
                   if(c3==2)
                   {
                       System.out.println("You Ordered Coke 20 pesos");
                        int total;
                        total = 0 + coke;
                        System.out.println("Total is " + total);
                        System.out.println("Enter your cash: " );
                        int cash = input.nextInt();
                            
                            while(cash<total)
                            {
                                System.out.println("Try again" );
                                System.out.println("Enter your cash: ");
                                cash = input.nextInt();
                            }
                            if(cash>=total)
                            {
                                int change;
                                change = cash - total;
                                System.out.println("Change is : " + change);
                            }  
                   }
                   
                   if(c3==1)
                   {
                       System.out.println();
                       System.out.println("Order your Snack");
                       System.out.println("[1] = Mang Juan - 10 pesos");
                       System.out.println("[2] = Corn Ole - 12 pesos");
                   
                       System.out.println("Enter your choice: ");
                       c4 = input.nextInt();
                       int mj, co;
                       mj = 10;
                       co = 12;
                       if(c4==1)
                       {
                           System.out.println("You chose Mang Juan 10 pesos");
                           int total;
                           total = coke + mj;
                           System.out.println("Total is " + total);
                           System.out.println("Enter your cash: ");
                           int cash = input.nextInt();
                           
                                while(cash<total)
                                {
                                    System.out.println("Try again" );
                                    System.out.println("Enter your cash: ");
                                    cash = input.nextInt();
                                }
                                if(cash>=total)
                                {
                                    int change;
                                    change = cash - total;
                                    System.out.println("Change is : " + change);
                                }
                       }
                   }
               }
              
           }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jo8;

import java.util.Scanner;
public class Contoh2 {
    public static void main(String[] args){
        int x;
        
        for(x = 1; x <= 10; x++)
        {
            System.out.print(x + " ");
        }
        
        //perulangan while
         x = 1;
        while(x <= 10)
        {
            System.out.print(x + " ");
            x++;
        }
        
        //perulangan do while
        System.out.println();
         x = 1;
        do
        {
            System.out.print(x + " ");
            x++;
        }
        while(x <= 10);
        
    }
}

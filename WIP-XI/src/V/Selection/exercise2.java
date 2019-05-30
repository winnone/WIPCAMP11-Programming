/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package V.Selection;

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class exercise2 {
    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Enter Price : ");
        double p=ip.nextDouble();
        
        System.out.print("Do you have member card? : ");
        boolean mb = ip.nextBoolean();
        
        System.out.print("Do you want to pay by cash? : ");
        boolean c = ip.nextBoolean();
        
        if(mb&&c){
            p=p*95/100;
            p=p*90/100;
        }
        
        else if(mb){
            p=p*95/100;
        }
        
        else if(c){
            p=p*90/100;
        }
        else {
            p=p;
        }
        
        System.out.println(p);
        System.out.println("Member Card = " + mb);
        System.out.println("Cash = " + c);
    }
}

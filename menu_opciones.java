/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apache;

/**
 *
 * @author hecferpiq
 */
import java.util.Scanner;

public class menu_opciones {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int opcion, num1, num2, total=0;
    
    System.out.println("¿Que quieres hacer? /n ");
    
    do{
    System.out.println("[1] Sumar dos números. ");      
    System.out.println("[2] Restar dos números."); 
    System.out.println("[3] Multiplicar dos números."); 
    System.out.println("[4] Dividir dos números."); 
    System.out.println("[5] ----SALIR----"); 
    opcion=sc.nextInt();

    switch(opcion){
         
         case 1:
          
             
         break;
         
          case 2:
         break;
         
          case 3:
         break;
         
          case 4:
         break;
         
          case 5:
          System.out.println("....SALIENDO");
         break;
         
         default:
         System.out.println("NINGUNA OPCION CORRECTA ELEGIDA");
         break;}
         
    }while (opcion!=5);
    
        
     }
    }
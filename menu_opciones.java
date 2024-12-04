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
             System.out.println("¿Que numero quieres sumar? "); 
             num1=sc.nextInt();
             System.out.println("Segundo numero a sumar"); 
             num2=sc.nextInt();
             
             total=num1+num2;
              System.out.println("El total es: " + total); 
               System.out.println(""); 
             
         break;
         
          case 2:
              
               System.out.println("¿Que numero quieres restar?"); 
               num1=sc.nextInt();
                 System.out.println("Cual es el otro: "); 
               num2=sc.nextInt();
               total=num1-num2;
               System.out.println("El total es: " + total); 
               System.out.println(""); 
              
         break;
         
          case 3:
               System.out.println("¿Que numero quieres multiplicar?"); 
               num1=sc.nextInt();
                 System.out.println("Cual es el otro: "); 
               num2=sc.nextInt();
               total=num1*num2;
               System.out.println("El total es: " + total); 
               System.out.println(""); 
         break;
         
          case 4:
               System.out.println("¿Que numero quieres divir?"); 
               num1=sc.nextInt();
                 System.out.println("Cual es el otro: "); 
               num2=sc.nextInt();
               total=num1/num2;
               System.out.println("El total es: " + total); 
               System.out.println(""); 
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

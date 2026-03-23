package ejerciciostema9;


import java.util.Random;


public class Ejercicio9_2ClasesyObjetos_HajarMoubhale {
     public static void main(String[] args) {
         Random rm = new Random();
         
         int num1 = rm.nextInt(100);
         int num2 = rm.nextInt(100);
         System.out.println("Numero 1 generado: " + num1);
         System.out.println("Numero 2 generado: " + num2);
         
         int numMax = Math.max(num1, num2);
         System.out.println("El valor del mayor número es: "+ numMax);    
    }
}

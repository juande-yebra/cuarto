package cuarto;
import java.util.Scanner;

public class Cuarto {
    public static void main(String[] args) {
        int respuesta, sal, fina, sueldo;
        
         Scanner entrada=new Scanner (System.in);
         System.out.println("que tipo de contrato tiene");
         System.out.println("1)0 a 900");
         System.out.println("2)900 a 1500");
         System.out.println("3)1500 a 2000");
         System.out.println("4) mas de 2000");
         respuesta=entrada.nextInt();
         switch(respuesta){
             case 1: 
                 System.out.println("que cantidad de salario tienes");
         sal = entrada.nextInt();
                 fina=sal*20/100;
                 sueldo=fina+sal;
                 System.out.println("su aumento es de 20%");
                 System.out.println("su salario final es: "+sueldo);
                 break;
                 case 2: 
                 System.out.println("que cantidad de salario tienes");
         sal = entrada.nextInt();
                 fina=sal*10/100;
                 sueldo=fina+sal;
                 System.out.println("su aumento es de 10%");
                 System.out.println("su salario final es: "+sueldo);
                 break;
                 case 3: 
                 System.out.println("que cantidad de salario tienes");
         sal = entrada.nextInt();
                 fina=sal*5/100;
                 sueldo=fina+sal;
                 System.out.println("su aumento es de 5%");
                 System.out.println("su salario final es: "+sueldo);
                 break;
                 case 4: 
                 System.out.println("que cantidad de salario tienes");
         sal = entrada.nextInt();
                 
                 System.out.println("su aumento es de 0%");
                 System.out.println("su salario final es: "+sal);
                 break;
        
        
    }
      
       
         
        
    }
    
}

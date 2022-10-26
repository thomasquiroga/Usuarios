package mx.com.gm.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int operacion = 0;
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        
        do{
            System.out.println("SELECCIONE UNA OPERACION");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            
            operacion = leer.nextInt();
            
            if(operacion != 5){
                System.out.print("INSERTE EL PRIMER NUMERO: ");
                numero1 = leer.nextInt();
                System.out.print("INSERTE EL SEGUNDO NUMERO: ");
                numero2 = leer.nextInt();
                
            }
            
            switch (operacion){
              case 1:
            operacion = 1;
            resultado = numero1 + numero2;
            System.out.println("EL RESULTADO DE LA SUMA ES: "+resultado);
            break;
            
              case 2:
            operacion = 2;
            resultado = numero1 - numero2;
            System.out.println("EL RESULTADO DE LA RESTA: "+resultado);
            break;
            
              case 3:
            operacion = 3;
            resultado = numero1 * numero2;
            System.out.println("EL RESULTADO DE LA MULTIPLICACION: "+resultado);
            break;
            
              case 4:
            operacion = 4;
            resultado = numero1 / numero2;
            System.out.println("EL RESULTADO DE LA DIVICION ES: "+resultado);
            break;
            
        }
            
        }while(operacion !=5);
        System.out.println("GRACIAS POR UTILIZAR ESTE SERVICIO!");
    }
}

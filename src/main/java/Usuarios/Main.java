package Usuarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario();
        Scanner teclado = new Scanner(System.in);
        
        int opcion;
        
        do{
            System.out.println("SELECCIONE UNA OPCION");
            System.out.println("1. AGREGAR USUARIO");
            System.out.println("2. MODIFICAR USUARIO");
            System.out.println("3. ELIMINAR USUARIO");
            System.out.println("4. SALIR");
            
            opcion = teclado.nextInt();
            
        switch (opcion){
            case 1:
                opcion = 1;
                
                
                        break;
            case 2:
                opcion = 2;
                
                
                
                        break;
            case 3:
                opcion = 3;
                
                
                
                        break;
        }
        }while(opcion !=4);
            System.out.println("GRACIAS POR SU CONSULTA!");
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String entrada;
       do{
        System.out.println("====== Menu principal Calculadora ======");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Potencia");
        System.out.println("6. Raiz");
        System.out.println("7. Salir");
        System.out.println("Seleccione una opcion (Si escribe el numero con letras la primera debe ser mayuscula): ");
        entrada = scanner.nextLine();
        
                
        switch (entrada){
            case "1","Uno":
                System.out.println("");  
                sumar(scanner);
                break;
            case "2","Dos":
                System.out.println("");  
                restar(scanner);            
                break;
            case "3","Tres":
                System.out.println("");  
                multiplicar(scanner);                
                break;
            case "4","Cuatro":
               System.out.println("");  
                dividir(scanner); 
                break;
            case "5","Cinco":
                System.out.println("");  
                potencia(scanner); 
                break;
            case "6","Seis":
                System.out.println("");  
                raiz(scanner);
                break;
            case "7","Siete":
                 System.out.println("Cerrando Programa...");
                entrada="7";
                break;
            default:
                System.out.println("Opcion invalida (Si escribe el numero con letras la primera debe ser mayuscula)");
                System.out.println("");
        }
        }while (entrada !="7"); //El menu aparecera siempre que op sea diferente a 5
    }
    public static void sumar (Scanner scanner){ 
        boolean op = true, veri=true;
        double num1=0, num2=0,total=0;
        do {
            System.out.println("====== Suma ======");
            do {
                veri=false;
                System.out.println("Ingresa el primer numero: ");
            String entrada = scanner.nextLine();
            
            if (entrada.matches("\\d+(\\.\\d+)?")) {
                num1 = Double.parseDouble(entrada);
                veri=true;
            }else{
                System.out.println("Error: Ingrese valores numericos");
                veri=false;                
            }
            } while (veri !=true);
            
            do {
                veri=false;
                System.out.println("Ingresa el segundo numero: ");
            String entrada = scanner.nextLine();
            
            if (entrada.matches("\\d+(\\.\\d+)?")) {
                num2 = Double.parseDouble(entrada);
                veri=true;
            }else{
                System.out.println("Error: Ingrese valores numericos");
                veri=false;                
            }
            } while (veri !=true);
            total=num1+num2;
            System.out.println("La suma: "+num1 +" + "+num2+" es igual a: "+total);
                       
            System.out.println("Deseas hacer otra suma? Escribe Si o No");
             String entrada = scanner.nextLine();
            switch (entrada){
            case "Si","si":
                System.out.println("");
                op=false;
                break;
            case "No","no":
                System.out.println("Regresando al menu Principal...");     
                op=true;
                break;
            default:
                System.out.println("Dato ingresado no reconocido se llevara al menu principal");
                op=true;
                break;
            }
            
        } while (op !=true);
        
    } 
    
    public static void restar (Scanner scanner){
        boolean op = true, veri=true;
        double num1=0, num2=0,total=0;
        do {
            System.out.println("====== Resta ======");
            do {
                veri=false;
                System.out.println("Ingresa el primer numero: ");
            String entrada = scanner.nextLine();
            
            if (entrada.matches("\\d+(\\.\\d+)?")) {
                num1 = Double.parseDouble(entrada);
                veri=true;
            }else{
                System.out.println("Error: Ingrese valores numericos");
                veri=false;                
            }
            } while (veri !=true);
            
            do {
                veri=false;
                System.out.println("Ingresa el segundo numero: ");
            String entrada = scanner.nextLine();
            
            if (entrada.matches("\\d+(\\.\\d+)?")) {
                num2 = Double.parseDouble(entrada);
                veri=true;
            }else{
                System.out.println("Error: Ingrese valores numericos");
                veri=false;                
            }
            } while (veri !=true);
            total=num1-num2;
            System.out.println("La resta: "+num1 +" - "+num2+" es igual a: "+total);
                       
            System.out.println("Deseas hacer otra resta? Escribe Si o No");
             String entrada = scanner.nextLine();
            switch (entrada){
            case "Si","si":
                System.out.println("");
                op=false;
                break;
            case "No","no":
                System.out.println("Regresando al menu Principal...");     
                op=true;
                break;
            default:
                System.out.println("Dato ingresado no reconocido se llevara al menu principal");
                op=true;
                break;
            }
            
        } while (op !=true);
    }
    
    public static void multiplicar (Scanner scanner){
    boolean op = true, veri=true;
        double num1=0, num2=0,total=0;
        do {
            System.out.println("====== Multiplicacion ======");
            do {
                veri=false;
                System.out.println("Ingresa el primer numero: ");
            String entrada = scanner.nextLine();
            
            if (entrada.matches("\\d+(\\.\\d+)?")) {
                num1 = Double.parseDouble(entrada);
                veri=true;
            }else{
                System.out.println("Error: Ingrese valores numericos");
                veri=false;                
            }
            } while (veri !=true);
            
            do {
                veri=false;
                System.out.println("Ingresa el segundo numero: ");
            String entrada = scanner.nextLine();
            
            if (entrada.matches("\\d+(\\.\\d+)?")) {
                num2 = Double.parseDouble(entrada);
                veri=true;
            }else{
                System.out.println("Error: Ingrese valores numericos");
                veri=false;                
            }
            } while (veri !=true);
            total=num1*num2;
            System.out.println("La Multiplicacion: "+num1 +" * "+num2+" es igual a: "+total);
                       
            System.out.println("Deseas hacer otra Multiplicacion? Escribe Si o No");
             String entrada = scanner.nextLine();
            switch (entrada){
            case "Si","si":
                System.out.println("");
                op=false;
                break;
            case "No","no":
                System.out.println("Regresando al menu Principal...");     
                op=true;
                break;
            default:
                System.out.println("Dato ingresado no reconocido se llevara al menu principal");
                op=true;
                break;
            }
            
        } while (op !=true);
}
    
    public static void dividir (Scanner scanner){
        boolean op = true, veri=true;
        double num1=0, num2=0,total=0;
        do {
            System.out.println("====== Division ======");
            do {
                veri=false;
                System.out.println("Ingresa el primer numero: ");
            String entrada = scanner.nextLine();
            
            if (entrada.matches("\\d+(\\.\\d+)?")) {
                num1 = Double.parseDouble(entrada);
                veri=true;
            }else{
                System.out.println("Error: Ingrese valores numericos");
                veri=false;                
            }
            } while (veri !=true);
            
            do {
                veri=false;
                System.out.println("Ingresa el segundo numero: ");
            String entrada = scanner.nextLine();
            
            if (entrada.matches("\\d+(\\.\\d+)?")) {
                num2 = Double.parseDouble(entrada);
                veri=true;
            }else{
                System.out.println("Error: Ingrese valores numericos");
                veri=false;                
            }
            } while (veri !=true);
            total=num1/num2;
            System.out.println("La Division: "+num1 +" / "+num2+" es igual a: "+total);
                       
            System.out.println("Deseas hacer otra Division? Escribe Si o No");
             String entrada = scanner.nextLine();
            switch (entrada){
            case "Si","si":
                System.out.println("");
                op=false;
                break;
            case "No","no":
                System.out.println("Regresando al menu Principal...");     
                op=true;
                break;
            default:
                System.out.println("Dato ingresado no reconocido se llevara al menu principal");
                op=true;
                break;
            }
            
        } while (op !=true);
    }
    
    public static void potencia (Scanner scanner){
        boolean op = true, veri=true;
        double num1=0, num2=0;
        double total=0;
        do {
            System.out.println("====== Potencia ======");
            do {
                veri=false;
                System.out.println("Ingresa el primer numero el numero base: ");
            String entrada = scanner.nextLine();
            
            if (entrada.matches("\\d+(\\.\\d+)?")) {
                num1 = Double.parseDouble(entrada);
                veri=true;
            }else{
                System.out.println("Error: Ingrese valores numericos");
                veri=false;                
            }
            } while (veri !=true);
            
            do {
                veri=false;
                System.out.println("Ingresa el segundo numero el numero de potencia: ");
            String entrada = scanner.nextLine();
            
            if (entrada.matches("\\d+(\\.\\d+)?")) {
                num2 = Double.parseDouble(entrada);
                veri=true;
            }else{
                System.out.println("Error: Ingrese valores numericos");
                veri=false;                
            }
            } while (veri !=true);
            total=Math.pow(num1,num2);
            System.out.println("La potencia: "+num2 +" del numero "+num1+" es igual a: "+total);
                       
            System.out.println("Deseas hacer otra Potencia? Escribe Si o No");
             String entrada = scanner.nextLine();
            switch (entrada){
            case "Si","si":
                System.out.println("");
                op=false;
                break;
            case "No","no":
                System.out.println("Regresando al menu Principal...");     
                op=true;
                break;
            default:
                System.out.println("Dato ingresado no reconocido se llevara al menu principal");
                op=true;
                break;
            }
            
        } while (op !=true);
    }
    
    public static void raiz (Scanner scanner){
         boolean op = true, veri=true;
        double num1=0;
        double total=0;
        do {
            System.out.println("====== Raiz ======");
            do {
                veri=false;
                System.out.println("Ingresa numero: ");
            String entrada = scanner.nextLine();
            
            if (entrada.matches("\\d+(\\.\\d+)?")) {
                num1 = Double.parseDouble(entrada);
                veri=true;
            }else{
                System.out.println("Error: Ingrese valores numericos");
                veri=false;                
            }
            } while (veri !=true);
                        
            total=Math.sqrt(num1);
            System.out.println("La raiz cuadrada de: "+num1 +" es igual a: "+total);
                       
            System.out.println("Deseas hacer otra Raiz? Escribe Si o No");
             String entrada = scanner.nextLine();
            switch (entrada){
            case "Si","si":
                System.out.println("");
                op=false;
                break;
            case "No","no":
                System.out.println("Regresando al menu Principal...");     
                op=true;
                break;
            default:
                System.out.println("Dato ingresado no reconocido se llevara al menu principal");
                op=true;
                break;
            }
            
        } while (op !=true);
    }
}

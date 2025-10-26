package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String op="Si";
        do{
    //crea una instancia que cree una lista estatica de la clase pais
        DataLoader dataLoader = new DataLoader("C:\\Users\\HP\\Desktop\\Universidad\\IPC 1\\-IPC1_Actividades_202300345\\Actividad 10-11\\demo\\data.csv");
        java.util.List<Pais> paises = dataLoader.loadData();

        // Imprime los países cargados
       /* Prueba de lectura del archivo
       for (Pais pais : paises) {
            System.out.println("País: " + pais.getNombre() + ", Código: " + pais.getCodigo());
        }
            */
        //almacena los datos en un arreglo estatico
        Pais[] paisesArray = new Pais[paises.size()];
        for (int i = 0; i < paises.size(); i++) {
            paisesArray[i] = paises.get(i);     
        }

    //crea una instancia que seleccione un pais aleatorio de la lista
        int indiceAleatorio = (int) (Math.random() * paisesArray.length);
        Pais paisSeleccionado = paisesArray[indiceAleatorio];

        String nombrePais = paisSeleccionado.getNombre();

        //crea una instancia donde se le muestre al usuario diciendole que la pista del pais es la inicial del pais seleccionado
        System.out.println("La pista del país es la inicial: " + nombrePais.charAt(0));
        System.out.println("¿Cuál crees que es el país?");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase(nombrePais)) {
            System.out.println("¡Correcto! Has adivinado el país.");
        } else {
            System.out.println("Incorrecto. El país era: " + nombrePais);
        }
        System.out.println("¿Deseas jugar de nuevo? (Si/No)");
        op=scanner.nextLine();
        //Agrega una verificacion de que el usuario agregue una opcion valida
        while(!op.equalsIgnoreCase("Si") && !op.equalsIgnoreCase("No")){
            System.out.println("Opción inválida. Por favor, ingresa 'Si' o 'No'.");
            op=scanner.nextLine();
        }
        //Agrega un if donde si el usuario ingresa "No" se le agradezca por jugar
        if(op.equalsIgnoreCase("No")){
            System.out.println("Gracias por jugar. ¡Hasta luego!");
        }
    }while(!op.equalsIgnoreCase("No"));
    }
}
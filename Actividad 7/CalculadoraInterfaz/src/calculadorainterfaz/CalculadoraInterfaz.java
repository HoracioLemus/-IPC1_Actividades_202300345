/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorainterfaz;

import modelo.*;
import vista.*;
import controlador.*;

import javax.swing.JOptionPane;
/**
 *
 * @author horaciolemus
 */
public class CalculadoraInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear modelo, vista y controlador
        Calculadora modelo = new Calculadora();
        CalculadoraVisual vista = new CalculadoraVisual();

        // Pedir nombre del usuario
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre:");
        Usuario usuario = new Usuario(nombreUsuario);

        // Crear controlador y mostrar interfaz
        ControlCalculadora controlador = new ControlCalculadora(modelo, vista, usuario);
        controlador.iniciar();
    }
    
}

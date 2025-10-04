/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import javax.swing.JOptionPane;
import modelo.Calculadora;
import modelo.Usuario;
import vista.CalculadoraVisual;
/**
 *
 * @author horaciolemus
 */
public class ControlCalculadora {
   private Calculadora modelo;
    private CalculadoraVisual vista;
    private Usuario usuario;
    
    public ControlCalculadora(Calculadora modelo, CalculadoraVisual vista, Usuario usuario) {
        this.modelo = modelo;
        this.vista = vista;
        this.usuario = usuario;

        this.vista.setUsuario(usuario.getNombre());

       vista.addSumaListener(e -> operar("sumar"));
        vista.addRestaListener(e -> operar("restar"));
        vista.addMultiplicaListener(e -> operar("multiplicar"));
        vista.addDivideListener(e -> operar("dividir"));
    }

    private void operar(String tipo) {
        try {
            double num1 = Double.parseDouble(vista.getNum1());
            double num2 = Double.parseDouble(vista.getNum2());
            double resultado = 0;

            switch (tipo) {
                case "sumar" -> resultado = modelo.sumar(num1, num2);
                case "restar" -> resultado = modelo.restar(num1, num2);
                case "multiplicar" -> resultado = modelo.multiplicar(num1, num2);
                case "dividir" -> resultado = modelo.dividir(num1, num2);
            }

            vista.setResultado(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Error: Ingrese solo números");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, ex.getMessage());
        }
    }

    public void iniciar() {
        vista.setVisible(true);
    }
}

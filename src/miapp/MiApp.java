package miapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class MiApp {
    public static void main(String[] args) {
        
        //CREAMOS UNA LIBRETA
      
       
                Libreta miLibreta = new Libreta(JOptionPane.showInputDialog("Introduce tu nombre"), JOptionPane.showInputDialog("Introduce tu DNI"));
           
        int contador=1;
        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Abrir agenda?\n******************************\n1. Sí\n2.No"));
            if (opcion == 1) {
                miLibreta.menuAgenda();
            } else if (opcion == 2) {
                contador = -5;
            } else {
                JOptionPane.showMessageDialog(null, "Eso no es una opción");
                
            }
        } while (contador > 0);
    
    
}
}

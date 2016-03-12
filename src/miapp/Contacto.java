
package miapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Contacto {
    /**
     * Los atributos de ID son necesarios para hacer un contador de autoincremento
     */
    private static int idBis;
    private int id;
    private String nombre;
    private String apellido;
    private String numero;
    private String email;
    
    /**
     * Constructor básico de la clase
     */
    public Contacto(){
       id = ++idBis;
    
    }
    
    /**
     * Getter básico del atributo ID
     * @return un integer del atributo ID
     */
    public int getId(){return id;}
    /**
     * Getter básico del atributo nombre
     * @return un String del atributo nombre
     */
    public String getNombre(){return nombre;}
     /**
     * Getter básico del atributo apellido
     * @return un String del atributo apellido
     */
    public String getApellido(){return apellido;}
     /**
     * Getter básico del atributo numero
     * @return un String del atributo numero
     */
    public String getNumero(){return numero;}
     /**
     * Getter básico del atributo email
     * @return un String del atributo email
     */
    public String getEmail(){return email;}
    
    /**
     * Setter básico del atributo nombre
     * @param nombre actualiza el atributo nombre
     */
    public void setNombre(String nombre){this.nombre=nombre;}
    /**
     * Setter básico del atributo apellido
     * @param apellido actualiza el atributo apellido
     */
    public void setApellido(String apellido){this.apellido=apellido;}
    /**
     * Setter básico del atributo numero
     * @param numero actualiza el atributo numero
     */
    public void setNumero(String numero){this.numero=numero;}
    /**
     * Setter básico del atributo email
     * @param email actualiza el atributo email
     */
    public void setEmail(String email){this.email=email;}
    
    /**
     * Muestra por pantalla la información contenida en los atributos
     */
    public void infoContacto(){
    JOptionPane.showMessageDialog(null, "Id: "+id+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nNúmero: "+numero+"\nEmail: "+email);
    
    }

   
}

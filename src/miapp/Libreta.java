package miapp;



import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Libreta {

    //ATRIBUTOS
    private String nombre;
    private String dni;
    public Contacto[] listaContactos;


    /**
     * Constructor básico de la clase
     * @param nombre
     * @param dni 
     */
    public Libreta(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        //Creamos el array vacÃ­o
       
        listaContactos = new Contacto[3];
        listaContactos[0] = new Contacto();
        listaContactos[1] = new Contacto();
        listaContactos[2] = new Contacto();
//        listaContactos[3] = new Contacto();
//        listaContactos[4] = new Contacto();
//        listaContactos[5] = new Contacto();
//        listaContactos[6] = new Contacto();
//        listaContactos[7] = new Contacto();
//        listaContactos[8] = new Contacto();
//        listaContactos[9] = new Contacto();
        }
    
    /**
     * Comprobar el número vacío de contactos en nuestra agenda
     * es decir, las posiciones del array todavía libres
     * @return un integer con las posiciones vacías
     */
    public int cualLibre() {
        int numId = -1;
        for (Contacto persona : listaContactos) {
            String nom = persona.getNombre();
            if (nom == null) {
                numId = persona.getId();
                break;
            }
            

        }
        return numId;
   }


    /**
     * Añade un objeto Contacto como atributo
     */
    public void anadir(){
    if(cualLibre()<0){
        JOptionPane.showMessageDialog(null, "Tu agenda está llena. Borra algún contacto");
    }
    else{
        int numId=cualLibre();
        for(Contacto persona : listaContactos){
        if(numId==persona.getId()){
        persona.setNombre(JOptionPane.showInputDialog("Introduzca el nombre del contacto:"));
        persona.setApellido(JOptionPane.showInputDialog("Introduzca el apellido del contacto:"));
        persona.setNumero(JOptionPane.showInputDialog("Introduzca el número del contacto:"));
        persona.setEmail(JOptionPane.showInputDialog("Introduzca el email del contacto:"));
        JOptionPane.showMessageDialog(null,"Contacto creado");
        break;
        }
        }
       
        
    }
    }
     
    /**
     * Muestra la lista del array, es decir de los objeto Contacto contenidos en él
     */
    public void listar(){
     for (Contacto persona : listaContactos) {
            //esto hace que nos liste los contactos que no tengan el nombre a null
            //HabrÃ¡ que ordenar el array alfabÃ©ticamente para que no haya saltos de nulls
            String nom = persona.getNombre();
            if (nom != null) {
               persona.infoContacto();
            }
            else{break;}
            
    }
    }

    /**
     * Modifica uno de los atributos de los objetos contenidos en el array
     */
    public void editar() {
        String nomEditable = JOptionPane.showInputDialog("¿Qué contacto desea modificar?");
        
        for (Contacto persona : listaContactos) {
           //Comprobamos que el nombre introducido existe
            if (nomEditable.equals(persona.getNombre())) {

                int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea modificar?\n***************************\n1. Nombre\n2.Apellido\n3.Número\n4.Email"));
                switch (opcion) {
                    case 1:
                        persona.setNombre(JOptionPane.showInputDialog("Introduzca el nuevo nombre del contacto:"));
                        break;
                    case 2:
                        persona.setApellido(JOptionPane.showInputDialog("Introduzca el nuevo apellido del contacto:"));
                        break;
                    case 3:
                       persona.setNumero(JOptionPane.showInputDialog("Introduzca el nuevo nÃºmero del contacto:"));
                        break;
                    case 4:
                        persona.setEmail(JOptionPane.showInputDialog("Introduzca el nuevo email del contacto:"));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Eso no es una opción");
                        break;
                }
            }
        }

    }
    
    /**
     * Deja en blanco todos los atributos de un objeto del array a excepción del ID
     */
    public void eliminar() {
        String nomEditable = JOptionPane.showInputDialog("¿Qué contacto desea eliminar?");
        
        for (Contacto persona : listaContactos) {
           
            if (nomEditable.equals(persona.getNombre())) {
                //No borramos el obejto, Ãºnicamente dejamos a null sus campos.
                    persona.setApellido(null);
                    persona.setNombre(null);
                    persona.setNumero(null);
                    persona.setEmail(null);
                
                }
            }
        }

    /**
     * Método que invoca un menú a través del cual funcionar la aplicación
     */
    public void menuAgenda(){   
    int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("¿Qué deseas hacer?\n******************************\n1. Añadir\n2.Editar\n3.Listar\n4.Eliminar"));
        switch (opcion2){
            case 1:
                anadir();
                break;
            case 2:
               editar();
                break;
            case 3:
                listar();
                break;
            case 4:
                eliminar();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Eso no es una opción");
                break;
                     
        }
     
    
    }
}

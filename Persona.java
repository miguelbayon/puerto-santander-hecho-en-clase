/**
 * Clase Persona para guardar los datos correspondientes a los propietarios
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 27-04-2017
 */
public class Persona
{
  
    private String nombre;
    private String dni;

    /**
     * Constructor de la clase Persona.
     * @param nombre es el nombre del propietario.
     * @dni dni de la persona
     */
    public Persona(String nombre, String dni)
    {
        this.nombre=nombre;
        this.dni=dni;
    }
  
  /**
     * Metodo que devuelve la información de la persona.
     * @return Información de la persona.
     */
    public String toString()
    {
        return "Nombre: " + nombre + " (" + dni + ")";
    }
}
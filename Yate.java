/**
 * Embarcación a motor con camarotes
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{
   private int numCamarotes;
	
	/**
      * Constructor de la clase Yate
      * @param propietario Dueño del barco
      * @param matriula Numero de identificación
      * @param eslora Longitud del barco
      * @param anioFabricacion Año en el que fue creado
      * @param numCamarotes Numero de camarotes
      * @param potencia Potencia del barco
     */

    public Yate(String matricula, double eslora, 
                int anoFabricacion,  Persona propietario, int potencia, int numCamarotes )
    {
        super(matricula, eslora, anoFabricacion, propietario, potencia);
        this.numCamarotes = numCamarotes;
    }
  
  /**
    * Metodo toString que devuelve una cadena
    * @return String Toda la informacion del yate
    */
   public String toString() 
   {
       String cadena ="";
       cadena += super.toString() + "\n" + "NºCamarotes: " + numCamarotes;;
       return cadena;
   }
  /**
     * Devuelve el valor del coeficiente de bernua en el caso de los yates.
     * @return coeficiente de Bernua.
     */
    @Override  
    public int getCoeficienteBernua()
    {
        return numCamarotes + super.getCoeficienteBernua();
    }

  
  
}

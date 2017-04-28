/**
 * Es la clase Velero, sera una clase hija de la clase barco
 * 
 *@author Oscar Fernandez Rodriguez
 *@version 1.0
 */
public class Velero extends Barco
{
   private int numMastiles;
  
  /**
     * Constructor for objects of class Velero
     * @param matricula chain of characters for saving matricula
     * @param eslora double number that saves the length of Ship
     * @param añoFabricacion whole number that saves only the year of fabrication of the ship
     * @param propietario class Persona that saves who is the owner of the ship
     * @param numMastiles whole number that saves how many mastils are in the ship
     */
    public Velero(String matricula, double eslora, int añoFabricacion,Persona propietario, int numMastiles) 
    {
        super(matricula,eslora,añoFabricacion,propietario);
        this.numMastiles = numMastiles;
    }
  
  /**
     * metodo que devuelve la informacion referente al velero.
     * @return Toda la informacion del velero.
    */
      @Override
    public String toString()
    {
        String cadenaADevolver = super.toString();;
        cadenaADevolver += "Numero de Mastiles" + numMastiles;
        return cadenaADevolver;
    }
  
  	 /**
    * El coeficiente de Bernua de un velero corresponde su numero de mastiles
    * @return El número de mastiles
    */
      @Override
   public int getCoeficienteBernua()
   {
       return numMastiles;
    }
  
}
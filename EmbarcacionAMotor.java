/**
 * Clase que representa una embarcacion con motor y no con mastiles.
 * @author Miguel RG.
 * @version 27/04/2017.
 */
public class EmbarcacionAMotor extends Barco
{
    
    private int potencia;

    /**
     * Constructor de la clase EmbarcacionAMotor.
     * @param matricula Matricula del barco.
     * @param eslora eslora del barco.
     * @param ano Año de fabricacion del barco.
     * @param propietario Propietario del barco.
     * @param potencia potencia en CV del motor de la embarcacion.
     */
    public EmbarcacionAMotor(String matricula, double eslora, int annoFabricacion, Persona propietario, int potencia)
    {
        super(matricula, eslora, annoFabricacion, propietario);
        this.potencia = potencia;
    }
  
  /**
     * Devuelve la información del objeto.
     * @return Cadena con la información sobre el objeto.
     */
      @Override
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += super.toString();
        textoADevolver += "Potencia: " + potencia + "\n";
        return textoADevolver;
    }
  
  /**
     * Devuelve un valor imprescindible para el cálculo total del alquiler de un tipo de barco.
     * @return potencia; el nº de caballos para operar en el precio del alquiler.
     */
    @Override
    public int getCoeficienteBernua() {
       return  potencia;
    }
}

/**
 * @Author Luis Javier Curbeira
 *
 * Define un tipo abstracto barco y sus atributos generales
 */
public abstract class Barco {
    private Persona propietario;
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    
    /**
      * @param propietario Dueño del barco
      * @param matriula Numero de identificación
      * @param eslora Longitud del barco
      * @param anioFabricacion Año en el que fue creado
      */
    public Barco(String matricula, double eslora, int anoFabricacion, Persona propietario) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        this. propietario = propietario;
    }
    
    /**
      * @return Eslora longitud del barco
      */
    public double getEslora(){
        return eslora;
    }
    
    /**
      * @see Velero#getCoeficienteBernua()
      * @see Yate#getCoeficienteBernua()
      * @see EmbarcacionAMotor#getCoeficienteBernua()
      */
    public abstract int getCoeficienteBernua();
    
   
    public String toString(){
        return " Matricula: " + matricula + "\n Eslora: " + eslora + "\n Año de fabricacion: " + anoFabricacion + propietario.toString();
    }
    

}
  
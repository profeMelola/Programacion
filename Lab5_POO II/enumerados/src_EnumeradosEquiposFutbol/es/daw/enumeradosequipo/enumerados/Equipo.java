package es.daw.enumeradosequipo.enumerados;

/**
 * enum es una clase especial que limita la creación de objetos a los especificados en su clase 
 * (por eso su constructor es privado, como se ve en el siguiente fragmento de código); 
 * pero estos objetos pueden tener atributos como cualquier otra clase. 
 * @author melol
 */
public enum Equipo
{
	BARÇA("FC Barcelona",1), REAL_MADRID("Real Madrid",2),
	SEVILLA("Sevilla FC",4), VILLAREAL("Villareal",7); 
	
	private String nombreClub;
	private int puestoLiga;
	
        /**
         * Constructor privado que solo es visible dentro de la clase Equipo y solo definimos los métodos get
         * @param nombreClub
         * @param puestoLiga 
         */
	private Equipo (String nombreClub, int puestoLiga){
		this.nombreClub = nombreClub;
		this.puestoLiga = puestoLiga;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public int getPuestoLiga() {
		return puestoLiga;
	}	
        
        public void setPuestoLiga(int puestoLiga){
            this.puestoLiga=puestoLiga;
        }
	
}
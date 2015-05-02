package concesionario;

public class Concesionario {
	//Comentario  nuevo  en   clase Concesionario

/**
	 * @return el nomConcesionario
	 */
	public String getNomConcesionario() {
		return nomConcesionario;
	}
	/**
	 * @param nomConcesionario el nomConcesionario a establecer
	 */
	public void setNomConcesionario(String nomConcesionario) {
		this.nomConcesionario = nomConcesionario;
	}
	/**
	 * @return el direcConcesionario
	 */
	public String getDirecConcesionario() {
		return direcConcesionario;
	}
	/**
	 * @param direcConcesionario el direcConcesionario a establecer
	 */
	public void setDirecConcesionario(String direcConcesionario) {
		this.direcConcesionario = direcConcesionario;
	}
/**
	 * @param nomConcesionario
	 * @param direcConcesionario
	 */
	public Concesionario(String nomConcesionario, String direcConcesionario) {
		super();
		this.nomConcesionario = nomConcesionario;
		this.direcConcesionario = direcConcesionario;
	}
String nomConcesionario;
String direcConcesionario;
}

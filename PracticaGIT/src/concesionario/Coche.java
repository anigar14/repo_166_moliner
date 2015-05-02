package concesionario;

public class Coche {
	
	//Comentario  nuevo  en   clase Coche
	/**
	 * @param matricula
	 * @param marca
	 * @param modelo
	 */
	public Coche(String matricula, String marca, String modelo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	String matricula;
	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "**************************\n******** Coche ***********\n->Matricula=" + matricula + "\n->Marca=" + marca
				+ "\n->Modelo=" + modelo + "\n***************************"
				;
		
	}
	String marca;
	String modelo;
	/**
	 * @return el matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula el matricula a establecer
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return el marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca el marca a establecer
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return el modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo el modelo a establecer
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}

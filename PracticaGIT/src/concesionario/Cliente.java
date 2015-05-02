package concesionario;

public class Cliente {
	/**
	 * @param idCliente
	 * @param nomCliente
	 * @param apeCliente
	 */
	public Cliente(String idCliente, String nomCliente, String apeCliente) {
		super();
		this.idCliente = idCliente;
		this.nomCliente = nomCliente;
		this.apeCliente = apeCliente;
	}
	String idCliente;
	String nomCliente;
	String apeCliente;
	/**
	 * @return el idCliente
	 */
	public String getIdCliente() {
		return idCliente;
	}
	/**
	 * @param idCliente el idCliente a establecer
	 */
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * @return el nomCliente
	 */
	public String getNomCliente() {
		return nomCliente;
	}
	/**
	 * @param nomCliente el nomCliente a establecer
	 */
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	/**
	 * @return el apeCliente
	 */
	public String getApeCliente() {
		return apeCliente;
	}
	/**
	 * @param apeCliente el apeCliente a establecer
	 */
	public void setApeCliente(String apeCliente) {
		this.apeCliente = apeCliente;
	}

}

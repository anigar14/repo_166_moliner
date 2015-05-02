package concesionario;

public class Vendedor { 
	
	//Comentario  nuevo  en   clase Vendedor
	/**
	 * @return el nomVendedor
	 */
	public String getNomVendedor() {
		return nomVendedor;
	}
	/**
	 * @param nomVendedor el nomVendedor a establecer
	 */
	public void setNomVendedor(String nomVendedor) {
		this.nomVendedor = nomVendedor;
	}
	/**
	 * @return el apeVendedor
	 */
	public String getApeVendedor() {
		return apeVendedor;
	}
	/**
	 * @param apeVendedor el apeVendedor a establecer
	 */
	public void setApeVendedor(String apeVendedor) {
		this.apeVendedor = apeVendedor;
	}
	/**
	 * @param nomVendedor
	 * @param apeVendedor
	 */
	public Vendedor(String nomVendedor, String apeVendedor) {
		super();
		this.nomVendedor = nomVendedor;
		this.apeVendedor = apeVendedor;
	}
	String nomVendedor;
	String apeVendedor;

}

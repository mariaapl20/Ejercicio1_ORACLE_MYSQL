package controlador;
import modelo.Cliente;

public class ClienteController {
	
	private Cliente aClientes[];
	private int iContClientes;
	
	public ClienteController(int numClientes) {
		aClientes = new Cliente[numClientes];
		setiContClientes(0);
	}

	// Metodos getters y setters
	public Cliente[] getaClientes() {
		return aClientes;
	}

	public void setaClientes(Cliente[] aClientes) {
		this.aClientes = aClientes;
	}

	public int getiContClientes() {
		return iContClientes;
	}

	public void setiContClientes(int iContClientes) {
		this.iContClientes = iContClientes;
	}

	// ##################
	// # SEARCH METHODS #
	// ##################
	public int searchPositionCliente(Cliente oCli) {
		int iPosicion = -1;
		int iContador = 0;
		while (iPosicion == -1 && iContador < aClientes.length) {
			if (oCli.equals(aClientes[iContador])) {
				iPosicion = iContador;
			}
			iContador++;
		}
		return iPosicion;
	}

	public Cliente searchCliente(Cliente oCli) {
		Cliente oDevolver = null;
		int iContador = 0;
		while (oDevolver == null && iContador < aClientes.length) {
			if (oCli.equals(aClientes[iContador])) {
				oDevolver = aClientes[iContador];
			}
			iContador++;
		}
		return oDevolver;
	}
	
	// ################### 
	// # CRUD OPERATIONS # 
	// # Cliente CLASS # 
	// ###################
	// CREATE
	public boolean addCliente(Cliente oCli) {
		boolean bExito = false;
		if (iContClientes < aClientes.length && searchPositionCliente(oCli) == -1) {
			aClientes[iContClientes] = oCli;
			setiContClientes(iContClientes + 1);
			bExito = true;
		}
		return bExito;
	}

	// READ
	public Cliente readCliente(Cliente oCli) {
		return searchCliente(oCli);
	}

	// UPDATE
	public boolean updateCliente(Cliente oCli) {
		boolean bExito = false;
		int iPosicion = searchPositionCliente(oCli);
		if (iPosicion != -1) {
			aClientes[iPosicion] = oCli;
			bExito = true;
		}
		return bExito;
	}

	// DELETE
	public boolean deleteCliente(Cliente oCli) {
		boolean bExito = false;
		int iPosicion = searchPositionCliente(oCli);
		if (iPosicion != -1) {
			for (int iCont = iPosicion + 1; iCont < aClientes.length; iCont++) {
				aClientes[iCont - 1] = aClientes[iCont];
			}
			aClientes[aClientes.length - 1] = null;
			setiContClientes(iContClientes - 1);
			bExito = true;
		}
		return bExito;
	}
	
	// PRINT ALL CLIENTES
	public String printClientes() {
		String sResultado = "";

		if (iContClientes == 0) {
			sResultado = "No hay clientes registrados en la aplicacion.";
		} else {
			for (int iCont = 0; iCont < iContClientes; iCont++) {
				sResultado += aClientes[iCont] + "\n";
			}
		}
		return sResultado;
	}
}

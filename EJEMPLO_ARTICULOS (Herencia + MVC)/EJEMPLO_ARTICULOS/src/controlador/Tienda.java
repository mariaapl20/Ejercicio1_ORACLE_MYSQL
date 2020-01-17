package controlador;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Empleado;

public class Tienda {

	// Atributos
	private ArticuloController artControl;
	private ClienteController cliControl;
	private EmpleadoController empControl;
	private String sNombre;
	
	// Constructores
	public Tienda(String sNombre, int numArticulos, int numClientes, int numEmpleados) {
		artControl = new ArticuloController(numArticulos);
		cliControl = new ClienteController(numClientes);
		empControl = new EmpleadoController(numEmpleados);
		setsNombre(sNombre);
	}

	// Métodos getters y setters
	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	// ################## 
	// # SEARCH METHODS # 
	// ##################
	public int searchPositionEmpleado(Empleado oEmp) {
		return empControl.searchPositionEmpleado(oEmp);
	}

	public Empleado searchEmpleado(Empleado oEmp) {
		return empControl.searchEmpleado(oEmp);
	}

	public int searchPositionCliente(Cliente oCli) {
		return cliControl.searchPositionCliente(oCli);
	}

	public Cliente searchCliente(Cliente oCli) {
		return cliControl.searchCliente(oCli);
	}

	public int searchPositionArticulo(Articulo oArt) {
		return artControl.searchPositionArticulo(oArt);
	}

	public Articulo searchArticulo(Articulo oArt) {
		return artControl.searchArticulo(oArt);
	}

	// ################### 
	// # CRUD OPERATIONS # 
	// # Cliente CLASS # 
	// ###################
	// CREATE
	public boolean addCliente(Cliente oCli) {
		return cliControl.addCliente(oCli);
	}

	// READ
	public Cliente readCliente(Cliente oCli) {
		return cliControl.readCliente(oCli);
	}

	// UPDATE
	public boolean updateCliente(Cliente oCli) {
		return cliControl.updateCliente(oCli);
	}

	// DELETE
	public boolean deleteCliente(Cliente oCli) {
		return cliControl.deleteCliente(oCli);
	}

	// PRINT ALL CLIENTES
	public String printClientes() {
		return cliControl.printClientes();
	}

	// ################### 
	// # CRUD OPERATIONS # 
	// # Empleado CLASS #
	// ###################
	// CREATE
	public boolean addEmpleado(Empleado oEmp) {
		return empControl.addEmpleado(oEmp);
	}

	// READ
	public Empleado readEmpleado(Empleado oEmp) {
		return empControl.readEmpleado(oEmp);
	}

	// UPDATE
	public boolean updateEmpleado(Empleado oEmp) {
		return empControl.updateEmpleado(oEmp);
	}

	// DELETE
	public boolean deleteEmpleado(Empleado oEmp) {
		return empControl.deleteEmpleado(oEmp);
	}

	// PRINT ALL EMPLEADOS
	public String printEmpleados() {
		return empControl.printEmpleados();
	}

	// ###################
	// # CRUD OPERATIONS #
	// # Articulo CLASS  #
	// ###################
	// CREATE
	public boolean addArticulo(Articulo oArt) {
		return artControl.addArticulo(oArt);
	}

	// READ
	public Articulo readArticulo(Articulo oArt) {
		return artControl.readArticulo(oArt);
	}

	// UPDATE
	public boolean updateArticulo(Articulo oArt) {
		return artControl.updateArticulo(oArt);
	}

	// DELETE
	public boolean deleteArticulo(Articulo oArt) {
		return artControl.deleteArticulo(oArt);
	}

	// PRINT ALL ARTICULOS
	public String printArticulos() {
		return artControl.printArticulos();
	}
}

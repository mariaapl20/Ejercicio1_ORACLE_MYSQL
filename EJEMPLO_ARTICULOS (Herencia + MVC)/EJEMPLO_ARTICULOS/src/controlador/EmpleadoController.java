package controlador;
import modelo.Empleado;

public class EmpleadoController {
	
	private Empleado aEmpleados[];
	private int iContEmpleados;
	
	public EmpleadoController(int numEmpleados) {
		aEmpleados = new Empleado[numEmpleados];
		setiContEmpleados(0);
	}
	
	// Metodos getters y setters
	public Empleado[] getaEmpleados() {
		return aEmpleados;
	}

	public void setaEmpleados(Empleado[] aEmpleados) {
		this.aEmpleados = aEmpleados;
	}

	public int getiContEmpleados() {
		return iContEmpleados;
	}

	public void setiContEmpleados(int iContEmpleados) {
		this.iContEmpleados = iContEmpleados;
	}

	// ##################
	// # SEARCH METHODS #
	// ##################
	public int searchPositionEmpleado(Empleado oEmp) {
		int iPosicion = -1;
		int iContador = 0;
		while (iPosicion == -1 && iContador < aEmpleados.length) {
			if (oEmp.equals(aEmpleados[iContador])) {
				iPosicion = iContador;
			}
			iContador++;
		}
		return iPosicion;
	}

	public Empleado searchEmpleado(Empleado oEmp) {
		Empleado oDevolver = null;
		int iContador = 0;
		while (oDevolver == null && iContador < aEmpleados.length) {
			if (oEmp.equals(aEmpleados[iContador])) {
				oDevolver = aEmpleados[iContador];
			}
			iContador++;
		}
		return oDevolver;
	}
	
	// ################### 
	// # CRUD OPERATIONS # 
	// # Empleado CLASS #
	// ###################
	// CREATE
	public boolean addEmpleado(Empleado oEmp) {
		boolean bExito = false;
		if (iContEmpleados < aEmpleados.length && searchPositionEmpleado(oEmp) == -1) {
			aEmpleados[iContEmpleados] = oEmp;
			setiContEmpleados(iContEmpleados + 1);
			bExito = true;
		}
		return bExito;
	}

	// READ
	public Empleado readEmpleado(Empleado oEmp) {
		return searchEmpleado(oEmp);
	}

	// UPDATE
	public boolean updateEmpleado(Empleado oEmp) {
		boolean bExito = false;
		int iPosicion = searchPositionEmpleado(oEmp);
		if (iPosicion != -1) {
			aEmpleados[iPosicion] = oEmp;
			bExito = true;
		}
		return bExito;
	}

	// DELETE
	public boolean deleteEmpleado(Empleado oEmp) {
		boolean bExito = false;
		int iPosicion = searchPositionEmpleado(oEmp);
		if (iPosicion != -1) {
			for (int iCont = iPosicion + 1; iCont < aEmpleados.length; iCont++) {
				aEmpleados[iCont - 1] = aEmpleados[iCont];
			}
			aEmpleados[aEmpleados.length - 1] = null;
			setiContEmpleados(iContEmpleados - 1);
			bExito = true;
		}
		return bExito;
	}
	
	// PRINT ALL EMPLEADOS
	public String printEmpleados() {
		String sResultado = "";

		if (iContEmpleados == 0) {
			sResultado = "No hay empleados registrados en la aplicacion.";
		} else {
			for (int iCont = 0; iCont < iContEmpleados; iCont++) {
				sResultado += aEmpleados[iCont] + "\n";
			}
		}
		return sResultado;
	}
}

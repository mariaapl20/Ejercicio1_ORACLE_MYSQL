package controlador;
import modelo.Articulo;

public class ArticuloController {

	private Articulo aArticulos[];
	private int iContArticulos;
	
	public ArticuloController(int numArticulos) {
		aArticulos = new Articulo[numArticulos];
		setiContArticulos(0);
	}
	
	// Metodos getters y setters
	public Articulo[] getaArticulos() {
		return aArticulos;
	}


	public void setaArticulos(Articulo[] aArticulos) {
		this.aArticulos = aArticulos;
	}


	public int getiContArticulos() {
		return iContArticulos;
	}


	public void setiContArticulos(int iContArticulos) {
		this.iContArticulos = iContArticulos;
	}

	// ##################
	// # SEARCH METHODS #
	// ##################
	public int searchPositionArticulo(Articulo oArt) {
		int iPosicion = -1;
		int iContador = 0;
		while (iPosicion == -1 && iContador < aArticulos.length) {
			if (oArt.equals(aArticulos[iContador])) {
				iPosicion = iContador;
			}
			iContador++;
		}
		return iPosicion;
	}

	public Articulo searchArticulo(Articulo oArt) {
		Articulo oDevolver = null;
		int iContador = 0;
		while (oDevolver == null && iContador < aArticulos.length) {
			if (oArt.equals(aArticulos[iContador])) {
				oDevolver = aArticulos[iContador];
			}
			iContador++;
		}
		return oDevolver;
	}
	
	// ###################
	// # CRUD OPERATIONS #
	// ###################
	// CREATE
	public boolean addArticulo(Articulo oArt) {
		boolean bExito = false;
		if (iContArticulos < aArticulos.length && searchPositionArticulo(oArt) == -1) {
			aArticulos[iContArticulos] = oArt;
			setiContArticulos(iContArticulos + 1);
			bExito = true;
		}
		return bExito;
	}

	// READ
	public Articulo readArticulo(Articulo oArt) {
		return searchArticulo(oArt);
	}

	// UPDATE
	public boolean updateArticulo(Articulo oArt) {
		boolean bExito = false;
		int iPosicion = searchPositionArticulo(oArt);
		if (iPosicion != -1) {
			aArticulos[iPosicion] = oArt;
			bExito = true;
		}
		return bExito;
	}

	// DELETE
	public boolean deleteArticulo(Articulo oArt) {
		boolean bExito = false;
		int iPosicion = searchPositionArticulo(oArt);
		if (iPosicion != -1) {
			for (int iCont = iPosicion + 1; iCont < aArticulos.length; iCont++) {
				aArticulos[iCont - 1] = aArticulos[iCont];
			}
			aArticulos[aArticulos.length - 1] = null;
			setiContArticulos(iContArticulos - 1);
			bExito = true;
		}
		return bExito;
	}

	// PRINT ALL ARTICULOS
	public String printArticulos() {
		String sResultado = "";

		if (iContArticulos == 0) {
			sResultado = "No hay articulos registrados en la aplicacion.";
		} else {
			for (int iCont = 0; iCont < iContArticulos; iCont++) {
				sResultado += aArticulos[iCont] + "\n";
			}
		}
		return sResultado;
	}
}

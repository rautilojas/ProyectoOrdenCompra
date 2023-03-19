package proyectoOrdenCompra;

public class Producto {

	String fabricante;
	String nombre;
	int precio;
	
	public Producto(String fabricante, String nombre, int precio) {
		super();
		this.fabricante = fabricante;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}
	
}
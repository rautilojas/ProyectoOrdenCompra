package proyectoOrdenCompra;

public class Cliente {
	
	private String nombre;
	private String apellido;
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Cliente(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
}
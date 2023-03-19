package proyectoOrdenCompra;
import java.util.Date;

public class OrdenCompra {
	
	private int id;
	private String descripcion;
	private Date fecha;
	private Cliente cliente;
	private Producto[] productos = new Producto[4];
	private int contadorProductos = 0;
	
	public OrdenCompra(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public int getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void addProducto(Producto producto) {
		if (contadorProductos < 4) {
			productos[contadorProductos] = producto;
			contadorProductos++;
		}
	}
	
	public int getGranTotal() {
		int granTotal = 0;
		for(int i = 0; i<productos.length; i++) {
			if (productos[i] != null) {
				granTotal += productos[i].getPrecio(); 
			}
		}
		return granTotal;
	}
}
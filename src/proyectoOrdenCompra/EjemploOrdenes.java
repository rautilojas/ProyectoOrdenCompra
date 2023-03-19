package proyectoOrdenCompra;
import java.util.Date;

public class EjemploOrdenes {
	
	public static void main (String[] args) {
		Producto producto1 = new Producto("Apple", "iPhone 13", 650000);
		Producto producto2 = new Producto("Samsung", "Galaxy S23", 500000);
		Producto producto3 = new Producto("Xiaomi", "Mi 10", 130000);
		Producto producto4 = new Producto("Motorola", "Edge 30", 270000);
		
		Cliente cliente1 = new Cliente("Julian", "Macri");
		Cliente cliente2 = new Cliente("Ana", "Verduguez");
		Cliente cliente3 = new Cliente("Francisco", "Tarifa");
		Cliente cliente4 = new Cliente("Juan", "Manuel");
		
		OrdenCompra orden1 = new OrdenCompra("Orden 1");
	    orden1.setCliente(cliente1);
	    orden1.setFecha(new Date());
	    orden1.addProducto(producto1);
	        
	    OrdenCompra orden2 = new OrdenCompra("Orden 2");
	    orden2.setCliente(cliente2);
	    orden2.setFecha(new Date());
	    orden2.addProducto(producto2);
	        
	    OrdenCompra orden3 = new OrdenCompra("Orden 3");
	    orden3.setCliente(cliente3);
	    orden3.setFecha(new Date());
	    orden3.addProducto(producto3);
	    orden3.addProducto(producto4);
	        
	    System.out.println("Orden 1:");
	    System.out.println("Descripción: " + orden1.getDescripcion());
	    System.out.println("Fecha: " + orden1.getFecha());
	    System.out.println("Cliente: " + orden1.getCliente().getNombre() + " " + orden1.getCliente().getApellido());
	    System.out.println("Productos:");
	    for (Producto producto : orden1.getProductos()) {
	    	if (producto != null) {
	    		System.out.println("- " + producto.getFabricante() + " " + producto.getNombre() + " $" + producto.getPrecio());
	        }
	    }
	    System.out.println("Gran total: $" + orden1.getGranTotal());
	        
	    System.out.println("Orden 2:");
	    System.out.println("Descripción: " + orden2.getDescripcion());
	    System.out.println("Fecha: " + orden2.getFecha());
	    System.out.println("Cliente: " + orden2.getCliente().getNombre() + " " + orden2.getCliente().getApellido());
	    System.out.println("Productos:");
	    for (Producto producto : orden2.getProductos()) {
	    	if (producto != null) {
	    		System.out.println("- " + producto.getFabricante() + " " + producto.getNombre() + " $" + producto.getPrecio());
	        }
	    }
	    System.out.println("Gran total: $" + orden2.getGranTotal());
	        
	    System.out.println("Orden 3:");
	    System.out.println("Descripción: " + orden3.getDescripcion());
	    System.out.println("Fecha: " + orden3.getFecha());
	    System.out.println("Cliente: " + orden3.getCliente().getNombre() + " " + orden3.getCliente().getApellido());
	    System.out.println("Productos:");
	    for (Producto producto : orden3.getProductos()) {
	    	if (producto != null) {
	    		System.out.println("- " + producto.getFabricante() + " " + producto.getNombre() + " $" + producto.getPrecio());
	        }
	    }
	    System.out.println("Gran total: $" + orden3.getGranTotal());    
	}

}
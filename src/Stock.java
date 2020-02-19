import java.util.HashMap;
import java.util.Set;

public class Stock {

	HashMap<Producto, Integer> almacen;

	public Stock() {
		almacen = new HashMap<Producto, Integer>();
	}

	public int a�adirStock(Producto p, int stock) {
		int a�adir = -1;
		if (almacen.put(p, stock) == null) {
			a�adir = 1;
		}
		return a�adir;
	}

	public int aumentarStock(int idprod, int num) {
		Set<Producto> productos = almacen.keySet();
		Producto aux;
		int aumentado = -1;
		for (Producto p : productos) {
			if (p.getId() == idprod) {
				aux = p;
				almacen.put(aux, almacen.get(aux) + num);
				aumentado = 1;
				break;
			}
		}
		return aumentado;
	}

	public int eliminarProducto(int idprod) {
		Set<Producto> productos = almacen.keySet();
		Producto aux;
		int aumentado = -1;
		for (Producto p : productos) {
			if (p.getId() == idprod) {
				aux = p;
				if (almacen.remove(aux) != null) {
					aumentado = 1;
				}
				break;
			}
		}

		return aumentado;
	}

	public void mostrarStockProducto() {
		Set<Producto> productos = almacen.keySet();

		for (Producto p : productos) {
			System.out.println(p.toString() + " con Stock: " + almacen.get(p));
		}
	}

}

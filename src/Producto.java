/**
 * 
 * @author USUARIO
 * @version 0.1
 */
public class Producto {
	private int id;
	private String nombre;
	private float precio;
	private String descripcion;

	/**
	 * Constructor vacío que crea un objeto de la clase Producto con los valores por
	 * defecto de sus atributos
	 */
	public Producto() {

	}

	/**
	 * Constructor con parámetros de todos los atributos de la clase.
	 * 
	 * @param id          Identificador del producto
	 * @param nombre      Nombre del producto
	 * @param precio      Precio de venta del producto, que tendra que ser positivo
	 * @param descripcion Descripcion del producto
	 * @throws Exception Excepción que se lanza cuando el precio que se pasa por
	 *                   parametro es negativo
	 */
	public Producto(int id, String nombre, float precio, String descripcion) throws Exception {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		if (precio >= 0) {
			this.precio = precio;
		} else {
			throw new Exception("Valor inválido");
		}
	}

	/**
	 * Metodo que devuelve el identificador del producto
	 * 
	 * @return Identificador del producto
	 */
	public int getId() {
		return id;
	}

	/**
	 * Metodo que cambia el valor del identificador por uno que se le pasa por
	 * parametro
	 * 
	 * @param id Identificador nuevo que se desea asignar al producto
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Metodo que devuelve el nombre del producto
	 * 
	 * @return Nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que cambia el valor del nombre por el nuevo que se le pasa como
	 * parametro
	 * 
	 * @param nombre Nombre nuevo que se queire asignar al producto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que devuelve el precio del producto
	 * 
	 * @return Precio de venta del producto
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * Metodo que actualiza el precio del producto por uno nuevo que se le pasa como
	 * parametro
	 * 
	 * @param precio Precio nuevo del producto, deberá ser mayor o igual a 0
	 * @throws Exception Excepcion que se lanza si se introduce un precio negativo
	 */
	public void setPrecio(float precio) throws Exception {
		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new Exception("Valor inválido");
		}

	}

	/**
	 * Metodo que devuelve la descripcion del producto
	 * 
	 * @return Devuelve la descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Metodo que actualiza la descripcion de un producto
	 * 
	 * @param descripcion Nueva descripcion del producto
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Metodo que devuelve las caracteristicas del producto
	 * 
	 * @return Devuelve una cadena con las caracteristicas del producto
	 */
	public String toString() {
		return "Productos{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion
				+ '}';
	}

}
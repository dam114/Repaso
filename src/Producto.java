/**
 * 
 * @author USUARIO
 * @version 0.1
 */
public class Producto {
	private int id = 0;
	private String nombre;
	private double precio = 0.0;
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
	 */
	public Producto(int id, String nombre, double precio, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
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
	public double getPrecio() {
		return precio;
	}

	/**
	 * Metodo que actualiza el precio del producto por uno nuevo que se le pasa como
	 * parametro
	 * 
	 * @param precio Precio nuevo del producto, deberá ser mayor o igual a 0
	 * @throws Exception Excepcion que se lanza si se introduce un precio negativo
	 */
	public void setPrecio(double precio) throws Exception {
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
	 * Metodo que añade al precio del articulo el incremento que se le pasa como
	 * parametro
	 * 
	 * @param incremento Parametro que indica el incremento que se le va a añadir al
	 *                   precio del producto. Debera ser positivo y menor de 20.
	 * @throws Exception Excepcion que se lanza si el incremento es negativo o mayor
	 *                   de 20.
	 */
	public void ampliarPrecio(double incremento) throws Exception {
		if (incremento >= 0 && incremento <= 20) {
			precio = precio + incremento;
		} else {
			throw new Exception("Valor inválido");
		}

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
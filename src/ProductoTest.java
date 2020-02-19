import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {

	Producto producto = new Producto(123, "mesa", 20.50, "auxiliar");
	Producto productoVacio = new Producto();

	@Test
	void testProductoVacio() {
		assertEquals(0, productoVacio.getId());
		assertNull(productoVacio.getNombre());
		assertEquals(0.0, productoVacio.getPrecio());
		assertNull(productoVacio.getDescripcion());
	}

	@Test
	void testProductoIntStringFloatString() {
		assertEquals(123, producto.getId());
		assertEquals("mesa", producto.getNombre());
		assertEquals(20.50, producto.getPrecio());
		assertEquals("auxiliar", producto.getDescripcion());
	}

	@Test
	void testGetId() {
		assertEquals(123, producto.getId());
	}

	@Test
	void testSetId() {
		producto.setId(1234);
		assertEquals(1234, producto.getId());
	}

	@Test
	void testGetNombre() {
		assertEquals("mesa", producto.getNombre());
	}

	@Test
	void testSetNombre() {
		producto.setNombre("Mesa");
		assertEquals("Mesa", producto.getNombre());
	}

	@Test
	void testGetPrecio() {
		assertEquals(20.5, producto.getPrecio());
	}

	@Test
	void testSetPrecioValido() {
		try {
			producto.setPrecio(1);
			assertEquals(1, producto.getPrecio());
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	@Test
	void testSetPrecioInvalido() {
		boolean exceptionLanzada = false;
		try {
			producto.setPrecio(-1);
		} catch (Exception e) {
			exceptionLanzada = true;
		}
		assertTrue(exceptionLanzada);
	}

	@Test
	void ampliarPrecioNegativo() {
		Boolean excepcionLanzada = false;
		try {
			producto.setPrecio(-1);

		} catch (Exception e) {
			excepcionLanzada = true;
		}
		assertTrue(excepcionLanzada);
	}

	@Test
	void ampliarPrecioPositivoMayorMax() {
		boolean exceptionLanzada = false;
		try {
			producto.ampliarPrecio(21);
		} catch (Exception e) {
			exceptionLanzada = true;
		}
		assertTrue(exceptionLanzada);
	}

	void ampliarPrecioPositivoMenorMax() {
		Double precioAnterior = producto.getPrecio();
		boolean exceptionLanzada = false;
		try {
			producto.ampliarPrecio(0);
			assertEquals(precioAnterior, producto.getPrecio());
			producto.ampliarPrecio(20);
			assertEquals((precioAnterior + 20), producto.getPrecio());
			producto.ampliarPrecio(10);
			assertEquals((precioAnterior + 10), producto.getPrecio());

		} catch (Exception e) {
			exceptionLanzada = true;
		}
		assertFalse(exceptionLanzada);
	}

}

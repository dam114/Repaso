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
			producto.setPrecio(22.5);
			assertEquals(22.5, producto.getPrecio());
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	@Test
	void testSetPrecioInvalido() {
		boolean exceptionLanzada = false;
		try {
			producto.setPrecio(-10);

		} catch (Exception e) {
			exceptionLanzada = true;
		}
		assertTrue(exceptionLanzada);
	}

	@Test
	void ampliarPrecioValido() {
		try {
			producto.setPrecio(-10);
			assertEquals(22.5, producto.getPrecio());
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	@Test
	void ampliarPrecioInvalido() {
		boolean exceptionLanzada = false;
		try {
			producto.ampliarPrecio(-10);
		} catch (Exception e) {
			exceptionLanzada = true;
		}
		assertTrue(exceptionLanzada);
	}

}

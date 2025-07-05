import org.junit.Assert.*
import org.junit.Test

class ProductUtilsTest {

    @Test
    fun `Dado un listado de productos, se muestra la información en pantalla`() {
        val products = listOf(
            Product(1, "iPhone 13", "The latest iPhone from Apple", 999.99, "USD", true),
            Product(2, "Samsung Galaxy S21", "The latest Samsung phone", 899.99, "USD", true)
        )

        val result = ProductUtils.getProductDisplayList(products)

        assertEquals(2, result.size)
        assertTrue(result[0].contains("iPhone 13"))
        assertTrue(result[1].contains("Samsung Galaxy S21"))
    }

    @Test
    fun `Dado un listado vacío, no se muestra información`() {
        val products = emptyList<Product>()

        val result = ProductUtils.getProductDisplayList(products)

        assertTrue(result.isEmpty())
    }
}
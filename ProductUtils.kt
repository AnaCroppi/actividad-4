object ProductUtils {
    fun getProductDisplayList(products: List<Product>): List<String> {
        return if (products.isEmpty()) emptyList()
        else products.map { "\${it.name} - \${it.price} \${it.currency}" }
    }
}
package pl.edu.vistula.first_rest_api_spring.product.support;

import pl.edu.vistula.first_rest_api_spring.product.support.Exception.ProductNotFoundException;
import java.util.function.Supplier;

public class ProductExceptionSupplier {

    public static Supplier<ProductNotFoundException> productNotFound(Long id) {
        return () -> new ProductNotFoundException(id);
    }
}
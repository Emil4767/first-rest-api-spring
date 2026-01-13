package pl.edu.vistula.first_rest_api_spring.product.support.Exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super(String.format("Product with %d not found", id));
    }
}
//package pl.edu.vistula.first_rest_api_spring.product.repository;
//
//import org.springframework.stereotype.Repository;
//import pl.edu.vistula.first_rest_api_spring.product.domain.Product;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Optional;
//
//@Repository
//public class OldProductRepository {
//
//    private final Map<Long, Product> products = new HashMap<>();
//    private Long nextId = 1L;
//
//    public Product save(Product product) {
//        if (product.getId() == null) {
//            product.setId(nextId);
//            nextId++;
//        }
//        products.put(product.getId(), product);
//        return product;
//    }
//
//    public Optional<Product> findById(Long id) {
//        return Optional.ofNullable(products.get(id));
//    }
//
//    public Collection<Product> findAll() {
//        return products.values();
//    }
//
//    public void delete(Long id) {
//        products.remove(id);
//    }
//}
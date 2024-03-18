package vn.edu.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.fit.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}

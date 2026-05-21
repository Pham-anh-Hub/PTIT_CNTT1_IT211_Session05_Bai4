package session05_bai4.ptit_cntt1_it211_session05_bai4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import session05_bai4.ptit_cntt1_it211_session05_bai4.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
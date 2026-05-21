package session05_bai4.ptit_cntt1_it211_session05_bai4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import session05_bai4.ptit_cntt1_it211_session05_bai4.entity.Product;
import session05_bai4.ptit_cntt1_it211_session05_bai4.repository.ProductRepository;

@SpringBootApplication
public class PtitCntt1It211Session05Bai4Application {

    public static void main(String[] args) {
        SpringApplication.run(PtitCntt1It211Session05Bai4Application.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return args -> {

            if (productRepository.count() == 0) {

                Product p1 = new Product();
                p1.setName("Bút bi");
                p1.setPrice(10000);

                Product p2 = new Product();
                p2.setName("Thước kẻ");
                p2.setPrice(15000);

                Product p3 = new Product();
                p3.setName("Vở học sinh");
                p3.setPrice(20000);

                productRepository.save(p1);
                productRepository.save(p2);
                productRepository.save(p3);

            }
        };
    }
}

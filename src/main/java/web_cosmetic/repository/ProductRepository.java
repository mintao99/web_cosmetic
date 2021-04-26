package web_cosmetic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web_cosmetic.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}

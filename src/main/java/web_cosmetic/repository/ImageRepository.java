package web_cosmetic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web_cosmetic.entity.ImageEntity;

public interface ImageRepository extends JpaRepository<ImageEntity, Integer>{

}

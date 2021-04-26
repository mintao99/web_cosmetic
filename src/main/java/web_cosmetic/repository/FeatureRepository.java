package web_cosmetic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web_cosmetic.entity.FeatureEntity;

public interface FeatureRepository extends JpaRepository<FeatureEntity, Integer> {

}

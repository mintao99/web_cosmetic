package web_cosmetic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web_cosmetic.entity.FeatureEntity;
import web_cosmetic.repository.FeatureRepository;

@Service
public class FeatureServiceT {
	
	@Autowired
	FeatureRepository featureRepository;
	
	public Iterable<FeatureEntity> findAll(){
		return featureRepository.findAll();
	}
	
	public FeatureEntity findOne(int id) {
		return featureRepository.findOne(id);
	}
	
	public void delete(int id) {
		featureRepository.delete(id);
	}

}

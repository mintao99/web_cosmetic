package web_cosmetic.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web_cosmetic.entity.FeatureEntity;
import web_cosmetic.service.FeatureServiceT;

@CrossOrigin
@RestController
@RequestMapping("api")
public class FeatureApiT {

	@Autowired
	private FeatureServiceT featureService;
	
	//lấy tất cả
	@GetMapping("/feature")
	public List<FeatureEntity> getAll(){
		return (List<FeatureEntity>) featureService.findAll();
	}
	
	//xóa
	@DeleteMapping("/feature/{id}")
	public void deleteById(@PathVariable("id") int id) {
		FeatureEntity s = featureService.findOne(id);
		if(s == null) {
			System.out.println("Not exsit ID! Dont delete!");
			return;
		}
		featureService.delete(id);
	}
}

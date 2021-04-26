package web_cosmetic.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import web_cosmetic.dto.CategoryDTO;
import web_cosmetic.service.ICategoryService;

@CrossOrigin
@RestController
public class CategoryApi {

	@Autowired
	private ICategoryService categoryService;
	
	@PostMapping(value = "/category")
	public CategoryDTO add(@RequestBody CategoryDTO model) {
		return categoryService.save(model);
	}
}

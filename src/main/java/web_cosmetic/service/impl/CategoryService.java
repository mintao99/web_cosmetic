package web_cosmetic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web_cosmetic.converter.CategoryConverter;
import web_cosmetic.dto.CategoryDTO;
import web_cosmetic.entity.CategoryEntity;
import web_cosmetic.repository.CategoryRepository;
import web_cosmetic.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CategoryConverter categoryConverter;

	public CategoryDTO save(CategoryDTO categoryDTO) {
		CategoryEntity categoryEntity = categoryConverter.toEntity(categoryDTO);
		categoryEntity = categoryRepository.save(categoryEntity);
		return categoryConverter.toDTO(categoryEntity);
	}

}

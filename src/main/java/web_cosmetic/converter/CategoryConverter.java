package web_cosmetic.converter;

import org.springframework.stereotype.Component;

import web_cosmetic.dto.CategoryDTO;
import web_cosmetic.entity.CategoryEntity;

@Component
public class CategoryConverter {

	public CategoryEntity toEntity(CategoryDTO dto) {
		CategoryEntity entity = new CategoryEntity();
		entity.setName(dto.getName());
		return entity;
	}
	
	public CategoryDTO toDTO(CategoryEntity entity) {
		CategoryDTO dto = new CategoryDTO();
		dto.setName(entity.getName());
		return dto;
	}
}

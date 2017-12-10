package sai.com.backend.dao;

import java.util.List;

import sai.com.backend.dto.Category;

public interface CategoryDAO {

	Category get(int id);
	List<Category> list();
	
	
}

package sai.com.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sai.com.backend.dao.CategoryDAO;
import sai.com.backend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

private static List<Category> categories=new ArrayList<> ();
	

static {
	Category 
	 category=new Category();
	
		category.setId(1);
		category.setName("WATCH");
		category.setDescription("this is watch");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		 category=new Category();
			
			category.setId(2);
			category.setName("CAMERA");
			category.setDescription("this is camera");
			category.setImageURL("CAT_2.png");
			categories.add(category);
			
			 category=new Category();
				
				category.setId(3);
				category.setName("MOBILE");
				category.setDescription("this is camera");
				category.setImageURL("CAT_3.png");
				categories.add(category);
				

}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//enhanced for loop
		
		for(Category category : categories)
		{
			if(category.getId()==id) return category;
		}
		return null;
	}

}

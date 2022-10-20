package DataAcces;

import Entities.Category;

public class JdbsCategoryDao implements ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("JDBS ile veri tabanına eklendi"+category.getCategoryName());
    }
}

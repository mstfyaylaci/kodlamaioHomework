package DataAcces;

import Entities.Category;

public class HibernateCategoryDao implements  ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi"+category.getCategoryName());
    }
}

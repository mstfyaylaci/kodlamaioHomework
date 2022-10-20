package Business;

import Core.Logging.ILogger;
import DataAcces.ICategoryDao;
import Entities.Category;

import java.util.ArrayList;

public class CategoryManager {

    private ICategoryDao categoryDao;
    private ILogger[] loggers;
    private ArrayList<Category> categories=new ArrayList<>();

    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void  add(Category category) throws Exception{

        for (Category categories:categories) {
            if (category.getCategoryName().equals(categories.getCategoryName())){
                throw new Exception("kategori ismi tekrar edemez");
            }
        }


        categoryDao.add(category);

        for (ILogger loger:loggers) {
            loger.log(category.getCategoryName());
        }
    }
}

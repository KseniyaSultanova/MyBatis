package MyBatis;

import com.geekbrains.db.dao.CategoriesMapper;
import com.geekbrains.db.dao.ProductsMapper;
import com.geekbrains.db.model.CategoriesExample;
import com.geekbrains.db.model.Products;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {
//        SqlSessionFactory sqlSessionFactory;
//        String resource = "mybatis-config.xml";
//        InputStream is = Resources.getResourceAsStream(resource);
//        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//
//    }
//
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
//                .build(Resources.getResourceAsStream("myBatisConfig.xml"));
//        try (SqlSession session = sessionFactory.openSession()) {
//            ProductsMapper productsMapper = session.getMapper(ProductsMapper.class);
//            //CategoriesMapper categoriesMapper = session.getMapper(CategoriesMapper.class);
//            Products product = ProductsMapper.selectByPrimaryKey(444L);
//            System.out.println(product);
//        }
//
//    }
//
//        public static Integer countNumberOfAllCategories () {
//            CategoriesMapper categoriesMapper = getCategoriesMapper(resource);
//            CategoriesExample example = new CategoriesExample();
//            return Math.toIntExact(categoriesMapper.countByExample(example));
//        }
    }
}
    
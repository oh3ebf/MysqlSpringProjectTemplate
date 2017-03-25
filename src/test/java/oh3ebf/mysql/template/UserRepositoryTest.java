/**
 * Software: Spring Mysql template
 * Module: UserRepositoryTest class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 10.10.2016
 */
package oh3ebf.mysql.template;

import oh3ebf.mysql.template.repositories.UserRepository;
import oh3ebf.mysql.template.model.User;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ActiveProfiles("testing")
public class UserRepositoryTest {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    public void testSaveProduct() {
        //setup product
        User user = new User();

        // save product, verify has ID value after save
        assertNull(user.getId()); // null before save
        userRepository.save(user);
        
        assertNotNull(user.getId()); //not null after save

        //fetch from DB
        User fetchedUser = userRepository.findOne(user.getId());

        //should not be null
        assertNotNull(fetchedUser);
        /*
         //should equal
         assertEquals(product.getId(), fetchedProduct.getId());
         assertEquals(product.getDescription(), fetchedProduct.getDescription());

         //update description and save
         fetchedProduct.setDescription("New Description");
         productRepository.save(fetchedProduct);

         //get from DB, should be updated
         Product fetchedUpdatedProduct = productRepository.findOne(fetchedProduct.getId());
         assertEquals(fetchedProduct.getDescription(), fetchedUpdatedProduct.getDescription());

         //verify count of products in DB
         long productCount = productRepository.count();
         assertEquals(productCount, 1);

         //get all products, list should only have one
         Iterable<Product> products = productRepository.findAll();

         int count = 0;

         for(Product p : products){
         count++;
         }

         assertEquals(count, 1);
         */
    }
}

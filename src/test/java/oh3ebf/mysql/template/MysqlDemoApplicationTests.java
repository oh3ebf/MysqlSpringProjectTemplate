/**
 * Software: Spring Mysql template
 * Module: Application unit test class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 10.10.2016
 */
package oh3ebf.mysql.template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MysqlDemoApplication.class)
//@WebAppConfiguration
@ActiveProfiles("testing")
public class MysqlDemoApplicationTests {
    
    @Test
    public void contextLoads() {
    }

}

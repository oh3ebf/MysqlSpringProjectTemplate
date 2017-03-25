/**
 * Software: Spring Mysql template
 * Module: RepositoryConfiguration class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 10.10.2016
 */
package oh3ebf.springorganizer.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"oh3ebf.mysql.template.model"})
@EnableJpaRepositories(basePackages = {"oh3ebf.mysql.template.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {

}

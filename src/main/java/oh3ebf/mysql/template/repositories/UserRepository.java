/*
 * Software: SpringOrganizer
 * Module: UserRepository class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 9.10.2016
 */

package oh3ebf.mysql.template.repositories;

import oh3ebf.mysql.template.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface UserRepository extends CrudRepository<User, Long>{    
    
}

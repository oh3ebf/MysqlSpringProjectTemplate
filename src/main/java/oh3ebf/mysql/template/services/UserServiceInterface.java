/*
 * Software: Spring Mysql template
 * Module: UserServiceInterface class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 12.10.2016
 */
package oh3ebf.mysql.template.services;

import oh3ebf.mysql.template.model.User;


public interface UserServiceInterface {
    public User getUserById(Long id);
}

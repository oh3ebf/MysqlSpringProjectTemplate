/*
 * Software: Spring Mysql template
 * Module: UserController class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 9.10.2016
 */
package oh3ebf.mysql.template.controllers;

import oh3ebf.mysql.template.model.User;
import oh3ebf.mysql.template.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    
    @RequestMapping("/user")
    @ResponseBody
    public String getUser() {
        
        return(userService.getUserById(0L).getFirstName());
    }
    
    /**
     * /create --> Create a new user and save it in the database.
     *
     * @param email User's email
     * @param name User's name
     * @return A string describing if the user is succesfully created or not.
     */
    @RequestMapping("/create")
    @ResponseBody
    public String create(String email, String name) {
        User user = null;
        /*
        try {
            user = new User(email, name);
            userDao.save(user);
        } catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }*/
        return "User succesfully created! (id = " + user.getId() + ")";
    }

    /**
     * /delete --> Delete the user having the passed id.
     *
     * @param id The id of the user to delete
     * @return A string describing if the user is succesfully deleted or not.
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(long id) {
        /*
        try {
            User user = new User(id);
            userDao.delete(user);
        } catch (Exception ex) {
            return "Error deleting the user: " + ex.toString();
        }*/
        return "User succesfully deleted!";
    }

    /**
     * /get-by-email --> Return the id for the user having the passed email.
     *
     * @param email The email to search in the database.
     * @return The user id or a message error if the user is not found.
     */
    @RequestMapping("/get-by-email")
    @ResponseBody
    public String getByEmail(String email) {
        String userId="";
        /*
        try {
            User user = userDao.findByEmail(email);
            userId = String.valueOf(user.getId());
        } catch (Exception ex) {
            return "User not found";
        }*/
        return "The user id is: " + userId;
    }

    /**
     * /update --> Update the email and the name for the user in the database
     * having the passed id.
     *
     * @param id The id for the user to update.
     * @param email The new email.
     * @param name The new name.
     * @return A string describing if the user is succesfully updated or not.
     */
    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(long id, String email, String name) {
        /*
        try {
            User user = userDao.findOne(id);
            user.setEmail(email);
            user.setFirstName(name);
            userDao.save(user);
        } catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }*/
        return "User succesfully updated!";
    }
} 

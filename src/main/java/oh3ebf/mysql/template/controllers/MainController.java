/*
 * Software: Spring Mysql template
 * Module: MainController class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 10.10.2016
 */
package oh3ebf.mysql.template.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "Proudly handcrafted by <a href='http://oh3ebf.dy.fi:8081/'>OH3EBF</a> :)";
  }

}
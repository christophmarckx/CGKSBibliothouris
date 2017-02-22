package be.cegeka.bibliothouris.application;

import be.cegeka.bibliothouris.domain.users.User;
import be.cegeka.bibliothouris.domain.users.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/user")
public class UserController {

    @Inject
    private UserService userService;

    @ResponseBody
    @RequestMapping(method = GET)
    public Iterable<User> getUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(method = POST)
    @ResponseBody
    public void addUser(@RequestParam(value = "name") String name) {
        userService.addUser(name);
    }

}

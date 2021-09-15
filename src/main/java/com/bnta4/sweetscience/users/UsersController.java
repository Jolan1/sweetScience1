package com.bnta4.sweetscience.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/users")
public class UsersController {

    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(value = "all")
    List<Users> getUser() {
        return usersService.getUsers();
    }

    @PostMapping
    void createNewUsers(@RequestBody Users users) {
        System.out.println(users);
    }

    @PutMapping
    void updateUsers(@RequestBody Users users) {
        System.out.println(users);
    }

    @DeleteMapping(path = "{usersId}")
    void deleteUsers(@PathVariable("usersId") Long id) {
    }
}


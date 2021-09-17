package com.bnta4.sweetscience.users;


import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(
            UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    List<Users> getUsers() {
        return usersRepository.findAll();
    }
    Users getUsers(Long id) throws NotFoundException {
        return usersRepository
                .findById(id)
                .orElseThrow(
                        () -> new NotFoundException(
                                "User with id " + id + " not found. Please try again."));
    }

    public Users createUser(Users newUser) {
        return usersRepository.saveAndFlush(newUser);
    }
}


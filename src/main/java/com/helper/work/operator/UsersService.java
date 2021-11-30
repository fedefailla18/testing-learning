package com.helper.work.operator;

import com.helper.work.entity.Users;
import com.helper.work.repository.UsersRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class UsersService {

    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    public Users saveUser(Users users) {
        users.setId(new Random().nextInt());
        return usersRepository.save(users);
    }

}

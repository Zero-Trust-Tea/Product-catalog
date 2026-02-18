package com.example.shopping_list.repository.users;

import com.example.shopping_list.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity,Long> {
}

package com.criando_api.Projeto.api.DAO;

import com.criando_api.Projeto.api.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUser extends CrudRepository<User, Integer> {

}

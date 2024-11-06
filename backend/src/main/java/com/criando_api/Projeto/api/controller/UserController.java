package com.criando_api.Projeto.api.controller;

import com.criando_api.Projeto.api.DAO.IUser;
import com.criando_api.Projeto.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UserController  {

    @Autowired
    private IUser dao;

    @GetMapping
    public List<User> UserList() {
        return (List<User>) dao.findAll();
    }

    @PostMapping
    public User createUser (@RequestBody User usuario) {
        User newUser = dao.save(usuario);
        return newUser;
    }

    @PutMapping
    public User editarUser (@RequestBody User usuario) {
        User editUser = dao.save(usuario);
        return editUser;
    }

    @DeleteMapping("/{id}")
    public Optional<User> deleteUser (@PathVariable Integer id){
        Optional<User> delUser = dao.findById(id);
        dao.deleteById(id);
        return delUser;
    }

}

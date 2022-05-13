package br.com.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
  
  @PostMapping("/")
  public User create(@RequestBody User user){
    return user;
  }

  @GetMapping("/")
  public User read() {
  }

  @GetMapping("/{id}")
  public User readId(@PathVariable() Long id){
  }

}

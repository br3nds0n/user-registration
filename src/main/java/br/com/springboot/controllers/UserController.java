package br.com.springboot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.model.User;
import br.com.springboot.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserRepository userRepository;
  
  @PostMapping("/")
  public User create(@RequestBody User user) {
    return this.userRepository.save(user);

  }

  @GetMapping("/")
  public List<User> read() {
    return this.userRepository.findAll();
  }

  @GetMapping("/{id}")
  public Optional<User> readUser(@PathVariable("id") Long id){
    return this.userRepository.findById(id);
  }

}

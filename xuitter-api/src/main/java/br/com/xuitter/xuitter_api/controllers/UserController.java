package br.com.xuitter.xuitter_api.controllers;

import br.com.xuitter.xuitter_api.dtos.UserDTO;
import br.com.xuitter.xuitter_api.entities.User;
import br.com.xuitter.xuitter_api.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository _repository;

    public UserController(UserRepository repository) {
        _repository = repository;
    }

    @PostMapping
    public UserDTO create(@RequestBody @Valid UserDTO dto) {
        User user = new User(dto.getUsername());
        user = _repository.save(user);
        return new UserDTO(user);
    }

    @GetMapping
    public List<UserDTO> listAll() {
        return _repository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return _repository.findById(id).map(UserDTO::new).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        _repository.deleteById(id);
    }
}

package br.com.xuitter.xuitter_api.controllers;

import br.com.xuitter.xuitter_api.dtos.PiuDTO;
import br.com.xuitter.xuitter_api.entities.Piu;
import br.com.xuitter.xuitter_api.entities.User;
import br.com.xuitter.xuitter_api.repositories.PiuRepository;
import br.com.xuitter.xuitter_api.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pius")
public class PiuController {

    private final PiuRepository _piuRepository;
    private final UserRepository _userRepository;

    public PiuController(PiuRepository piuRepository, UserRepository userRepository) {
        _piuRepository = piuRepository;
        _userRepository = userRepository;
    }

    @PostMapping
    public PiuDTO create(@RequestBody @Valid PiuDTO dto) {
        User user = _userRepository.findById(dto.getUserId()).orElseThrow();
        Piu piu = new Piu(dto.getContent(), user);
        piu = _piuRepository.save(piu);
        return new PiuDTO(piu);
    }

    @GetMapping
    public List<PiuDTO> listAll() {
        return _piuRepository.findAll().stream().map(PiuDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PiuDTO findById(@PathVariable Long id) {
        return _piuRepository.findById(id).map(PiuDTO::new).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        _piuRepository.deleteById(id);
    }
}

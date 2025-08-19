package br.com.xuitter.xuitter_api.dtos;

import br.com.xuitter.xuitter_api.entities.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserDTO {

    private Long _id;

    @Pattern(regexp = "\\w+")
    @NotBlank
    @Size(max = 10)
    private String _username;

    public UserDTO() { }

    public UserDTO(User user) {
        _id = user.getId();
        _username = user.getUsername();
    }

    public Long getId() { return _id; }
    public String getUsername() { return _username; }
    public void setUsername(String username) { _username = username; }
}

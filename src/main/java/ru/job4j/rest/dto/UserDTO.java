package ru.job4j.rest.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Data
public class UserDTO {
    @NotBlank(message = "username не может быть пустым")
    @Length(min = 6,
            max = 10,
            message = "username должно быть не менее 6 и не более 10 символов")
    private String username;

    private LocalDateTime created;
}

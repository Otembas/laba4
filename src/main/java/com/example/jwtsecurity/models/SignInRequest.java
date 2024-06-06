package com.example.jwtsecurity.models;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "Запрос на вход")
public class SignInRequest {
    @Schema(description = "Имя пользователя", example = "John")
    @Size(min = 5, max = 40, message = "Имя пользователя должно быть от 5 до 40 символов")
    @NotBlank(message = "Имя пользователя не должно быть пустым")
    private String username;

    @Schema(description = "Пароль пользователя", example = "password")
    @Size(max = 255, message = "Длина пароля должна быть не более 255 сиволов")
    private String password;
}

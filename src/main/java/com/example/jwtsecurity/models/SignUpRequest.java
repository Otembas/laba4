package com.example.jwtsecurity.models;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "Запрос на регистрацию")
public class SignUpRequest {
    @Schema(description = "Имя пользователя", example = "John")
    @Size(min = 5, max = 40, message = "Имя пользователя должно быть от 5 до 40 символов")
    @NotBlank(message = "Имя пользователя не должно быть пустым")
    private String username;

    @Schema(description = "Адрес электронной почты", example = "example@dd.com")
    @Size(min = 5, max = 255, message = "Адрес электронной почты должен быть от 5 до 255 символов")
    @NotBlank(message = "Адрес электронной почты не должен быть пустым")
    @Email(message = "Email должен быть в формате user@example.com")
    private String email;

    @Schema(description = "Пароль пользователя", example = "password")
    @Size(max = 255, message = "Длина пароля должна быть не более 255 сиволов")
    private String password;
}

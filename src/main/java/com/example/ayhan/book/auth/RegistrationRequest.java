package com.example.ayhan.book.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "First name is mandatory")
    @NotNull(message = "First name is mandatory")
    private String firstName;

    @NotEmpty(message = "Last name is mandatory")
    @NotNull(message = "Last name is mandatory")
    private String lastName;

    private LocalDate dateOfBirth;
    @Column(unique = true)
    @Email(message = "Email is not formatted")
    @NotEmpty(message = "Email is mandatory")
    @NotNull(message = "Email name is mandatory")
    private String email;

    @NotEmpty(message = "Password is mandatory")
    @NotNull(message = "Password name is mandatory")
    @Size(min=8,message = "Password should be 8 character long minimum")
    private String password;
}

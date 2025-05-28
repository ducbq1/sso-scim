package com.viettel.authsync.dto.request;

import java.time.Instant;

import com.viettel.authsync.validator.DobConstraint;
import jakarta.validation.constraints.Size;

public class UserCreationRequest {
    @Size(min = 4, message = "USERNAME_INVALID")
    private
    String username;

    @Size(min = 6, message = "INVALID_PASSWORD")
    private
    String password;

    private String firstName;
    private String lastName;

    @DobConstraint(min = 10, message = "INVALID_DOB")
    private
    Instant dateOfBirth;

    public @Size(min = 4, message = "USERNAME_INVALID") String getUsername() {
        return username;
    }

    public void setUsername(@Size(min = 4, message = "USERNAME_INVALID") String username) {
        this.username = username;
    }

    public @Size(min = 6, message = "INVALID_PASSWORD") String getPassword() {
        return password;
    }

    public void setPassword(@Size(min = 6, message = "INVALID_PASSWORD") String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Instant getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Instant dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

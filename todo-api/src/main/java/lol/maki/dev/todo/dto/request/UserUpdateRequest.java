package lol.maki.dev.todo.dto.request;

import lol.maki.dev.todo.validator.DobConstraint;

import java.time.Instant;
import java.util.List;

public class UserUpdateRequest {
    private String password;
    private String firstName;
    private String lastName;

    @DobConstraint(min = 18, message = "INVALID_DOB")
    private
    Instant dob;

    private List<String> roles;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
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

    public Instant getDob() {
        return dob;
    }

    public void setDob(Instant dob) {
        this.dob = dob;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}

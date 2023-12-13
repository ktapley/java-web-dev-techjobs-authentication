package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegistrationFormDTO extends LoginFormDTO {

    @NotNull(message = "Password is required.")
    @NotBlank(message = "Password is required.")
    @Size(min = 8, max = 3, message = "Password must be 8-30 characters long")
    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}

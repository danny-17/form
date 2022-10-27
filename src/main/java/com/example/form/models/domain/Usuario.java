package com.example.form.models.domain;

import com.example.form.validation.Requerido;

import javax.validation.constraints.*;

public class Usuario {
    @Pattern(regexp = "[0-9]{3}[.][\\d]{3}[.][\\d]{3}[-][A-z]{1}")
    private String identificador;

    @NotEmpty
    private String nombre;

    @Requerido
    private String apellido;
    @Requerido
    @Size(min=3, max=8)
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty(message = "el correo no esta escrito correctamente")
    @Email
    private String email;

    @NotNull
    @Min(5)
    @Max(5000)
    private Integer cuenta;

    public Integer getCuenta() {
        return cuenta;
    }

    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }


}

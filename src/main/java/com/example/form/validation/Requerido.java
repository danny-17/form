package com.example.form.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Constraint(validatedBy = RequeridoValidador.class)
public @interface Requerido {
    String message() default "El campo es requerido";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}

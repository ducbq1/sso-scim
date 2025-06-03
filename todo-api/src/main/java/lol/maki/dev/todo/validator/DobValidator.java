package lol.maki.dev.todo.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class DobValidator implements ConstraintValidator<DobConstraint, Instant> {

    private int min;

    @Override
    public boolean isValid(Instant value, ConstraintValidatorContext context) {
        if (Objects.isNull(value)) return true;

        long years = ChronoUnit.YEARS.between(value, Instant.now());

        return years >= min;
    }

    @Override
    public void initialize(DobConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        min = constraintAnnotation.min();
    }
}

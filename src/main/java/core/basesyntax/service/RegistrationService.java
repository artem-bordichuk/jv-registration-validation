package core.basesyntax.service;

import core.basesyntax.exeption.ValidationExeption;
import core.basesyntax.model.User;

public interface RegistrationService {
    User register(User user) throws ValidationExeption;
}

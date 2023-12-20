package exceptions;

import enums.Actions;
import objects.AbstractObject;

public class UnallowedActionException extends RuntimeException {
    private static final String message = "действие %s не может быть выполнено объектом %s";

    public UnallowedActionException(Actions action, AbstractObject object) {
        super(String.format(message, action, object));
    }
}

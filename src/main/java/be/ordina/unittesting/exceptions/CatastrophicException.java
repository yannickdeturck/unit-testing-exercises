package be.ordina.unittesting.exceptions;

public class CatastrophicException extends RuntimeException {

    public CatastrophicException(String text) {
        super(text);
    }
}
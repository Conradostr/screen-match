package br.com.alura.screenmatch.exception;

public class YearConversionErrorException extends RuntimeException {
    public String mensage;

    public YearConversionErrorException(String mensage) {
        this.mensage = mensage;
    }

    public String getMensage() {
        return this.mensage;
    }
}

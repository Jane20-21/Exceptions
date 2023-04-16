package Seminars.HomeWork3;

public class ParseInputDataException extends Exception {
    String data;

    public ParseInputDataException(String inputData) {
        this.data = inputData;
    }

    @Override
    public String getMessage() {
        return this.data;
    }
}

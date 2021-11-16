package Exception;

public enum GuitarExceptionCodes {

    GUITAR_NOT_FOUND("001","Guitar not found for given id");



    String code;
    String message;

    GuitarExceptionCodes(String code, String message){
        this.code = code;
        this.message = message;
    }


}

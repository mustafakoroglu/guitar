package Exception;

public class GuitarException extends Exception{

    String code;
    String message;

    public GuitarException(GuitarExceptionCodes exceptionCode){
        this.code = exceptionCode.code;
        this.message = exceptionCode.message;
    }

    public static void throwGuitarException(GuitarExceptionCodes exceptionCodes) throws GuitarException{
        GuitarException exception = new GuitarException(exceptionCodes);
        throw exception;
    }


}

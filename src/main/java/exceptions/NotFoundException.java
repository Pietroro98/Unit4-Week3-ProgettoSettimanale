package exceptions;



public class NotFoundException extends RuntimeException {
    public NotFoundException(long id) {
        super("Il record con id " + id + " non è stato trovato");
    }
    public NotFoundException(String ISBN) {
        super("Il record con ISBN" + ISBN + "non é stato trovato");
    }
}

package Error;

abstract class HotelExeption extends RuntimeException {
    public HotelExeption(String message) {
        super(message);
    }
}

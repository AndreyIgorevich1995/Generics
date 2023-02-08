public class RunException extends RuntimeException {
    public RunException(int emptyValue) {
        super("Коробка не полна. Осталось ещё заполнить " + emptyValue + " ячеек.");
    }
}
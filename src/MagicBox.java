import java.util.Random;

public class MagicBox<T> {
    public int length;
    public T[] items;

    public MagicBox(int length) {
        this.length = length;
        this.items = (T[]) new Object[length];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        int emptyValue = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                emptyValue = emptyValue + 1;
            }
        }
        if (emptyValue != 0) {
            throw new RunException(emptyValue);
        } else
            return items[randomInt];
    }
}

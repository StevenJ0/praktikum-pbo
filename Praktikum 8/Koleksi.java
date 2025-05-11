import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm = 0;
    private ArrayList<T> wadah = new ArrayList<>();

    public T getIsi(int index) {
        return wadah.get(index);
    }

    public void setIsi(int index, T value) {
        wadah.set(index, value);
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        this.nbelm = size;
    }

    public void add(T value) {
        wadah.add(value);
        nbelm++;
    }

    public void delete(int index) {
        wadah.remove(index);
        nbelm--;
    }

    public void showAll() {
        for (int i = 0; i < wadah.size(); i++) {
            System.out.println(wadah.get(i));
        }
    }
}

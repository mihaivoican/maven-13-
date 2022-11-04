package generics;

//tot cu generice dar ceva mai specificat/particularizat
//Number e cel mai general tip de numar: e o superclasa abstracta care poate fi convertita la primitive ca: int, byte, double, float, int
public class NumberBox<I extends Number> {
    private I item;

    public NumberBox(I item) {
        this.item = item;
    }

    public I getItem() {
        return item;
    }

    public void setItem(I item) {
        this.item = item;
    }

    public boolean isPositive() {
        return item.intValue() > 0;
    }
}

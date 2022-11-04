package generics;

//stil vechi de a face o clasa mai generica in care am putea pune orice fel de obiect
//dezavantaj ca nu am metode specifice, doar f generice
public class OldBox {
    private Object item;        //item de tip nedefinit/ folosim cel mai generic, tip: Object

    public OldBox(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}

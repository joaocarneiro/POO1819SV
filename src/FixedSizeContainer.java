public class FixedSizeContainer implements Container {

    private String[] storage;
    private int numElems;

    public FixedSizeContainer() {
        storage = new String[64];
        numElems = 0;
    }

    public void add(String s) {
        storage[numElems] = s;
        numElems += 1;
    }

    public int size() {
        return numElems;
    }

    public String elementAt(int idx) {
        return storage[idx];
    }
}

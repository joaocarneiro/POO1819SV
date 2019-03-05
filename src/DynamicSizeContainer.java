public class DynamicSizeContainer implements Container {

    private String[] storage;
    private int numElems;

    public DynamicSizeContainer() {
        storage = new String[1];
        numElems = 0;
    }

    public void add(String s) {
        if (storageIsFull()) {
            duplicateStorage();
        }
        storage[numElems] = s;
        numElems += 1;
    }

    public int size() {
        return numElems;
    }

    public String elementAt(int idx) {
        return storage[idx];
    }

    private boolean storageIsFull() {
        return numElems == storage.length;
    }

    private void duplicateStorage() {
        String[] newStorage = new String[storage.length * 2];
        System.arraycopy(storage, 0, newStorage, 0, storage.length);
        storage = newStorage;
    }
}

public class AddInArray {
    public static void main(String[] args) {
        int[] data = new int[]{3, 7, 11, -1, -1, -1, -1, -1, -1, -1};
        TestInsert.testInsert();
        show(data,data.length);
        insert(data, 3, 21);
        sort(data);
        show(data,data.length);
    }

    static void sort(int[]data){
        for(int i=0;i<data.length;++i){
            insert(data, i, data[i]);
        }
    }

    public static void insert(int[] data, int numElems, int newVal) {
        int i = numElems;
        for (; i > 0 && data[i - 1] > newVal; --i) {
            data[i] = data[i - 1];
        }
        data[i] = newVal;
    }

    public static void show(int[] data, int numElems) {
        for (int i = 0; i < numElems; ++i) {
            System.out.print(" " + data[i]);
        }
        System.out.println();
    }
}

class TestInsert {
    static void testInsert() {
        if (!testInsertValueinMiddle()) {
            System.err.println("FAILED: testInsertValueinMiddle");
        }
        if (!testInsertIntoEmptyArray()) {
            System.err.println("FAILED: testInsertIntoEmptyArray");
        }
        if (!testInsertAtEnd()) {
            System.err.println("FAILED: testInsertAtEnd");
        }
    }

    private static boolean testInsertAtEnd() {
        int[] data = new int[]{3, 7, 11, -1, -1, -1, -1, -1, -1, -1};
        int[] expectedData = new int[]{3, 7, 11, 21, -1, -1, -1, -1, -1, -1};
        AddInArray.insert(data, 3, 21);
        return compare(data, expectedData);
    }

    private static boolean testInsertIntoEmptyArray() {
        int[] data = new int[3];
        int[] expectedData = new int[]{5, 0, 0};
        AddInArray.insert(data, 0, 5);
        return compare(data, expectedData);
    }

    private static boolean testInsertValueinMiddle() {
        int[] data = new int[]{3, 7, 11, -1, -1, -1, -1, -1, -1, -1};
        int[] expectedData = new int[]{3, 5, 7, 11, -1, -1, -1, -1, -1, -1};
        AddInArray.insert(data, 3, 5);
        return compare(data, expectedData);
    }

    private static boolean compare(int[] actual, int[] expected) {
        if (actual.length != expected.length)
            return false;
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] != expected[i])
                return false;
        }
        return true;
    }
}
public class ListContainer implements Container {

    private final ListNode head;
    private int numElems;

    public ListContainer() {
        head = new ListNode(null, null);
        numElems = 0;
    }

    public void add(String s) {
        final ListNode newNode = new ListNode(s, null);
        final ListNode lastNode = getLastNode();

        lastNode.setNext(newNode);
        numElems += 1;
    }

    public int size() {
        return numElems;
    }

    public String elementAt(int idx) {
        final ListNode nthNode = findNthNode(idx);
        return nthNode.getValue();
    }

    private ListNode getLastNode() {
        ListNode curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        return curr;
    }

    private ListNode findNthNode(int n) {
        ListNode node = head.getNext();
        int nodeIdx = 0;

        while (nodeIdx < n && node != null) {
            node = node.getNext();
            nodeIdx += 1;
        }
        if (node == null) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return node;
    }
}

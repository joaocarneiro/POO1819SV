public class ListNode {
    private final String value;
    private ListNode next;

    public ListNode(String value, ListNode next) {
        this.next = next;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
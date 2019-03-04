public class DataItems {
    public static void main(String[] args) {

        char containerSelector = args.length > 0 ? args[0].charAt(0) : 'd';

        Container items = createContainer(containerSelector);

        fillContainer(items);
        showContainer(items);
    }

    private static Container createContainer(char containerSelector) {
        switch (containerSelector) {
            case 'f':
                return new FixedSizeContainer();
            case 'l':
                return new ListContainer();
            case 'd':
            default:
                return new DynamicSizeContainer();
        }
    }

    private static void fillContainer(Container items) {
        items.add(new Student(36847, "Joao Carneiro").toString());
        items.add(new Student(10000, "Capitoleto Andreoleido").toString());
        items.add(new Student(34578, "Bernie Sanders").toString());
    }

    private static void showContainer(Container items){
        for (int i = items.size() - 1; i >= 0; --i) {
            System.out.println(items.elementAt(i));
        }
    }
}
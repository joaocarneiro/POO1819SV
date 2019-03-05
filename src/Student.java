public class Student{
    private final int number;
    private final String name;

    public Student(int number, String name){
        this.number=number;
        this.name=name;
    }

    public String toString(){
        return "["+number+", "+name+"]";
    }
}
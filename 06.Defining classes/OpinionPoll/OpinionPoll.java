package OpinionPoll;

public class OpinionPoll {

    String name;
    int age;

    public OpinionPoll (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        //Ivan - 48
        return name + " - " + age;
    }
}

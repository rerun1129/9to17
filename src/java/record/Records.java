package record;

public class Records {
    public static void main(String[] args) {

        Person person1 = new Person("윤석", 33);
        PersonRecords records = new PersonRecords("윤석", 33);

        System.out.println(person1.getName());
        System.out.println(records);

    }
}

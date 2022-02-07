package newnpe;

import record.Person;

/**
 * from java 14
 */

public class NPEExample {

    public static void main(String[] args) {
        PersonClass 윤석 = new PersonClass("윤석", 22);
        PersonClass personClass = null;

        System.out.println(윤석);
        System.out.println(personClass.name()); //기존의 NPE 만 딱 터뜨려주는 것이 아니고 어디에서 NPE 가 발생했는지 가리킨다.

    }

    private record PersonClass(
            String name,
            int age
    ) { }
}

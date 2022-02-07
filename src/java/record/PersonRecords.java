package record;

/**
 * from java14
 */

public record PersonRecords(
        String name,
        int age) {
        // 레코드 클래스는 필드의 지시자가 private final 이 기본이기 때문에 setter 를 가질수가 없다.
        // 레코드 클래스는 전체 생성자, equal 메서드, hashcode 메서드, getter 를 기본적으로 가진다.
}

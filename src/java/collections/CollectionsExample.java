package collections;

import java.util.*;


/**
 * from java 9
 */

public class CollectionsExample {
    public void collectionsExample() {
        Set<String> namesSet = new HashSet<>();
        namesSet.add("운석");
        namesSet.add("재덕");

        Map<String, String> countriesMap = new HashMap<>();
        countriesMap.put("폴란드", "바르샤바");
        countriesMap.put("독일", "베를린");

        List<String> namesList = new ArrayList<>();
        namesList.add("윤석");
        namesList.add("재덕");

        List<String> namesList2 = Arrays.asList("윤석", "재덕");

        List<String> list = List.of("윤석", "재덕");
        Set<String> strings = Set.of("hi", "bye");
        Map<String, String> stringMap = Map.of("폴란드", "바르샤바");
        Map<String, String> entries = Map
                .ofEntries(Map.entry("폴란드", "바르샤바"), Map.entry("러시아", "모스크바"));


    }

}

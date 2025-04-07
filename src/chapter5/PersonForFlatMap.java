package chapter5;

import java.util.List;

public class PersonForFlatMap {
    private String name;
    private List<String> hobbies;

    public PersonForFlatMap(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "PersonForFlatMap{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}

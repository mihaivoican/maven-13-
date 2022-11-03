package homework14Prof;

import lombok.Data;

@Data //rezolva multe adnotari= setter+getter+allargconstructor...
public class Person {
    private Integer id;
    private String name;
    private int age;

    //un constructor
    public Person(String name, int age) {
        if (name == null || age < 0) {
            throw new RuntimeException();
        }
        this.name = name;
        this.age = age;
    }

    //alt constructor
    public Person(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void doSomething() {

    }

}

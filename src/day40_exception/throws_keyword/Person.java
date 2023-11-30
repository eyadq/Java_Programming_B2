package day40_exception.throws_keyword;

public class Person {

    private String name;
    private int age;

    public Person(){

    }

//    public Person(String name, int age) {
//        setName(name);
//        setAge(age);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.isEmpty()){
            //System.out.println("You cannot assign empty name");
            throw new Exception("You cannot assign empty name");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Age should be greater than 0 or less than 120");
        }

        this.age = age;
    }
}

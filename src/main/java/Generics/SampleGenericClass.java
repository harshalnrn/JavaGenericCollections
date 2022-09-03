package Generics;
/*        Why Generics?
        - note: T by default extends Object class, and cannot be primitive type
        - Adds great flexibility to class/interface/abstract class ,where we keep class members generic and pass their datatype dynamically.
        Hence in a way,a single class shows various dynamic forms, with respect to DATATYPE of its instance members
        - Adds type safety to objects, where you have compilation error instead of uncertain runtime error
        - number of Generic datatypes for a class/abclass/interface could be >=1
        */

public class SampleGenericClass<T1, T2> {

    private T1 name; //member of generic type
    private T2 id; //member of generic type

    public SampleGenericClass(T1 name, T2 id) {
        this.name = name;
        this.id = id;
    }

    public T1 getName() {
        return name;
    }

    public T2 getId() {
        return id;
    }

}

class Main {

    public static void main(String[] args) {
        SampleGenericClass<String, Integer> obj = new SampleGenericClass<String, Integer>("harshal", 1); //datatype passed dynamically while creation of generic object
        System.out.println(obj.getName());
        System.out.println(obj.getId());
    }
}



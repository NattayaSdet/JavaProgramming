package day40_FinalKeyWord;

public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

public void eat(){
    System.out.println(getName()+" is eating god food");
}

//public final void drink(){  // final method cannot be overridden
//    System.out.println(getName()+" is drinking beer");
//}


}

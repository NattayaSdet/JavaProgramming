package day40_FinalKeyWord;

public class Zoo{

    public static void main(String[] args) {

        Dog dog = new day40_FinalKeyWord.Dog("Max", "Husky", 'M', "White", "large", 1);

        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();
    }
}

package utilities;


public class ProtectedAccessModifier_Test4 extends day40_FinalKeyWord.ProtectedAccessModifier {

    public static void main(String[] args) {

        // System.out.println(AccessModifiers_Test4.name1); // default is not visible outside the package
        System.out.println(ProtectedAccessModifier_Test4.name2); // protected is visible outside package in subclass ONLY

        //   AccessModifiers_Test4.method1();
        ProtectedAccessModifier_Test4.method2();

    }
}



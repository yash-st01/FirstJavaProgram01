public class AdditionMultiplicationDivision {



    public static void addition01(int x, int y){
        System.out.println(x+y);
        System.out.println("Addition of " +x+" and " +y+ " = " + (x+y));
        System.out.println(x-y);
        System.out.println("Subtraction of "+x+" and "+y+" = "+(x-y));
        System.out.println(x*y);
        System.out.println("Multiplication of "+x+" and "+y+ " = "+(x*y));
        System.out.println(x/y);
        System.out.println("Division of "+x+" and "+y+ " = "+(x/y));
    }


    public static void  main(String[] args){
//        created the object
        AdditionMultiplicationDivision calculator01 = new AdditionMultiplicationDivision();
//        calling instance method inti static area through an object
        calculator01.addition01(20,10);

    }
    }


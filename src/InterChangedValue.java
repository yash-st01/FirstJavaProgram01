public class InterChangedValue {
    public static void main(String[] args) {

        int x, y, z;
        x=5;
        y=8;


        System.out.println("first number : " + x);
        System.out.println("second number : " + y);

        z=x;
        x=y;
        y=z;

        System.out.println("After Interchanged");
        System.out.println("First Number : "+ x);
        System.out.println("Second Number : "+y);


}
}

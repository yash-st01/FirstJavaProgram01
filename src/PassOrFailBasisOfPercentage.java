public class PassOrFailBasisOfPercentage {

    //    (pass>=35)

//    >= 80 A+
//    >= 60 A
//    >= 50 B
//    >= 35 C

//    StudentName     RollNumber      Physics  Chemistry   Maths         Total   Percentage   Grade     Status
//    Aaron              3             85       80           70           235      78%          A        Pass


    public static void main(String[] args){
        String name = "Aaron Roy";
        String rollNumber= "3";

        int physics =85;
        int chemistry=80;
        int maths =70;
        int total =235;
        int percentage=78;

        System.out.println("Name:" + name);
        System.out.println("Roll Number:"+rollNumber);


        System.out.println(physics+chemistry+maths);
        System.out.println("Total Marks = " + total);
        System.out.println(total/3);
        System.out.println("Percentage(%) = " + percentage);

        if (percentage>=35){
            System.out.println("pass");
        }
        else if(percentage<=34){
            System.out.println("fail");
        }
        if (percentage>=80){
            System.out.println("A+");
        }
        else if(percentage>=60){
            System.out.println("A");
        }
        else if(percentage>50){
            System.out.println("B");
        }
        else if (percentage>=35){
            System.out.println("C");
        }
       }
}

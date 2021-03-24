public class StudentNeedToPassAllSubjects {

//    (pass>=35)


    //    StudentName     RollNumber      Physics  Chemistry   Maths         Total   Percentage   Grade     Status
     //    Aaron              3             85       80           70           235      78%          A        Pass


    public static void main(String[] args){

        int physics =85;
        int chemistry=80;
        int maths =70;


        System.out.println("Physics = " + physics);
        if (physics>=35){

            System.out.println("pass");
        }
        else {
                System.out.println("fail");
        }
        System.out.println("Chemistry = " + chemistry);

        if (chemistry>=35){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        System.out.println("Maths = " +maths);

        if(maths>=35){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }




}
}

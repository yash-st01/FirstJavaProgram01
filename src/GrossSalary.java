public class GrossSalary {

    //    Employee name  :
//    Employee ID    :
//    BASIC SALARY   : 20,000
//    HRA (10%):
//    DA  (8%):
//    TA  (9%):
//    PF  (20%):
// GrossSalary : HRA+DA+TA-PF



    public static void main(String[] args){
        String employeeName= "Aaron Roy";
        String employeeID= "A019";


        System.out.println("Employee Name : "+employeeName );
        System.out.println("Employee ID : "+ employeeID);


        int basicSalary=20000;


        System.out.println("HRA = " + 20000*10/100);
        System.out.println("DA = "+20000*8/100);
        System.out.println("TA = "+20000*9/100);
        System.out.println("PF = "+20000*20/100);

        int HRA=2000;
        int DA=1600;
        int TA=1800;
        int PF=4000;

        System.out.println(basicSalary + HRA + DA+ TA- PF);

        int grossSalary=21400;

        System.out.println("Gross Salary = "+grossSalary);




    }
}

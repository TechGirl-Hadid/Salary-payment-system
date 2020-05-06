 
 import java.util.Scanner;
class Salary_payment_system
 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number of employee : ");
        int length = s.nextInt();
        String[] employee = new String[length];
        int[] salary = new int[length];

        for (int x=0 ; x<length ; x++) {
        	System.out.print("Enter employee name : ");
            employee[x] = s.next();
            System.out.print("Enter " + employee[x] + " salary :" );
            salary[x] = s.nextInt();
   }
        int i = 0;
        for (String e: employee ) {
        System.out.print((1+i) + " - " + e + "	:	" + salary[i]+ "\n");
        i++;	
   }

    System.out.println();
    System.out.print("TO Calculate employe's salary, Enter the employee's ID : ");
	int employee_no = s.nextInt();

	System.out.print("Enter "+employee[employee_no-1]+ " absent day : ");
	int absent = s.nextInt();

	System.out.print("Enter "+employee[employee_no-1]+ " overtime hours : ");
    int overtime = s.nextInt();

    System.out.println(CalculateSalary(salary[employee_no-1], absent, overtime));
}
   static int CalculateSalary(int gross_salary, int absent_days, int overtime_hours){
       float salary_per_day =(float) gross_salary/ (float) 30;
       float salary_per_hour = salary_per_day/ (float) 8;

       int absent_amount = (int)(absent_days * salary_per_day); 
       int overtime_amount =(int)(overtime_hours * salary_per_day);

       int net_salary = gross_salary - absent_amount + overtime_amount;
       System.out.print("final result : " );
       return net_salary;
  }
}
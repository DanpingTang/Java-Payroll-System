
//LAB 6 - This is the PayrollSystemTest.java for Nurse
//Nurse hierarchy test program.

//import java.util.Scanner; // This program uses Scanner to obtain user input. NOTE!!!!

public class PayrollSystemTest {
//public static void main(String[] args) {
//   // create subclass objects
//   SalariedNurse salariedNurse = 
//      new SalariedNurse(
//      "Ndidi", "Amaka", "242-88-1234", 6, 15, 1988, 750.00);
//   HourlyNurse hourlyNurse = 
//      new HourlyNurse(
//      "Chidi", "Ndu", "252-77-5678", 12, 29, 2000, 16.75, 40);
//   CommissionNurse commissionNurse = 
//      new CommissionNurse(
//      "Peace", "Fountains", "262-66-9012", 9, 8, 1999, 30000, .06);
//   BasePlusCommissionNurse basePlusCommissionNurse = 
//      new BasePlusCommissionNurse(
//      "Mercy", "Gift", "272-55-3456", 3, 2, 1980, 7000, .04, 300);
//
//   System.out.println("\nNurse processed individually:\n");
//   
//   System.out.printf("%s\n%s: $%,.2f\n\n", 
//      salariedNurse, "earned", salariedNurse.earnings());
//   System.out.printf("%s\n%s: $%,.2f\n\n",
//      hourlyNurse, "earned", hourlyNurse.earnings());
//   System.out.printf("%s\n%s: $%,.2f\n\n",
//      commissionNurse, "earned", commissionNurse.earnings());
//   System.out.printf("%s\n%s: $%,.2f\n\n", 
//      basePlusCommissionNurse, 
//      "earned", basePlusCommissionNurse.earnings());
//
//   // COMPLETE THIS PORTION. INSERT YOUR OWN CODE: 
//   //create the Nurse array elements as required. 
//   // Hint: How many elements array do you need to create? DO SO HERE!!!
//   
//    Nurse nurses[] = {salariedNurse,hourlyNurse,commissionNurse,basePlusCommissionNurse};
//   
//   //IMPLEMENT THE USE OF A SCANNER TO GET THE CURRENT MONTH. COMPLETE THIS PORTION!!!! 
//    
//   Scanner input = new Scanner(System.in);
//   System.out.print("Enter the current month (1 - 12): ");
//   Date m = new Date();
//   m.setMonth(input.nextInt());
//   System.out.println();
//   int currentMonth = m.getMonth();
//  
//   // GET AND VALIDATE THE CURRENT MONTH. COMPLETE THIS PORTION!!!! 
//   if (currentMonth <0 || currentMonth > 12) {
//	   throw new IllegalArgumentException(
//		         "month (" + currentMonth  + ") must be 1-12");
//   }
//   System.out.println("Nurses processed polymorphically:\n");
//   
//   
//   // Now, generically process each element in array nurses
//
//   for (Nurse currentNurse : nurses) {
//      System.out.println(currentNurse); // invokes toString
//      
//      // determine whether element is a BasePlusCommissionNurse
//      if (currentNurse instanceof BasePlusCommissionNurse) {
//         // downcast Nurse reference to 
//         // BasePlusCommissionNurse reference
//         BasePlusCommissionNurse nurse = 
//            (BasePlusCommissionNurse) currentNurse;
//
//         double oldBaseSalary = nurse.getBaseSalary();
//         nurse.setBaseSalary(1.10 * oldBaseSalary);
//         System.out.printf(
//            "new base salary with 15%% increase is: $%,.2f\n",
//            nurse.getBaseSalary());   
//         }
//      // if month of nurse's birthday, add $350 to salary, otherwise, just state what this nurse currently earned.
//      // COMPLETE THIS PORTION!!!!!
//       	
//       		if (currentMonth==currentNurse.getBirthDate().getMonth()) {
//       		 System.out.printf("%s $%,.2f plus $350.00 birthday bonus \n\n",  
//          		      "earned", currentNurse.earnings());
//       		}else {
//       			System.out.printf("%s $%,.2f\n\n",  
//             		      "earned", currentNurse.earnings());
//       		}
//       	 }
//       	  
//   
//   // get type name of each object in nurses array
//   for (int j = 0; j < nurses.length; j++) {
//      System.out.printf("Nurse %d is a %s\n", j, 
//         nurses[j].getClass().getName()); 
//   }
//}
}


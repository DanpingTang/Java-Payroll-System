//Create DutyNurse class extends Nurse.
public class DutyNurse extends Nurse{
	private double wage;//wage of per piece item
	private double pieces;//number of pieces of items 
	
	public DutyNurse(String firstName, String lastName, String socialSecurityNumber, int month, int day, int year,
			double wage, double pieces) {
		super(firstName, lastName, socialSecurityNumber, month, day, year);
		
		  if (wage < 0.0) { // validate wage of per piece item
		      throw new IllegalArgumentException(
		         "Wage per piece must be >= 0.0");
		   }
		  if (pieces < 0.0) { // validate number of pieces of items
		      throw new IllegalArgumentException(
		         "Number of pieces of items must be >= 0.0");
		   }
		this.wage = wage;
		this.pieces = pieces;
	}
	
//return wage
	public double getWage() {
		return wage;
	}
//return pieces	
	public double getPieces() {
		return pieces;
	}
// calculate earnings; override abstract method earnings in Nurse
	@Override
	public double earnings() {
		
		return getWage() * getPieces();
	}
//// return String representation of DtyNurse object
	@Override
	public String toString() {
		 return String.format("duty nurse: %s%n%s: $%,.2f; %s: %,.2f",
			      super.toString(), "wage per piece", getWage(),                     
			      "number of pieces made", getPieces());
	}

	
	
	
	
	
	
	
	

}

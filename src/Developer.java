
public class Developer extends Employee {
	public Developer(String name) {
		setName(name);
	}

	public void assign(Bug b1,Tester tester1) {
		System.out.println("Bug with id " + b1.getId() + " is assigned to " + tester1 );
	}
	
	//TODO: Add reverify method
//	public void editBugStatus(Bug b1, BUGSTATUS bugStatus, SEVERITY severity) {
//		b1.setBugstatus(bugStatus);
//		b1.setSeverity(severity);
//		System.out.println(b1.getId()+ " " +"Bug Status changed to " + b1.getBugstatus() + " and Bug Severity is changed to " + b1.getSeverity());
//
//	}
	
	@Override
	public String toString() {
		return getName();
	}
}
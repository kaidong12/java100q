package patterns.behavioral.observer;

public class Main {
	public static void main(String[] args) {

		JobSeeker a = new JobSeeker("Anna");
		JobSeeker b = new JobSeeker("Bob");
		JobSeeker c = new JobSeeker("Charles");

		EmploymentAgency agency = new EmploymentAgency();
		agency.attach(a);
		agency.attach(b);
		agency.attach(c);
		
		agency.addJob(new JobPost("Actor"));
		System.out.println();
		agency.addJob(new JobPost("Doctor"));
		System.out.println();
		agency.addJob(new JobPost("Teacher"));
	}
}
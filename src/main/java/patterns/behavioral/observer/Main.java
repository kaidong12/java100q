package patterns.behavioral.observer;

//2025-01-29
//2025-02-07
// 客户端代码
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
package emps;

public class Manager extends Employee {

	Department department;

	{
		Department[] departments = Department.values();
		int index = (int) (Math.random() * departments.length);
		this.department = Department.values()[index];
	}

	enum Department {
		SALE, LEGAL, MANAGEMT, CUSTOMERS, TECHNICAL;
	}

}

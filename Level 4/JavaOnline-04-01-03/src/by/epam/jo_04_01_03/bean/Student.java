/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

package by.epam.jo_04_01_03.bean;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable{

	private static final long serialVersionUID = -2239617066895751544L;

	public enum Group {
		GROUP_1, GROUP_2, GROUP_3, GROUP_4, GROUPE_NOT_DEFINED
	}
	
	private static int MAX_QUONTITY_OF_GRADES = 5;
	
	private String lastName;
	private String initials;
	private Group group;
	private int[] grades;
	private int curentQuontityOfGrades;

	public Student() {
		this("NAME_NOT_DEFINED", "INITIALS_NOT_DEFINED", Group.GROUPE_NOT_DEFINED);
	}
	
	public Student(String lastName, String initials, Group group) {
		this.lastName = lastName;
		this.initials = initials;
		this.group = group;
		grades = new int[MAX_QUONTITY_OF_GRADES];
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public int[] getGrades() {
		return grades;
	}

	public void addGrade(int grade) {

		if (curentQuontityOfGrades >= 5) {
			System.out.println(grade + " grade cannot be added. Grades is full!");
		} else {
			grades[curentQuontityOfGrades] = grade;
			curentQuontityOfGrades++;
		}
	}
	
	public boolean isExcellent() {
		boolean isExcellent = true;
		for(int grade: grades) {
			if(grade < 9) {
				isExcellent = false;
				return isExcellent;
			}
		}
		return isExcellent;
	}
	
	public void print() {
    	System.out.println(this);
    }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + curentQuontityOfGrades;
		result = prime * result + Arrays.hashCode(grades);
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((initials == null) ? 0 : initials.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (curentQuontityOfGrades != other.curentQuontityOfGrades)
			return false;
		if (!Arrays.equals(grades, other.grades))
			return false;
		if (group != other.group)
			return false;
		if (initials == null) {
			if (other.initials != null)
				return false;
		} else if (!initials.equals(other.initials))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [lastName=" + lastName + ", initials=" + initials + ", group=" + group + ", grades="
				+ Arrays.toString(grades) + ", curentQuontityOfGrades=" + curentQuontityOfGrades + "]";
	}

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.print();
		student1.setLastName("Khamitskaya");
		student1.setGroup(Group.GROUP_1);
		student1.setInitials("A.U.");
		student1.addGrade(6);
		student1.addGrade(7);
		student1.addGrade(8);
		student1.addGrade(9);
		student1.addGrade(10);
		student1.addGrade(10);
		System.out.println(student1.isExcellent());
		student1.print();
		
		Student[] students = new Student[5];
		
		students[0] = new Student("Maoileko", "А. Ю.", Group.GROUP_1);
		students[1] = new Student("Khamitski", "И. В.", Group.GROUP_2);   //отличник
		students[2] = new Student("Nikolaenko", "В. A.", Group.GROUP_3);
		students[3] = new Student("Gerasimenko", "Г. В.", Group.GROUP_4); 
		students[4] = new Student("Jejlova", "А. Н.", Group.GROUP_1);     //отличник

		students[0].addGrade(5);
		students[0].addGrade(6);
		students[0].addGrade(7);
		students[0].addGrade(8);
		students[0].addGrade(9);
		
		students[1].addGrade(10); //отличник
		students[1].addGrade(10);
		students[1].addGrade(10);
		students[1].addGrade(10);
		students[1].addGrade(9);
		
		students[2].addGrade(5);
		students[2].addGrade(6);
		students[2].addGrade(7);
		students[2].addGrade(8);
		students[2].addGrade(9);
		
		students[3].addGrade(9);
		students[3].addGrade(9);
		students[3].addGrade(8);
		students[3].addGrade(10);
		students[3].addGrade(10);
		
		students[4].addGrade(9); //отличник
		students[4].addGrade(9);
		students[4].addGrade(9);
		students[4].addGrade(10);
		students[4].addGrade(10);
		
		Arrays.stream(students).filter(student -> student.isExcellent() == true).forEach(student -> System.out.println(student));
	
	}

}

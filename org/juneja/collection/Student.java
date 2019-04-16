package org;

public class Student implements  Comparable<Student>{
	
	int id;
	String name;
	int totalmarks;
	
	
	public Student(int id, String name, int totalmarks) {
		super();
		this.id = id;
		this.name = name;
		this.totalmarks = totalmarks;
		System.out.println("Student " + name + " has been generated.");
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", totalmarks=" + totalmarks + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + totalmarks;
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
		if (id != other.id)
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		if (totalmarks != other.totalmarks)
			return false;
		return true;
	}

	
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		//return name.compareToIgnoreCase(arg0.name);
		if (id == arg0.id)
			return 0;
		else if (id > arg0.id)
			return 1;
		else
			return -1;
		
	}

}

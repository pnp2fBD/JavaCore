package org;

public class EmployeeSet implements Comparable<EmployeeSet>{
	int id;
	String name;
	double salary;
	
	public EmployeeSet(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		EmployeeSet other = (EmployeeSet) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public int compareTo(EmployeeSet o) {
		// TODO Auto-generated method stub
		if(this.id == o.id){
			return 0;
		}
		else if(id > o.id){
			return 1;
		}
		else{
			return 0;
		}
		
	}

}
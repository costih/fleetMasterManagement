/**
 * 
 */
package fleetMasterManagement;

import java.util.Objects;

/**
 * @author Costi
 *
 */
public class Person {
	@Override
	public int hashCode() {
		return Objects.hash(cnp, name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(cnp, other.cnp) && Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
	public Person(String name, String cnp, String phone) {
		super();
		this.name = name;
		this.cnp = cnp;
		this.phone = phone;
	}
	
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [getName()=" + getName() + ", getCnp()=" + getCnp() + ", getPhone()=" + getPhone() + "]";
	}
	private String name;
	private String cnp;
	private String phone;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cnp
	 */
	public String getCnp() {
		return cnp;
	}
	/**
	 * @param cnp the cnp to set
	 */
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		(if phone.lenght()==10)this.phone = phone;
	}
	
	
}

package phenom.org.xml.setter;

public class Artist 
{
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Artist [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	private String firstname;
	private String lastname;
	
}

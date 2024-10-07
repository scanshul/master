package ImmutableConcept;

public class Education {
	private String qualification;
	private String yearOfPassing;
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	@Override
	public String toString() {
		return "Education [qualification=" + qualification + ", yearOfPassing=" + yearOfPassing + "]";
	}
	public Education(String qualification, String yearOfPassing) {
		super();
		this.qualification = qualification;
		this.yearOfPassing = yearOfPassing;
	}
	
	// // Copy constructor for defensive copying
	public Education(Education other) {
		this.qualification = other.qualification;
		this.yearOfPassing = other.yearOfPassing;
	}
	
	
	
	

}

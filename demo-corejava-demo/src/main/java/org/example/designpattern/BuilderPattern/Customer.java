package designepattern.BuilderPattern;

public class Customer {
	private String firstName; // mandatory
    private String lastName; // mandatory
    private String midName ;     //optional
    private String age; // optional
    private String gender; // optional
    private String occupation; // optional
    private boolean isMarried; // optional
    private String city; // optional
    private String state; // optional
    private String annualEarning; // optional
    private String custType; //mandatory
    private String dob;//optional
    private String Doa;//mandatory
    private double purAmount;//mandatory
    
    @Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", midName=" + midName + ", age=" + age
				+ ", gender=" + gender + ", occupation=" + occupation + ", isMarried=" + isMarried + ", city=" + city
				+ ", state=" + state + ", annualEarning=" + annualEarning + ", custType=" + custType + ", dob=" + dob
				+ ", Doa=" + Doa + ", purAmount=" + purAmount + "]";
	}
    
    private Customer(CustomerBuilder builder)
    {
    	this.firstName=builder.firstName;
    	this.lastName=builder.lastName;
    	this.midName=builder.midName;
    	this.age=builder.age;
    	this.gender=builder.gender;
    	this.occupation=builder.occupation;
    	this.isMarried=builder.isMarried;
    	this.city=builder.city;
    	this.state=builder.state;
    	this.annualEarning=builder.annualEarning;
    	this.custType=builder.custType;
    	this.dob=builder.dob;
    	this.Doa=builder.Doa;
    	this.purAmount=builder.purAmount;
    }
    
    public static class CustomerBuilder
    {
    	private String firstName; // mandatory
        private String lastName; // mandatory
        private String midName ;     //optional
        private String age; // optional
        private String gender; // optional
        private String occupation; // optional
        private boolean isMarried; // optional
        private String city; // optional
        private String state; // optional
        private String annualEarning; // optional
        private String custType; //mandatory
        private String dob;//optional
        private String Doa;//mandatory
        private double purAmount;//mandatory
        
        
        public  CustomerBuilder(String firstName,String lastName,String custType,String Doa,double purAmount ) 
        {
        	this.firstName=firstName;
        	this.lastName=lastName;
        	this.custType=custType;
        	this.Doa=Doa;
        	this.custType=custType;
        	this.purAmount=purAmount;
        }
        
        public CustomerBuilder addMidName(String midName)
        {
        	this.midName=midName;
        	return this;
        }
        public CustomerBuilder addGender(String gender)
        {
        	this.gender=gender;
        	return this;
        }
        public CustomerBuilder addAge(String age)
        {
        	this.age=age;
        	return this;
        }
        
        public CustomerBuilder addOccupation(String occupation)
        {
        	this.occupation=occupation;
        	return this;
        }
        
        public Customer build()
        {
        	return new Customer(this);
        }
    }
}

package day31_CustomClassConstructors;

public class Address {

    public String street, city, state;
    public int buildingNumber, zipCode;

    public Address(String street, String city, String state, int buildingNumber, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
/*
2. Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

 */

public class Cars  extends Vehicle{

	private float x;


	public Cars()
	{

	}

	public Cars(String registrationNumber, Person owner, int numberofWheels) {

		super(registrationNumber,owner,numberofWheels);
		this.x=(float) 2.4;
	}




public String toString() {
	String str="";
	str=super.toString()+" "+insurance();
	return str;
}

@Override
String insurance() {
	double insurance_amount=1000*super.getNumberofWheels()*this.x;
	return "Car Insurance Amount:"+insurance_amount;		
}


}

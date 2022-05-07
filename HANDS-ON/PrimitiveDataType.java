package Hello_world1;

public class PrimitiveDataType 
{

	public static void main(String[] args)
	{
		//byte
		byte myByte1,myByte2;

		myByte1 = 127;

		myByte2 = -48;

		System.out.println("Byte 1: " +myByte1);

		System.out.println("Byte 2: " +myByte2);

		myByte1++; // Looping back within the range

		System.out.println("Incremented Value of myByte1: " +myByte1);

	//int
		int myNum1, myNum2, result;

		myNum1 = 85;

		myNum2 = 90;

		System.out.println("Number 1: " +myNum1);
		System.out.println("Number 2: " +myNum2);
		result = myNum1 + myNum2;
		
		System.out.println("Add Number 1 + Number 2: " +result);
		
    //short
	short myShort = 6000;

	System.out.println("myShort: " + myShort);
	//long
	long myLong1, myLong2, result1;

	myLong1 = 200000000L;

	myLong2 = 200L;

	result1 = myLong1+myLong2;

	System.out.println("Number 1: " +myLong1);

	System.out.println("Number 2: " +myLong2);

	System.out.println("Number 1 + Number 2: " +result);
	//char
	char marks,students ;
    
	marks='9';
	students='4';
	System.out.println("Marks:"+marks);
	System.out.println("Students:"+students);
	
	//float
	float myFloat1,myFloat2,result2;

	myFloat1=100.15f;

	myFloat2=1180.00f;

	result2=myFloat1+myFloat2;

	System.out.println("Number1: "+myFloat1);

	System.out.println("Number2: "+myFloat2);

	System.out.println("Number1+Number2: "+result);

	//double
	double myDouble1, myDouble2, result3;

	myDouble1 = 45.8987d;

	myDouble2 = 3.78d;

	result3 = myDouble1 * myDouble2;

	System.out.println("Number 1: " +myDouble1);

	System.out.println("Number 2: " +myDouble2);

	System.out.println("Number 1 * Number 2: " +result);

	//boolean
	boolean myBool = false;

	if(myBool == false)

	System.out.println("I am using a Boolean data type:"+myBool);

}
}

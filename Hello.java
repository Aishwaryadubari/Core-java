package World;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello world");
		
		int variable1 = 10;
		int variable2 = 20;
		int total = variable1+variable2;
		System.out.println("Total value: "+total);
		
		int temp = variable1;
		variable1 = variable2;
		variable2 = temp;
		
		System.out.println(variable1+" "+variable2);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
				
		
		byte a = 10;
		short b = 20;
		int c = 50;
		long d = 50000L + 10L * (a+b+c);
		System.out.println(d);
		short var= (short)(1000+10*(a+b+c));
		System.out.println(var);
		
		float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " +myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;
	    
        //converting pound to kilogram
		double te = 200d;
		double be = te *  0.45359237d;
		System.out.println("converted kilogram "+be);
				

	}

}

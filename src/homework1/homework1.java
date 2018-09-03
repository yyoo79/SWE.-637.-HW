package homework1;

import java.util.Vector; 

public class homework1 {

	public static void main(String[] args) {
				
		Vector<String> a1 = new Vector<String>();
		a1.add("a"); a1.add("b"); a1.add("c");
		Vector<String> b1 = new Vector<String>();
		b1.add("d"); b1.add("e"); b1.add("f"); b1.add("c");
		
		//a1 = null;
		b1 = null;
		Vector<String> c = union(a1,b1);
		System.out.println(c);

	}
	
	/*
	(a) Write a Java method with the signature. public static Vector union (Vector a, Vector b)
	The method should return a Vector of objects that are in either of the two argument Vectors.
	*/	
	public static Vector<String> union(Vector<String> a, Vector<String> b) {
		Vector<String> result = new Vector<String>();
		
		// handling null params
		if (a == null) {
			if (b == null) { return result; }
			else { return b; }
		}
		
		result = a;
		for (int i=0;i<b.size();i++) {
			if (!result.contains(b.elementAt(i))){
				result.add(b.elementAt(i));
			}
		}		
		return result;
	}
	
	/*
	(b) Upon reflection, you may discover a variety of defects and ambiguities in the given assignment.
	In other words, ample opportunities for faults exist. Identify as many possible faults as you can.
	(Note: Vector is a Java Collection class. If you are using another language, interpret Vector as a list.)
	*/
	
	// case1 - Ambiguity - Vector is genetic type. 
	// case2 - Ambiguity/specification - when Vector a or Vector b is null
	// case3 - Ambiguity/specification - orders after union: union(a,b) does not equal to union(b,a).
	//		 But by definition, union of 2 collection should be same. ???
	
	
	
	
	

}

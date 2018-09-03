package homework1;

import java.util.Collections;
import java.util.Vector; 

public class homework1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		/*
		Vector<String> a1 = new Vector<String>();
		a1.add("a"); a1.add("b"); a1.add("c");
		Vector<String> b1 = new Vector<String>();
		b1.add("d"); b1.add("e"); b1.add("f"); b1.add("c");
		*/
		
		Vector<String> a2 = new Vector<String>();
		a2.addElement("a"); a2.addElement("b"); a2.addElement("c");
		Vector<String> b2 = new Vector<String>();
		b2.addElement("d"); b2.addElement("e"); b2.addElement("f"); b2.addElement("c");
		
		Vector a3 = new Vector();
		a3.addElement(1); a3.addElement(2);
		Vector b3 = new Vector();
		b3.addElement("aa"); b3.addElement("bb"); b3.addElement(2);
		
		/*
		// case 1 - causes NPE exception
		Vector<String> a1 = null;
		Vector<String> b1 = new Vector<String>();
		b1.add("d"); b1.add("e"); b1.add("f"); b1.add("c");
		*/
		
		// case 2 - after union, 2 sets are not equal
		Vector<String> a1 = new Vector<String>();
		a1.add("a"); a1.add("b"); a1.add("c");
		Vector<String> b1 = new Vector<String>();
		b1.add("d"); b1.add("e"); b1.add("f"); b1.add("c");
		
		//a1 = null;
		//b1 = null;
		//Vector<String> c = union_fix(a1,b1);
		//Vector<String> c2 = union_fix(b1,a1);		
		//System.out.println(c.equals(c2));
		
		//System.out.println(c);
		//System.out.println(c2);
		
		//a1 = null;
		b1 = null;
		Vector<String> c = union_fix(a1,b1);
		//Vector<String> c2 = union_fix(b1,a1);		
		System.out.println(c);

	}
	
	/*
	(a) Write a Java method with the signature. public static Vector union (Vector a, Vector b)
	The method should return a Vector of objects that are in either of the two argument Vectors.
	*/	
		
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Vector union(Vector a, Vector b) {
		Vector result = new Vector();
		result = a;
		for (int i=0;i<b.size();i++) {
			if (!result.contains(b.elementAt(i))){
				result.add(b.elementAt(i));
			}
		}		
		return result;
	}
	
	// fixed
	// 1. error handled
	// 2. sorting implemented
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Vector union_fix(Vector a, Vector b) {
		Vector result = new Vector();
		result = a;
		
		// handling null parameters
		if (a == null) {
			if (b == null) { return result; }
			else { return b; }
		} else if (b == null) { return a; }
				
		for (int i=0;i<b.size();i++) {
			if (!result.contains(b.elementAt(i))){
				result.add(b.elementAt(i));
			}
		}		
		Collections.sort(result);
		return result;
	}
	
	
	/*
	public static Vector<String> union2(Vector<String> a, Vector<String> b) {
		Vector<String> result = new Vector<String>();
		result = a;
		for (int i=0;i<b.size();i++) {
			if (!result.contains(b.elementAt(i))){
				result.add(b.elementAt(i));
			}
		}		
		return result;
	}
	*/
	
	/*
	// handling null parameters
	if (a == null) {
		if (b == null) { return result; }
		else { return b; }
	}
	*/
	
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

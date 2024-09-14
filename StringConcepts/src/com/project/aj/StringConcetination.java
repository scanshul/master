package com.project.aj;

public class StringConcetination {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "ABC"; // Stored in SCP
		String s0 = "XYZ";
		System.out.println(s1.concat(s2));
		/*
		 * Total 2 object created So, a total of two String objects are created: "ABC"
		 * (shared by s1 and s2) "ABCABC" (result of s1.concat(s2) and passed to
		 * println)
		 */

		s1.concat(s2);
		System.out.println(s1);
		/*
		 * One String object for the literal "ABC" (shared by s1 and s2). One String
		 * object for the concatenated result "ABCABC" (created by s1.concat(s2), but
		 * not assigned to any variable and thus eligible for garbage collection).
		 */
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(s1.concat(s0));
		/*
		 * So, a total of three String objects are created: "ABC" (for s1) "XYZ" (for
		 * s2) "ABCXYZ" (result of s1.concat(s2) and passed to println)
		 */

		s1.concat(s0);
		System.out.println(s1.concat(s0));

		/*
		 * Therefore, the objects created are: One String object for the literal "ABC".
		 * One String object for the literal "XYZ". One String object for the
		 * concatenated result "ABCXYZ" (created by s1.concat(s2), but not assigned to
		 * any variable and thus eligible for garbage collection).
		 */

		String s3 = new String("ABC"); // Stored in Heap Memory
		s1.concat(s3);
		System.out.println(s1);

		/*
		 * One String object for the literal "ABC" (interned and shared by s1). One
		 * String object for the explicit new String("ABC") (stored on the heap and
		 * referenced by s3). One String object for the concatenated result "ABCABC"
		 * (created by s1.concat(s3), but not assigned to any variable and thus eligible
		 * for garbage collection).
		 */

		System.out.println(s1.concat(s3));

		/*
		 * One String object for the literal "ABC" (interned and shared by s1). One
		 * String object for the explicit new String("ABC") (stored on the heap and
		 * referenced by s3). One String object for the concatenated result "ABCABC"
		 * (created by s1.concat(s3) and passed to System.out.println).
		 */

		String s4 = new String("JKL");
		s3.concat(s4);
		System.out.println(s3);
		System.out.println(s3.concat(s4));

		s1 = s1 + s2;
		/*
		 * The expression s1 + s2 involves string concatenation. In Java, the + operator
		 * for strings creates a new String object. The s1 + s2 concatenation creates a
		 * new String object with the value "ABCABC". The reference s1 is then updated
		 * to point to this new string.
		 */
		System.out.println(s1);

		/*
		 * "ABC" (interned, shared by s1 and s2). "ABCABC" (result of s1 + s2 and
		 * assigned to s1).
		 */
		System.out.println(s1 + s2);

		/*
		 * "ABC" (interned, shared by s1 and s2). "ABCABC" (result of s1 + s2 and passed
		 * to System.out.println).
		 */

		String st1 = "ABC";
		st1 = st1 + "ABC";
		System.out.println(st1);

		System.out.println(s3 + s4);

		/*
		 * Two String objects created explicitly with new String("..."): "JKL" (for s4)
		 * and "ABC" (for s3). One String object for the concatenated result "ABCJKL"
		 * created by s3 + s4.
		 */

		// Cannot Concatenate String , because String is immutable we can't changes its
		// content
		/*
		 * In Java, strings are immutable, meaning that once a String object is created,
		 * it cannot be changed. Methods l ike concat return a new string rather than
		 * modifying the original string.
		 */
		System.out.println("-----------------");
		String a1 = "Java";
		String a2 = "Programming Language";
		a1 = a1.concat(a2); // Then we can say string is immutable
		System.out.println(a1);

		/*
		 * Immutability in Java Strings: Immutability means that once a String object is
		 * created, its value cannot be changed. This applies to the underlying
		 * characters of the String object. When you perform operations on a String
		 * (like concatenation), a new string is created rather than modifying the
		 * original one. Initially, s1 points to the string "ABC". When s1.concat(s2) is
		 * called, a new string "ABCABC" is created, and s1 is assigned to this new
		 * string. The original "ABC" string remains unchanged in memory. You are only
		 * reassigning the variable s1 to reference a new object "ABCABC". In short,
		 * immutability means that the contents of the original String object (i.e.,
		 * "ABC") are not altered. Instead, new strings are created when changes are
		 * made. This is why we say strings in Java are immutable.
		 */

	}

}

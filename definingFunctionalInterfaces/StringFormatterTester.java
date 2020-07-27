package definingFunctionalInterfaces;

public class StringFormatterTester {
	
	 public static void main(String[] args) {

		  // TODO Auto-generated method stub

		  String s1="Lambda";

		  String s2="Expression";

		  

		  StringFormatter x=(a1,a2)->a1+" "+a2;

		  StringFormatter y=(a1,a2)->a1+"-"+a2;

		  StringFormatter z=(a1,a2)->a1.toUpperCase()+" "+a2.toUpperCase();

		  

		  System.out.println(x.format(s1, s2));

		  System.out.println(y.format(s1, s2));

		  System.out.println(z.format(s1, s2));

}
}

package kkk;

public class h {
	    public static void main(String[] args) {
	        Object obj = new Object();
	        Object obj1=new Object();
//	        int hashCode = System.identityHashCode(obj);
	    	String s="KP";
	    	String s1=new String("KP");
	        //System.out.println("Hash Code: " + hashCode);
	        System.out.println(System.identityHashCode(s) == System.identityHashCode(s1));
	        System.out.println(s.equals(s1));
	        System.out.println(obj.equals(obj1));
	        System.out.println(System.identityHashCode(obj) == System.identityHashCode(obj1));



	    
	}
}

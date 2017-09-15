package challenge2;

public class String_Reversal {
	
	public void string_rev1(String revstr1) {
		for ( int i= revstr1.length()-1 ; i >= 0 ; i--){
			System.out.println(revstr1.charAt(i));
		}
	}
	
	public void string_rev2(String revstr2) {
		char strarr[] = revstr2.toCharArray();
		for (int i = strarr.length -1 ; i >= 0 ; i--) {
			System.out.println(strarr[i]);
		}
	}
	public static void main(String[] args) {
		String_Reversal revclass = new String_Reversal();
		revclass.string_rev1("Sai Pavan");
		revclass.string_rev2("Hello HCL..\n");
		
	}

}

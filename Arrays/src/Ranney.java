
public class Ranney {
	public static void main(String[] args) {
		String name="Ranneya";
		if(name.length()%2==0) {
			for(int i=0;i<name.length();i+=2) {
				System.out.println(name.substring(i, i+2));
			}
		}
		else {
			for(int i=0;i<name.length()-1;i+=2) {
				System.out.println(name.substring(i,i+2));
			}
			System.out.println(name.substring(name.length()-1)+"_");
		}
	}
}

package ifelse;

public class comparingstringobjects {
	public static void main(String args[]) {
		String name1 = "Alan Turning";
		String name2 = "Ada Lovelace";
		
		if(name1.equals(name2)) {
			System.out.println("The names are the same");
		}
		else {
			System.out.println("the names are not the same");
		}
		int flag=name1.compareTo(name2);
		if(flag==0) {
			System.out.println("the names are the same");
		}
		else if (flag > 0) {
			System.out.println("name1 comes before name2");
		}
		else {
			System.out.println("name2 comes before name1");
		}
	}

}

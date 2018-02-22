
public class ArrayIntListExample {

	public static void main(String[] args) {
		
		
		ArrayIntList list1 = new ArrayIntList(40);
		ArrayIntList list2 = new ArrayIntList(10);
		
		
		list1.add(1);
		list1.add(82);
		list1.add(97);
	
		
		list2.add(7);
		list2.add(-8);
		
		
		/*System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		System.out.println(list1.size());
		System.out.println(list2.get(0));
		
		System.out.println(list1.indexOf(100));
		*/
		System.out.println(list1.get(1));
	}

}

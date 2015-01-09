public class Test {
	public static void main(String[] args) {
		ArrayListInt test = new ArrayListInt();
		test.add(1);
		test.add(2);
		test.add(3);
		test.remove(0);
		System.out.println(test.toString());
		LinkedListInt test1 = new LinkedListInt();
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.remove(0);
		System.out.println(test1.toString());
		LinkedList<Integer> test2 = new LinkedList<Integer>();
		test2.add(1);
		test2.add(2);
		int c=2;
		test2.add(c);
		test2.add(3);
		System.out.println(test2.toString());
		ArrayList<Integer> test3 = new ArrayList<Integer>();
		test3.add(1);
		test3.add(2);
		test3.add(3);
		test3.remove(0);
		System.out.println(test3.toString());
	}
}

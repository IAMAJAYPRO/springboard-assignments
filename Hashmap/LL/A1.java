import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

class Tester {

	public static List<Integer> removeDuplicates(List<Integer> list) {
        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>(list);
        List<Integer> li=new LinkedList<Integer>(set);

        return li;
	}

	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(21);
		list.add(15);
		list.add(10);

		List<Integer> updatedList = removeDuplicates(list);

		System.out.println("Linked list without duplicates");
		for (Integer value : updatedList) {
			System.out.print(value+" ");
		}
	}

}

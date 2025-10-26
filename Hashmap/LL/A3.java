import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Tester {

    public static List<Integer> mergeLists(List<Integer> listOne, List<Integer> listTwo) {
        List<Integer> LL = new LinkedList<Integer>();
        // linked lists not working in sites soln verifier so list.get
        while (!listOne.isEmpty()) {
            if (listTwo.isEmpty()){
                break;
            }
            if (listOne.get(0)<listTwo.get(0)){
                LL.add(listOne.remove(0));
            }else{
                LL.add(listTwo.remove(0));
            }
        }
        LL.addAll(listOne);
        LL.addAll(listTwo);

        return LL;
    }

    public static void main(String args[]) {
        List<Integer> listOne = new LinkedList<Integer>();
        listOne.add(10);
        listOne.add(13);
        listOne.add(21);
        listOne.add(42);
        listOne.add(56);

        List<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(15);
        listTwo.add(20);
        listTwo.add(21);
        listTwo.add(85);
        listTwo.add(92);

        List<Integer> mergedList = mergeLists(listOne, listTwo);
        System.out.println(mergedList);
    }
}

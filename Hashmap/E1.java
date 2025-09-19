import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collections;

class Tester {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);

		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);

		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}

	}
}

class Student {

    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
		//Implement your logic here and change the return statement accordingly
		Map<String, Double> maxMinStuds=new HashMap<String, Double>();
		double min=0,max=0;
	    min=Collections.min(studentMarks.values());
	    max=Collections.max(studentMarks.values());
		for (Map.Entry<String, Double> stud:studentMarks.entrySet()){
		    if (stud.getValue()==min){
		        maxMinStuds.put(stud.getKey(),min);
		    }else if (stud.getValue()==max){
		        maxMinStuds.put(stud.getKey(),max);
		    }
		}
		return maxMinStuds;
	}
}

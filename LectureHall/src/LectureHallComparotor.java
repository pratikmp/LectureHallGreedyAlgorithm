import java.util.Comparator;


public class LectureHallComparotor implements Comparator<Activity> {

	
	@Override
	public int compare(Activity o1, Activity o2) {
		// TODO Auto-generated method stub
		return o1.getEndTime().compareTo(o2.getEndTime());
	}

}

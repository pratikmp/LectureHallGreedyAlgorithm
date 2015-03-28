import java.util.ArrayList;
import java.util.List;

public class Hall implements Comparable<Hall> {

	private Integer gettingFreeAt;
	private List<Activity> listOfLectures = new ArrayList<Activity>();

	public Integer getGettingFreeAt() {
		return gettingFreeAt;
	}

	public void setGettingFreeAt(Integer gettingFreeAt) {
		this.gettingFreeAt = gettingFreeAt;
	}

	public List<Activity> getListOfLectures() {
		return listOfLectures;
	}

	public void setListOfLectures(Activity activity) {
		this.listOfLectures.add(activity);
	}

	@Override
	public int compareTo(Hall o) {
		// TODO Auto-generated method stub
		return this.getGettingFreeAt().compareTo(o.getGettingFreeAt());
	}

}

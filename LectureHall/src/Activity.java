
public class Activity implements Comparable<Activity> {

	@Override
	public String toString() {
		return "Activity [className=" + className + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]\n";
	}

	private String className;
	private Integer startTime;
	private Integer endTime;

	public Activity(String className, Integer startTime, Integer endTime) {
		super();
		this.className = className;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getStartTime() {
		return startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	@Override
	public int compareTo(Activity o) {
		// TODO Auto-generated method stub
		int result = this.getEndTime().compareTo(o.getEndTime());
		if(result== 0 ){
			result = this.getStartTime().compareTo(o.getStartTime());
			
		}
		return result;
	}

}

import java.util.ArrayList;
import java.util.*;
import java.util.PriorityQueue;
import java.util.Random;

public class ScheduleLecture {

	private static ArrayList<Activity> generateRandomInput(int size) {
		Random randomGen = new Random();
		int startTime, endTime, classNo = 0;
		ArrayList<Activity> mAct = new ArrayList<Activity>(size);
		for (int i = 0; i < size; i++) {
			startTime = randomGen.nextInt(size);
			endTime = startTime + randomGen.nextInt(size);
			mAct.add(new Activity("Class#" + classNo++, startTime, endTime));
		}
		return mAct;
	}

	public static void ScheduleLectureProblem(int size) {

		ArrayList<Activity> mAct = generateRandomInput(size);
		Collections.sort(mAct);
		System.out.println("Sorted Input = \n" + mAct);

		ArrayList<Hall> listOfHallCreated = new ArrayList<Hall>();
		PriorityQueue<Hall> UsedHall = new PriorityQueue<Hall>();

		Iterator<Activity> itr = mAct.iterator();
		while (itr.hasNext()) {

			Activity lecture = itr.next();
			Hall hall = null;
			if (listOfHallCreated.isEmpty()) {

				hall = new Hall();
				listOfHallCreated.add(hall);

			} else if (UsedHall.peek().getGettingFreeAt() < lecture
					.getStartTime()) {

				hall = UsedHall.poll();

			} else {

				hall = new Hall();
				listOfHallCreated.add(hall);

			}

			hall.setGettingFreeAt(lecture.getEndTime());
			hall.setListOfLectures(lecture);
			UsedHall.add(hall);

		}

		int no = 0;
		for (Hall h : listOfHallCreated) {

			System.out.print("\nClass Room #" + no++ + " :: ");
			for (Activity lecture : h.getListOfLectures()) {
				{
					System.out.print(lecture.getClassName() + " , ");

				}

			}

		}

	}
}

package ikinciGunOdevi;

public class CourseManager {

	public void addCourse(Course course) {
		System.out.println("Kurs Eklendi : " + course.name);
	}

	public void courseCompleted(Course course) {
		System.out.println("Kurs Tamamlandı");
	}
}

package ikinciGunOdevi;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Programlamaya Giriş için Temel Kurs", "Engin Demiroğ", 80);
		Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kampı(C# + Angular", "Engin Demiroğ", 68);
		Course course3 = new Course(3, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "Engin Demiroğ", 38);

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.name + course.courseTeacher);
		}

		Category category1 = new Category(1, "Tümü");
		Category category2 = new Category(2, "Programlama");

		Category[] categories = { category1,category2 };

		CourseManager coursemanager = new CourseManager();
		coursemanager.addCourse(course3);
		coursemanager.courseCompleted(course1);

	}

}

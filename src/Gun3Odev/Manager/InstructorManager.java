package Gun3Odev.Manager;

import Gun3Odev.Model.Instructor;

public class InstructorManager extends UserManager {

    public void displayInfo(Instructor instructor) {
        System.out.println("Egitmenin Bilgileri:");
        System.out.println("id: " + instructor.getId());
        System.out.println("Isim: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("email: " + instructor.getEmail());
        System.out.println("Egitmenin Verdigi Kurslar: " + instructor.getCourses());
        System.out.println("Is deneyimi: " + instructor.getWorkExperience() + " yil");
    }

    public void displayCourses(Instructor instructor) {
        System.out.println("Egitmenin Verdigi Kurslar Gosterildi:");

    }
}

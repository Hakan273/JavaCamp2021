package Gun2Odev;

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
                "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",
                "Engin Demiroğ",
                "ÜCRETSİZ");

        Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
                "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",
                "Engin Demiroğ",
                "ÜCRETSİZ");

        Course course3 = new Course("Programlamaya Giriş İçin Temel Kurs)",
                "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.",
                "Engin Demiroğ",
                "ÜCRETSİZ");

        Course[] courses = {course1, course2, course3};

        for (Course course : courses) {
            System.out.println("Kurs Adı: " + course.name);
            System.out.println("Kurs Bilgisi: " + course.info);
            System.out.println("Eğitmen: " + course.instructor);
            System.out.println(course.detail);
            System.out.println("------------------------------------------------------------");
        }

        CourseManager courseManager = new CourseManager();
        courseManager.register(course1);
        courseManager.register(course2);
        courseManager.register(course3);

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Tümü";
        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Programlama(" + courses.length + ")";

        System.out.println("Kategori:");
        System.out.println(category1.name);
        System.out.println(category2.name);

    }

}

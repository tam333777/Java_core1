package HomeWork_JavaCore_1;

public class DZ_1_main {
    public static void main(String[] args) {

        //массив препятствий
        Course course1 = new Course("длина 30 км");
        Course[] course2 = {new Course(30), new Course(40), new Course(20)};

        Team team1 = new Team("Дрим тим", "Света", "Катя", "Федя", "Петя") {
        };

        team1.showInfo();

        team1.showResult();

        course1.doIt(team1);

        for (int i = 0; i < course2.length; i++) {
            team1.run(course2[i].getLength());
        }
    }
}

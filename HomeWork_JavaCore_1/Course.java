package HomeWork_JavaCore_1;

public class Course {
    private int length;
    private String run;

    public Course(int length) { // создаем конструктор
        this.length = length;
    }

    public Course(String run) {
        this.run = run;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    void doIt(Team team) {
        System.out.println("Команда " + team.getTitle() + " пробегите дистанцию");
    }
}


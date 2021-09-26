package HomeWork_JavaCore_1;

import java.util.Arrays;

public abstract   class Team implements CanRun {


    private String title;
    private String[] myTeamArr = new String[4];
    private String teamMember_1;
    private String teamMember_2;
    private String teamMember_3;
    private String teamMember_4;


    public Team(String title,String teamMember_1, String teamMember_2, String teamMember_3, String teamMember_4) {
        this.title = title;
        this.teamMember_1 = teamMember_1;
        this.teamMember_2 = teamMember_2;
        this.teamMember_3 = teamMember_3;
        this.teamMember_4 = teamMember_4;
        this.myTeamArr[0] = teamMember_1;
        this.myTeamArr[1] = teamMember_2;
        this.myTeamArr[2] = teamMember_3;
        this.myTeamArr[3] = teamMember_4;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getMyTeamArr() {
        return myTeamArr;
    }

    public void setMyTeamArr(String[] myTeamArr) {
        this.myTeamArr = myTeamArr;
    }

    public void run(int length) {
        System.out.println(title + " команда пробежала " + length + " км");

    }

    void showResult (){
        System.out.println(title + " команда финишировала!");
    }

    void showInfo(){
        System.out.println("Команда " + teamMember_1 + ", " + teamMember_2 + ", " + teamMember_3 + ", " +teamMember_4 );
    }


    @Override
    public String toString() {
        return "Team{" +
                "title='" + title + '\'' +
                ", myTeamArr=" + Arrays.toString(myTeamArr) +
                '}';
    }
}

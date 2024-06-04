package Examination.FOLDER.Institution;

public class DS implements Comparable<DS> {
    private String team, truong;

    public DS(String team, String truong) {
        this.team = team;
        this.truong = truong;
    }

    @Override
    public int compareTo(DS o) {
        if(this.truong.compareTo(o.truong) < 0) return -1;
        else if (this.truong.equals(o.truong)) return this.team.compareTo(o.team);
        return 1;
    }

    @Override
    public String toString() {
        return this.team + " " + this.truong;
    }
}

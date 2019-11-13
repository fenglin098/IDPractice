public class Link {
    private int linkID;
    private int peopleID;
    private int coID;
    private String yearStartedWork;
    private String jobTitle;

    public Link() {
    }

    public Link(int linkID, int peopleID, int coID, String yearStartedWork, String jobTitle) {
        this.linkID = linkID;
        this.peopleID = peopleID;
        this.coID = coID;
        this.yearStartedWork = yearStartedWork;
        this.jobTitle = jobTitle;
    }

    public int getLinkID() {
        return linkID;
    }

    public void setLinkID(int linkID) {
        this.linkID = linkID;
    }

    public int getPeopleID() {
        return peopleID;
    }

    public void setPeopleID(int peopleID) {
        this.peopleID = peopleID;
    }

    public int getCoID() {
        return coID;
    }

    public void setCoID(int coID) {
        this.coID = coID;
    }

    public String getYearStartedWork() {
        return yearStartedWork;
    }

    public void setYearStartedWork(String yearStartedWork) {
        this.yearStartedWork = yearStartedWork;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}

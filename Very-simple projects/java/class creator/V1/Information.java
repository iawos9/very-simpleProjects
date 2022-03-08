public class Information {
    private String teacherName,labName = "NA",subjectName;
    private int sectionNumber,classTime;

    Information(){
    }

    public Information(String teacherName, String labName, String subjectName, int sectionNumber, int classTime) {
        this.teacherName = teacherName;
        this.labName = labName;
        this.subjectName = subjectName;
        this.sectionNumber = sectionNumber;
        this.classTime = classTime;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public void setClassTime(int classTime) {
        this.classTime = classTime;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getLabName() {
        return labName;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public int getClassTime() {
        return classTime;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void display() {
        System.out.println("Name: " + teacherName + ", Section: " + sectionNumber +", Subject: " + subjectName + ", Time: " + classTime + ", Lab: " + labName);
    }
}

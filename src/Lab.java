


public class Lab {
    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;
    private student[] students;

    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;

        students = new student[maxSize];
    }

    public void calAvg(){
        double sum = 0;
        for (int i = 0; i < currentSize; i++) {
            sum += students[i].getGrade();
        }
        avgGrade = (sum/currentSize);
        System.out.println("Average is: "+ avgGrade);
    }

    public void enrollStudent(student newStudent){
        students[currentSize++] = newStudent;
    }

    public void printLabInfo(){
        System.out.println("Teacher name is:"+ this.teacherName);
        System.out.println("day of week is:"+this.dayOfWeek);
        System.out.println("max size of lab is:"+this.maxSize);
        System.out.println("current size of lab is:"+this.currentSize);
        System.out.println("avg of students is:"+this.avgGrade);
        for (int i = 0; i < currentSize; i++) {
            System.out.println("student "+ (i+1) +" first name :"+students[i].getFirstName());
            System.out.println("student "+ (i+1) +" last name :"+students[i].getLastName());
            System.out.println("student "+ (i+1) +" id :"+students[i].getId());
            System.out.println("student "+ (i+1) +" grade :"+students[i].getGrade());

        }
    }

    public student[] getStudents() {
        return students;
    }

    public void setStudents(student[] students) {
        this.students = students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }



}

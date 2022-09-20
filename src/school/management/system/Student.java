package school.management.system;

//This class is responsible for keeping the track of students fees, name, grade & fees paid.

public class Student {

    //declare variables
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /** create constructor
     * Fees for every student is $30,000.
     * Fees paid initially is $0.
     * @param id id for the student(unique)
     * @param name name of the student
     * @param grade grade of the student
     */

    public Student (int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

        //method

    }
    //Not going to alter student's name. - no setter for student name or id

    /**
     * Used to update the student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the feesPaid.
     * The school is going to receive the funds.
     * @param fees the fees that the student pays.
     */
    public void updateFeesPaid(int fees){
        this.feesPaid += fees;

    }

    /**
     *
     * @return id of the student
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return grade of the student
     */
    public int getGrade(){
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid(){
        return feesPaid;
    }

    /**
     *
     * @return total fees of the student
     */
    public int getFeesTotal(){
        return feesTotal;
    }
}

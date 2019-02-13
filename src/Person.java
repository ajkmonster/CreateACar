import java.util.ArrayList;

public class Person {
    //composition has-a relationship
    private String name;
    private Job job;
    private Education education;
    private ArrayList<String> education1;
    private String educationString;
    public Person(){

    }
    public long getSalary() {
        return job.getSalary();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return  job.toString()+"Education:   " +makeString()+ "\n";
    }
    public String makeString(){
        educationString = educationString.join(",",education1);
        return educationString;
    }
}
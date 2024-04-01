import java.time.LocalDate;
import java.time.Period;

class person_details {
    protected String name;
    protected LocalDate dob;

    public person_details(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dob, currentDate);
        System.out.println("Age: " + age.getYears() + " years");
    }
}
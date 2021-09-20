package object;

import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
public class Guest {
    private LocalDate dateOFBirth;

    public Guest(LocalDate dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    public int getAge(LocalDate date) {
        LocalDate dateNow = LocalDate.now();
        Period age = Period.between(date, dateNow);
        return age.getYears();
    }

    public boolean isAdultGuest(int age) {
        return age > 17;
    }

}

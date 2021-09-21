package object;

import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
//@Builder
public class Guest {
    private LocalDate dateOFBirth;

    public Guest(LocalDate dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    int getAge() {
        LocalDate dateNow = LocalDate.now();
        Period age = Period.between(dateOFBirth, dateNow);
        return age.getYears();
    }

    public boolean isAdultGuest(int age) {
        return age > 17;
    }
}

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
public class Guest {
    private LocalDate dateOFBirth;

    public Guest(LocalDate dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

//    public LocalDate getDateOFBirth() {
//        return dateOFBirth;
//    }
//
//    public void setDateOFBirth(LocalDate dateOFBirth) {
//        this.dateOFBirth = dateOFBirth;
//    }

    public int getAge(LocalDate date) {
        LocalDate dateNow = LocalDate.now();
        Period age = Period.between(date, dateNow);
        return age.getYears();
    }

    public boolean isAdultGuest(int age) {
        return age > 17;
    }
}

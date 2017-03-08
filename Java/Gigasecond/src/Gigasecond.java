import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond{
    private static int gigaseconds = 1000000000;
    public LocalDateTime birthdate;
    public Gigasecond(LocalDate birthdate){
        this.birthdate = birthdate.atStartOfDay();
    }

    public Gigasecond(LocalDateTime birthdate){
        this.birthdate = birthdate;
    }

    public LocalDateTime getDate(){
        return birthdate.plus(Duration.ofSeconds(gigaseconds));
    }
}
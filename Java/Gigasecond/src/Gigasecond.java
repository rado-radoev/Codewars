import java.time.*;

public class Gigasecond{
    private static int gigaseconds = 10 ^ 9;
    private LocalDateTime birthday;
    
    public Gigasecond(LocalDate birthdate){
        this.birthday = birthdate.atStartOfDay();
    }

    public Gigasecond(LocalDateTime birthdate){
        this.birthday = birthdate;
    }

    public LocalDateTime getDate(){
        return birthday.plus(Duration.ofSeconds(gigaseconds));
    }
}
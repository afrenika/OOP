package tr3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tr2.entires.Cat;
import tr2.entires.Parrot;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("tr2")
public class Main {
    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        return switch (dayOfWeek) {
            case MONDAY -> new Monday();
            case TUESDAY -> new Tuesday();
            case WEDNESDAY -> new Wednesday();
            default -> null;
        };
    }
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getWeekDayName() + " today!");
        Parrot parrot = context.getBean(Parrot.class);
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat.getName());
    }
}

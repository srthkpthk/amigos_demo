package pthk.srthk.amigos_demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student helloFatty = new Student("Hello Fatty", LocalDate.of(1999, Month.APRIL, 15), "asedfd@gmail.com");
            Student utkarsh = new Student("Utkarsh", LocalDate.of(2010, Month.APRIL, 22), "utkarsh@gmail.com");
            repository.saveAll(List.of(helloFatty, utkarsh));
        };
    }
}

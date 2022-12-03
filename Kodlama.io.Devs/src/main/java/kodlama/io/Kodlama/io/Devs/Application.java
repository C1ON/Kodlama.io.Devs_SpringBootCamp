package kodlama.io.Kodlama.io.Devs;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.business.concretes.ProgrammingLanguageManager;
import kodlama.io.Kodlama.io.Devs.dataAccess.concretes.InMemoryProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);

        ProgrammingLanguageService programmingLanguageService = new ProgrammingLanguageManager(new InMemoryProgrammingLanguageRepository());

//         System.out.println(programmingLanguageService.getById(0).getName());
//         programmingLanguageService.update(new ProgrammingLanguage(0,"GoLang"),0);
//         programmingLanguageService.add(new ProgrammingLanguage(5,"R"));
//         programmingLanguageService.delete(0);


//        for(ProgrammingLanguage programmingLanguage : programmingLanguageService.getAll()){
//            System.out.println(programmingLanguage.getId() + " " + programmingLanguage.getName());
//        }

    }

}

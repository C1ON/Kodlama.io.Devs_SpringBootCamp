package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(0, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(1, "Python"));
        programmingLanguages.add(new ProgrammingLanguage(2, "C#"));
        programmingLanguages.add(new ProgrammingLanguage(3, "PHP"));
        programmingLanguages.add(new ProgrammingLanguage(4, "JavaScript"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguages.get(id);
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        programmingLanguages.remove(id);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, int id) {
        programmingLanguages.set(id, programmingLanguage);
    }
}

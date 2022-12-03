package kodlama.io.Kodlama.io.Devs.business.abstracts;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id) throws Exception;
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(int id) throws Exception;
    void update(ProgrammingLanguage programmingLanguage,int id) throws Exception;
}

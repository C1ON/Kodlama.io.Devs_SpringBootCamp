package kodlama.io.Kodlama.io.Devs.business.concretes;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    public boolean isIdExist(int id) {
        for (ProgrammingLanguage programmingLanguage : getAll()) {
            if (programmingLanguage.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean isNameEmpty(String name) {
        return name.isEmpty();
    }

    public boolean nameChecker(String name) {
        for (ProgrammingLanguage programmingLanguage : getAll()) {
            if (programmingLanguage.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) throws Exception {
        if (isIdExist(id)) {
            return programmingLanguageRepository.getById(id);
        } else {
            throw new Exception("Böyle bir id mevcut değil!");
        }
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        if ((nameChecker(programmingLanguage.getName())) || isNameEmpty(programmingLanguage.getName())) {
            throw new Exception("Boş girildi veya listede zaten mevcut!");
        } else {
            programmingLanguageRepository.add(programmingLanguage);
        }
    }

    @Override
    public void delete(int id) throws Exception {
        if (isIdExist(id)) {
            programmingLanguageRepository.delete(id);
        } else {
            throw new Exception("Böyle bir id mevcut değil!");
        }
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, int id) throws Exception {
        if (isIdExist(id)) {
            programmingLanguageRepository.update(programmingLanguage, id);
        } else {
            throw new Exception("Böyle bir id mevcut değil!");
        }
    }
}

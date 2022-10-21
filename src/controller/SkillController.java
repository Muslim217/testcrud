package controller;

import model.Skill;
import repository.Repository;
import repository.SkillRepository;

public class SkillController implements Controller<Skill> {
    Repository<Skill> repository = new SkillRepository();
    @Override
    public Skill create(String data) {
        Skill skill = new Skill(data);
        repository.create(skill);
        return skill;
    }

    @Override
    public Skill read(Long id) {
        return null;
    }

    @Override
    public Skill update(String data) {
        String[] params = data.split(",");
        Skill skill = new Skill(Long.valueOf(params[0]), params[1]);

        return skill;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}

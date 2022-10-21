package view;

import controller.Controller;
import controller.SkillController;
import model.Skill;

public class SkillView implements View {

    private Controller<Skill> controller = new SkillController();
    @Override
    public void create(String data) {
        controller.create(data);
    }

    @Override
    public void read(Long id) {

    }

    @Override
    public void update(String data) {
        System.out.println("Your have updated " + controller.update(data));

    }

    @Override
    public void delete(Long id) {

    }
}

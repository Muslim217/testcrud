package repository;

import model.Skill;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SkillRepository implements Repository<Skill>{
    private Map<Long,Skill> mapSkills = new LinkedHashMap<>();

    private File skillsFile = new File("resources/skills.txt");

    @Override
    public Skill create(Skill skill)  {
        moveDataToMap();
        putSkillToMap(skill);
        writeData();
        return skill;
    }

    private void writeData() {
        try(PrintWriter writer = new PrintWriter (skillsFile)) {
            for (Map.Entry <Long,Skill> data : mapSkills.entrySet()){
                Skill skill = data.getValue();
                writer.println(String.format("%s,%s ", skill.getId(), skill.getName()));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Skill read(Long id) {
        return null;
    }

    @Override
    public Skill update(Skill skill) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }


    private void moveDataToMap (){
        mapSkills.clear();
        try (BufferedReader readerLine = new BufferedReader(new FileReader(skillsFile))){
            String line = readerLine.readLine();
            while(line!=null && !line.isEmpty()){
                Skill skill = parsStringToSkill(line);
                mapSkills.put(skill.getId(),skill);
                line = readerLine.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private Skill parsStringToSkill (String line){
        String[] arrayData = line.toLowerCase().split(",");
        Long id = Long.parseLong(arrayData[0]);
        Skill skill = new Skill(id,arrayData[1]);
        return skill;
    }

    private void putSkillToMap(Skill skill){
        if (mapSkills.isEmpty()){
            skill.setId(1L);
            mapSkills.put(1L, skill);
        }
        else {
            Skill lastObject = null;
            for (Map.Entry <Long,Skill> entry : mapSkills.entrySet()){
                 lastObject = entry.getValue();
            }
            Long id = lastObject.getId();
            skill.setId(id++);
            mapSkills.put(skill.getId(), skill);
        }

    }

}

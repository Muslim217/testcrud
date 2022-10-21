package repository;

import model.Skill;

import java.io.IOException;

public interface Repository <T> {
    T create (T obj);

    T read (Long id);

    T update (T obj);

    Boolean delete (Long id);

}

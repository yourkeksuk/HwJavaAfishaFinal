package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void testFindAll() {

        String film1 = "film1";
        String film2 = "film2";
        String film3 = "film3";
        String film4 = "film4";
        String film5 = "film5";

        Manager manager = new Manager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        String[] expected = {film1, film2, film3, film4, film5};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast () {
        String film1 = "film1";
        String film2 = "film2";
        String film3 = "film3";
        String film4 = "film4";
        String film5 = "film5";

        Manager manager = new Manager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        String[] expected = {film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

}

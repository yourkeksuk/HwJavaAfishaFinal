package ru.netology.javaqa;

public class Manager {

    public String[] films = new String[0];
    public int limit;

    public Manager() {
        limit = 10;
    }

    public void add(String film) {

        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultSize;
        if(limit < films.length) {
            resultSize = limit;
        }else {
            resultSize = films.length;
        }

        String[] result = new String[resultSize];
        for (int i = 0; i < resultSize; i++)
            result[i] = films[films.length - 1 - i];
        return result;
    }

}
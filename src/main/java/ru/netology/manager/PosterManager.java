package ru.netology.manager;

import ru.netology.domain.PosterItem;

public class PosterManager {
    private PosterItem[] items = new PosterItem[0];

    public PosterManager() {
        findLast(5);
    }

    public PosterManager(int limit) {
        findLast(limit);
    }

    public void addFilm(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }

        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PosterItem[] findAll() {
        return items;
    }

    public PosterItem[] findLast(int limit) {
        int resultLength;

        if (limit > items.length || limit <= 0) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }

        PosterItem[] result = new PosterItem[resultLength];

        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - 1 - i];
        }

        return result;
    }
}

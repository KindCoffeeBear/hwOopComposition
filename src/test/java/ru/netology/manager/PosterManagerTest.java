package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

public class PosterManagerTest {

    PosterItem item1 = new PosterItem("Бладшот", "боевик", false);
    PosterItem item2 = new PosterItem("Вперед", "мультфильм", false);
    PosterItem item3 = new PosterItem("Отель 'Белград'", "комедия", false);
    PosterItem item4 = new PosterItem("Джентльмены", "боевик", false);
    PosterItem item5 = new PosterItem("Человек-невидимка", "боевик", false);
    PosterItem item6 = new PosterItem("Тролли. Мировой тур", "мультфильм", true);
    PosterItem item7 = new PosterItem("Номер один", "комедия", true);

    @Test
    public void shouldShowAllAddedFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);
        manager.addFilm(item6);
        manager.addFilm(item7);

        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowSevenLastAddedFilmsWithLimit7() {
        PosterManager manager = new PosterManager();
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);
        manager.addFilm(item6);
        manager.addFilm(item7);

        PosterItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast(7);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowSevenLastAddedFilmsWithLimit8() {
        PosterManager manager = new PosterManager(8);
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);
        manager.addFilm(item6);
        manager.addFilm(item7);

        PosterItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast(8);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowOneLastAddedFilmsWithLimit1() {
        PosterManager manager = new PosterManager(1);
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);
        manager.addFilm(item6);
        manager.addFilm(item7);

        PosterItem[] expected = {item7};
        PosterItem[] actual = manager.findLast(1);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowSevenLastAddedFilmsWithLimit0() {
        PosterManager manager = new PosterManager();
        manager.addFilm(item1);
        manager.addFilm(item2);
        manager.addFilm(item3);
        manager.addFilm(item4);
        manager.addFilm(item5);
        manager.addFilm(item6);
        manager.addFilm(item7);

        PosterItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast(0);

        Assertions.assertArrayEquals(expected, actual);
    }
}

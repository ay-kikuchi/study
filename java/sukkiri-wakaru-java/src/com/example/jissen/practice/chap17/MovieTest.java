package com.example.jissen.practice.chap17;

import java.time.LocalDate;
import static org.junit.Assert.*;
import org.junit.Test;

public class MovieTest {
    @Test
    public void test_引数無しでMovieを作成_正常系() {
        var title = "獄門島";
        var now = LocalDate.now();

        var movie = new Movie();
        movie.setTitle(title);
        movie.setPublishDate(now);

        assertMovie(movie, title, now);
    }

    @Test
    public void test_タイトルを指定してMovieを作成_正常系() {
        var title = "バック・トゥ・ザ・フューチャー";
        var yesterday = LocalDate.now().minusDays(1);

        var movie = new Movie(title);
        movie.setPublishDate(yesterday);

        assertMovie(movie, title, yesterday);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_タイトルにnull指定_異常系() {
        var movie = new Movie(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_公開日にnull指定_異常系() {
        var movie = new Movie();
        movie.setPublishDate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_公開日に未来の日付を指定_異常系() {
        var movie = new Movie();
        var tomorrow = LocalDate.now().plusDays(1);
        movie.setPublishDate(tomorrow);
    }

    private void assertMovie(Movie movie, String expectedTitle, LocalDate expectedPublishDate) {
        assertEquals(expectedTitle, movie.getTitle());
        assertEquals(expectedPublishDate, movie.getPublishDate());
    }
}

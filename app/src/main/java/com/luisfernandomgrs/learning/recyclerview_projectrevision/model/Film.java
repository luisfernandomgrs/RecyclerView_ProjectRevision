package com.luisfernandomgrs.learning.recyclerview_projectrevision.model;

public class Film {
   private String titleFilm;
   private String GenreFilm;
   private String yearFilm;

   public String getTitleFilm() {
      return titleFilm;
   }

   public void setTitleFilm(String titleFilm) {
      this.titleFilm = titleFilm;
   }

   public String getGenreFilm() {
      return GenreFilm;
   }

   public void setGenreFilm(String genreFilm) {
      GenreFilm = genreFilm;
   }

   public String getYearFilm() {
      return yearFilm;
   }

   public void setYearFilm(String yearFilm) {
      this.yearFilm = yearFilm;
   }

   public Film() {
   }

   public Film(String titleFilm, String genreFilm, String yearFilm) {
      this.titleFilm = titleFilm;
      GenreFilm = genreFilm;
      this.yearFilm = yearFilm;
   }
}

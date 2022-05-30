package com.luisfernandomgrs.learning.recyclerview_projectrevision.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.luisfernandomgrs.learning.recyclerview_projectrevision.R;
import com.luisfernandomgrs.learning.recyclerview_projectrevision.model.Film;

import java.util.List;

public class AdapterFilmes extends RecyclerView.Adapter<AdapterFilmes.MyViewHolder> {

   private List<Film> listFilms;

   public AdapterFilmes(List<Film> _listFilms) {
      this.listFilms = _listFilms;
   }

   @NonNull
   @Override
   public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View itemListFilm = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_list_films, parent, false);

      return new MyViewHolder(itemListFilm);
   }

   @Override
   public int getItemCount() {
      return listFilms.size();
   }

   @Override
   public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      Film _film = listFilms.get(position);

      holder.titleFilm.setText(_film.getTitleFilm());
      holder.yearFilm.setText(_film.getYearFilm());
      holder.genereFilm.setText(_film.getGenreFilm());
   }

   public class MyViewHolder extends RecyclerView.ViewHolder {

      TextView titleFilm;
      TextView genereFilm;
      TextView yearFilm;

      public MyViewHolder(@NonNull View itemView) {
         super(itemView);

         titleFilm = itemView.findViewById(R.id.textTitle);
         genereFilm = itemView.findViewById(R.id.textGenre);
         yearFilm = itemView.findViewById(R.id.textYear);
      }
   }
}

package com.luisfernandomgrs.learning.recyclerview_projectrevision.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.luisfernandomgrs.learning.recyclerview_projectrevision.R;
import com.luisfernandomgrs.learning.recyclerview_projectrevision.adapter.AdapterFilmes;
import com.luisfernandomgrs.learning.recyclerview_projectrevision.model.Film;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Film> Films = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Lista de Filmes");

        recyclerView = findViewById(R.id.recyclerView);

        // Creating list of films
        this.creatListFilms();

        // settings to adapter
        AdapterFilmes adapterFilmes = new AdapterFilmes(Films);

        // settings to recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        // event click extends...
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(),
                recyclerView,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Film _film = Films.get(position);
                        Toast.makeText(getApplicationContext(), "Selecionado: " + _film.getTitleFilm(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Film _film = Films.get(position);
                        Toast.makeText(getApplicationContext(), "RESERVADO: " + _film.getTitleFilm(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(getApplicationContext(), "Item selecionado...", Toast.LENGTH_LONG).show();
                    }
                }
        ));

        recyclerView.setAdapter(adapterFilmes);
    }

    private void creatListFilms() {
        Film _Film;

        _Film = new Film("101 Dálmatas", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Filme de aventura infantil", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("A Creche do Papai", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("A Família do Futuro", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("A Era do Gelo 4", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("A Fantástica Fábrica de Chocolate", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Aladdin (2019)", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Detona Ralph", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Enrolados", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Como Treinar o seu Dragão", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("As Viagens de Gulliver", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Monstros S.A.", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Happy Feet: O Pinguim", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Karatê Kid", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Os Smurfs", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("O Galinho Chicken Little", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Wall-E", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Up: Altas Aventuras", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Robôs", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Rio", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Kung Fu Panda", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("O Bicho vai Pegar", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("O Espanta Tubarões", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Babe - o Porquinho Atrapalhado na Cidade", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("O Ursinho Pooh", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Aconteceu no Natal do Mickey", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("A Lenda dos Guardiões", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Alice no País da Maravilhas", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Alvin e os Esquilos", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("A Pequena Sereia", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("A Viagem de Chihiro", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("A Pequena Espiã", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Mogli - o Menino Lobo", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Tarzan", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("O Expresso Polar", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("O Mundos dos Pequeninos", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Ratatouille", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Carros", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Bee Movie - A História de uma Abelha", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Tá Chovendo Hambúrguer", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("A Princesa e o Sapo", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("As Crônicas de Nárnia", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("O Leão, a Feiticeira e o Guarda-Roupa", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Dogão - Amigo pra Cachorro", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Doze é Demais", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("A Dama e o Vagabundo", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Os Batutinhas", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Frozen: Uma Aventura Congelante", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Os Pinguins de Madagascar", "Diversos", "2022");
        this.Films.add(_Film);

        this.Films.add(_Film);

        _Film = new Film("Divertida Mente", "Diversos", "2022");
        this.Films.add(_Film);

        this.Films.add(_Film);

        _Film = new Film("Pets: A Vida Secreta dos Bichos", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Meu Malvado Favorito", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Minions", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Hércules", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Treinando o Papai", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("O Fada do Dente", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Bob Esponja: o Filme", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Garfield: o Filme", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Shrek", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Uma Noite no Museu", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Cada Um na Sua Casa", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Flubber - Uma Invenção Desmiolada", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Operação Babá", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Madagascar", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("O Diário da Princesa", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Vida de Inseto", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Valente", "Diversos", "2022");
        this.Films.add(_Film);

        this.Films.add(_Film);

        _Film = new Film("Zootopia", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Universidade Monstros", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Os Anjinhos - O Filme", "Diversos", "2022");
        this.Films.add(_Film);

        this.Films.add(_Film);

        _Film = new Film("Pocahontas", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Gato de Botas", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Operação Cupido", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Roubo nas Alturas", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("O Bom Dinossauro", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Os Seus, os Meus e os Nossos", "Diversos", "2022");
        this.Films.add(_Film);

        _Film = new Film("Coach Carter", "Diversos", "2022");
        this.Films.add(_Film);
    }
}
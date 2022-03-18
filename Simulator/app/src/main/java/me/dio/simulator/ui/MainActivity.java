package me.dio.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.dio.simulator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    private void setupMatchesList(){
        // TODO: Listar partidas
    }

    private void setupMatchesRefresh(){
        // TODO: Atualizar partidas com swipe
    }

    private void setupFloatingActionButton(){
        // TODO: Criar evento de clique
    }

}

package me.dio.simulator.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import me.dio.simulator.databinding.MatchItemBinding;
import me.dio.simulator.domain.Match;

public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.ViewHolder>{

    private List<Match> matches;

    public MatchesAdapter(List<Match> matches){
        this.matches = matches;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        MatchItemBinding binding = MatchItemBinding.inflate(layoutInflater, parent, false);
        return(new ViewHolder(binding));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        Context context = holder.itemView.getContext();
        Match match = matches.get(position);

        Glide.with(context).load(match.getHome().getImage()).into(holder.binding.imgvHomeTeam);
        holder.binding.txtvHomeTeamName.setText(match.getHome().getName());

        Glide.with(context).load(match.getVisitor().getImage()).into(holder.binding.imgvVisitingTeam);
        holder.binding.txtvVisitingTeamName.setText(match.getVisitor().getName());
    }

    @Override
    public int getItemCount(){
        return(matches.size());
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final MatchItemBinding binding;

        public ViewHolder(MatchItemBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

    }

}

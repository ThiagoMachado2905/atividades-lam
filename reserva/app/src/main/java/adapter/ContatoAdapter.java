package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alunos.aplicaointerface.R;

import java.util.List;

import model.contato;

public class ContatoAdapter extends RecyclerView.Adapter {
    private List<contato> lista;
    private Context context;

    public ContatoAdapter(List<contato> l, Context c){
        this.lista = l;
        this.context = c;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(
         @NonNull ViewGroup parent, int viewType
    ){
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_lista,parent,false);
        return new ContatoViewHolder(itemView);
    }
    @Override
    public int getItemCount(){
        return lista.size();
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position){
        ContatoViewHolder theHolder = (ContatoViewHolder) holder;
        contato contato = lista.get(position);
        theHolder.nome.setText(contato.getNome());
        theHolder.telefone.setText(contato.getTelefone());
    }

}

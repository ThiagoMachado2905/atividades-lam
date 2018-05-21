package adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.example.alunos.aplicaointerface.R;

public class ContatoViewHolder extends RecyclerView.ViewHolder {
    final TextView nome;
    final TextView telefone;

    public ContatoViewHolder(View itemView){
        super(itemView);
        nome = itemView.findViewById(R.id.txtNome);
        telefone = itemView.findViewById(R.id.txtTelefone);
    }
}

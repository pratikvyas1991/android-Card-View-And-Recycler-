package trial.cardviewexample;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Vyas on 4/11/2016.
 */
public class RecyclerViewBaseAdapter extends RecyclerView.Adapter<RecyclerViewBaseAdapter.PersonViewHolder>{
    List<Person> persons;
    public RecyclerViewBaseAdapter(List<Person> persons) {
        this.persons=persons;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_card_view_base,parent,false);
        PersonViewHolder holder = new PersonViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(final PersonViewHolder holder, final int position) {
           holder.perName.setText(persons.get(position).name);
           holder.perName.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Toast.makeText(v.getContext(),"Hello Dear , "+persons.get(position).name,Toast.LENGTH_LONG).show();
               }
           });
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView perName;
        public PersonViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.card_view);
            perName=(TextView)itemView.findViewById(R.id.title_name);
        }
    }
}

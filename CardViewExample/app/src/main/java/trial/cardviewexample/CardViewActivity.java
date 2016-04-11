package trial.cardviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vyas on 4/11/2016.
 */
public class CardViewActivity extends Activity {
    List<Person> personList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view_1);

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        personList = new ArrayList<>();

        Person p1 = new Person("Amitabh Bacchan");
        Person p2 = new Person("Sharukh Khan");
        Person p3 = new Person("Hritik Roshan");
        Person p4 = new Person("Akshay Kumar");
        Person p5 = new Person("Salman Khan");
        Person p6 = new Person("Dipika Padukone");
        Person p7 = new Person("Katrina kaif");
        Person p8 = new Person("Nargis Fakri");
        Person p9 = new Person("Scarlet Johnson");
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        personList.add(p7);
        personList.add(p8);
        personList.add(p9);

        RecyclerViewBaseAdapter recyclerViewBaseAdapter= new RecyclerViewBaseAdapter(personList);
        recyclerView.setAdapter(recyclerViewBaseAdapter);

    }
}

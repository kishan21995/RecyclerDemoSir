package activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.recyclerdemo1.R;

import java.util.ArrayList;
import java.util.List;

import Adapter.Adapter;
import model.UserModel;

public class MainActivity extends AppCompatActivity {
    List<UserModel> userModelList = new ArrayList<>();
    private Adapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        View cardView = findViewById(R.id.cardView);


        adapter = new Adapter(userModelList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);



        List<UserModel> userList = new ArrayList<>();


        for (int i = 0; i < 100; i++) {
            UserModel user = new UserModel();
            user.setNameTv1("Kamal " + i);
            user.setNameTv2("kamal" + i + "@gmail.com");
            userList.add(user);
        }
        Adapter adapter = new Adapter(this, userList);

        recyclerView.setAdapter(adapter);



    }
}

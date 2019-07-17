package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.recyclerdemo1.R;

import java.util.List;
import java.util.zip.Inflater;

import model.UserModel;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context context;
    List<UserModel>userModelList;

    public Adapter(Context context,List<UserModel> userModelList1){
        this.context = context;
        this.userModelList = userModelList1;
    }

    public Adapter(List<UserModel> userModelList) {
        this.userModelList=userModelList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_user_item, viewGroup ,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

         UserModel userModel = userModelList.get(i);
         myViewHolder.nameTv1.setText((CharSequence) userModel.getNameTv1());
         myViewHolder.nameTv2.setText((CharSequence) userModel.getNameTv2());


    }

    @Override
    public int getItemCount() {
        if (userModelList != null && userModelList.size() > 0) {
            return userModelList.size();
        } else {
            return 0;
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nameTv1,nameTv2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTv1 = itemView.findViewById(R.id.nameTv1);
            nameTv2 = itemView.findViewById(R.id.nameTv2);
        }
    }
}

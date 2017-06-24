package ly.mohammed_albosifi.navgationdrawerandfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.secondfragmentlayout, container, false);
        Button btn3=(Button) view.findViewById(R.id.btn3);
        Button btn4=(Button) view.findViewById(R.id.btn4);
        return view;    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn3:
                Toast.makeText(getActivity(), "3333333333333333", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toast.makeText(getActivity(), "44444", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

package dtrix.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Soumya on 25-06-2017.
 */

public class TabFragment extends Fragment {

    private TextView textView2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_main,container,false);
        TextView textView1=(TextView)rootview.findViewById(R.id.section_label);
        textView2 =(TextView) rootview.findViewById(R.id.coordinates);

        textView1.setText("this is my Fragment");
        textView2.setText("Coordinates");

        rootview.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()== MotionEvent.ACTION_MOVE){
                    String xc = String.valueOf(event.getX());
                    String yc = String.valueOf(event.getY());
                    textView2.setText("Coordinate X:"+ xc +"  Y:" + yc);
                    return true;

                } else if(event.getAction()==MotionEvent.ACTION_UP){
                    Toast.makeText(getActivity(),"Action_Up", Toast.LENGTH_SHORT).show();
                    return  true;

                }else if(event.getAction()==MotionEvent.ACTION_DOWN) {
                    Toast.makeText(getActivity(), "Action_Down", Toast.LENGTH_SHORT).show();
                    return true;
                }

                return false;
            }
        });

        return rootview;
    }
}

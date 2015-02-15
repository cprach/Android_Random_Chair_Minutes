package rach.cp.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void doGet(View v) {
//        Logic l = new Logic();
//        TextView txtchairname = (TextView)findViewById(R.id.txtchairname);
//        TextView txtminutetakername = (TextView)findViewById(R.id.txtminutetakername);
//        
//        txtchairname.setText("Chair: " + l.getChair());
//        txtminutetakername.setText("Minute taker: " + l.getMinuteTaker());
    	
    	Logic2 l = new Logic2();
        TextView txtchairname = (TextView)findViewById(R.id.txtchairname);
        TextView txtminutetakername = (TextView)findViewById(R.id.txtminutetakername);
        
        txtchairname.setText("Chair: " + l.getChair());
        txtminutetakername.setText("Minute taker: " + l.getMinuteTaker());
        
    }
}

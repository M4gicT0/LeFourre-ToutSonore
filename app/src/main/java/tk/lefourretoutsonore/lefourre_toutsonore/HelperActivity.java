package tk.lefourretoutsonore.lefourre_toutsonore;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import tk.lefourretoutsonore.lefourre_toutsonore.PlayListRelated.PlayList;

/**
 * Created by M4gicT0 on 15/01/2016.
 */
public class HelperActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        String action = (String) getIntent().getExtras().get("DO");
        Log.i("debug", "helperactivity called : " + action);
        assert action != null;
        if(action.equals("play"))
            DataHolder.getInstance().getPlaylist().resume();
        else if(action.equals("pause"))
            DataHolder.getInstance().getPlaylist().pause();

        finish();
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }
}
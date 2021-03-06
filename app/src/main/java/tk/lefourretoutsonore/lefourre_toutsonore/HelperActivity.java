package tk.lefourretoutsonore.lefourre_toutsonore;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


/**
 * Created by M4gicT0 on 15/01/2016.
 */
public class HelperActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String action = (String) getIntent().getExtras().get("DO");
        assert action != null;
        if(action.equals("play"))
            DataHolder.getInstance().getPlaylist().resume();
        else if(action.equals("pause"))
            DataHolder.getInstance().getPlaylist().pause();
        else if(action.equals("previous"))
            DataHolder.getInstance().getPlaylist().previous();
        else if(action.equals("next"))
            DataHolder.getInstance().getPlaylist().next();

        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
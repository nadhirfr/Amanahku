package id.amanahku.amanahku;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import id.amanahku.amanahku.Adapter.GuestModal.CustomExpandableListAdapter;
import id.amanahku.amanahku.Fragment.GuestModal.GuestModal_dataList;
import id.amanahku.amanahku.Fragment.GuestModal.GuestModal_dialogFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //load dialog fragment
        DialogFragment dialogFragment = new GuestModal_dialogFragment();
        dialogFragment.show(getFragmentManager(),"Dialog Guest");
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //menyembunyikan actionbar
        //getActionBar().hide();
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

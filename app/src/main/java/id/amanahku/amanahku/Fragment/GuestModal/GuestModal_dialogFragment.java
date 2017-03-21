package id.amanahku.amanahku.Fragment.GuestModal;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import id.amanahku.amanahku.Adapter.GuestModal.CustomExpandableListAdapter;
import id.amanahku.amanahku.R;

/**
 * Created by fachrul on 3/21/17.
 */

public class GuestModal_dialogFragment extends android.app.DialogFragment {
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.modal_dialog_guest,null);
        expandableListView = (ExpandableListView) view.findViewById(R.id.lvExp);
        expandableListDetail = GuestModal_dataList.getData();
        expandableListTitle = new ArrayList<>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(this.getActivity(),expandableListTitle,expandableListDetail);

        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getActivity(),expandableListTitle.get(groupPosition)
                        + "Group Expanded.",Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getActivity(),expandableListTitle.get(groupPosition)
                        +"List Collapse",Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Toast.makeText(getActivity(),expandableListTitle.get(groupPosition)
                        +" -> "+ expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition),Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });


        builder.setView(view);
        return builder.create();
        // return super.onCreateDialog(savedInstanceState);
    }
}

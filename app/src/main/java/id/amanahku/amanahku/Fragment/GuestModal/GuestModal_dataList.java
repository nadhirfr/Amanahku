package id.amanahku.amanahku.Fragment.GuestModal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fachrul on 3/21/17.
 */

public class GuestModal_dataList {

    public static HashMap<String, List<String>> getData(){
        HashMap<String, List<String>> expandableListDetail =
                new HashMap<>();

        List<String> persyaratan = new ArrayList<>();
        persyaratan.add("List 1");
        persyaratan.add("List 2");

        List<String> keuntungan = new ArrayList<>();
        keuntungan.add("List 2");
        keuntungan.add("List 2 -2");

        expandableListDetail.put("Keuntungan", keuntungan);
        expandableListDetail.put("Persyaratan",persyaratan);

        return expandableListDetail;
    }
}

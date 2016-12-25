package com.wisnukrn_.kalenderakademikuii;

import com.roomorama.caldroid.CaldroidFragment;
import com.roomorama.caldroid.CaldroidGridAdapter;

/**
 * Created by private on 25/12/2016.
 */

public class CalFragment extends CaldroidFragment {

    @Override
    public CaldroidGridAdapter getNewDatesGridAdapter(int month, int year) {
        // TODO Auto-generated method stub
        return new CalAdapter(getActivity(), month, year,
                getCaldroidData(), extraData);
    }

}
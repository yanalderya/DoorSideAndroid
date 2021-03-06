package ozanturcan.com.doorsidenoti.nav_fragments;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import ozanturcan.com.doorsidenoti.Models.DeviceInformations;
import ozanturcan.com.doorsidenoti.Models.UserInformation;
import ozanturcan.com.doorsidenoti.Operations.FirebaseAuthOperations;
import ozanturcan.com.doorsidenoti.Operations.FirebaseDatabaseOperations;
import ozanturcan.com.doorsidenoti.R;

/**
 * Created by DELL on 23.10.2017.
 */

public class BoardsFragment extends Fragment {
    private FirebaseDatabaseOperations FireDB = new FirebaseDatabaseOperations().getAnInnerClass();
    DeviceInformations deviceInformations = new DeviceInformations().getAnInnerClass();
    private TextView mCurrentToken;
    private TextView mDeviceId;
    private TextView mCurrentMessage;
    private TextView mTotalMessages;
    private TextView mTotalAnswer;

    @SuppressLint("SetTextI18n")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View rootview=inflater.inflate(R.layout.fragment_boards,container,false);

        mCurrentMessage=(TextView) rootview.findViewById(R.id.button_CurrentMessage);
        mCurrentToken=(TextView) rootview.findViewById(R.id.button_CurrentToken);
        mDeviceId=(TextView) rootview.findViewById(R.id.button_DeviceID);
        mTotalMessages=(TextView)rootview.findViewById(R.id.button_totalMessage);
        mTotalAnswer=(TextView) rootview.findViewById(R.id.button_totalAnswer);


        mDeviceId.setText("DeviceID \n" +deviceInformations.getDeviceId());
        mCurrentMessage.setText("Current Message \n" +deviceInformations.getCurrentMessage());
        mCurrentToken.setText("Current Token \n" + deviceInformations.getCurrentToken());




        return rootview;

    }

}

package com.example.arora.cehroindia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mac on 04/08/16.
 */

public class ContactUsFragment extends Fragment {
    public ContactUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_contact_us, container, false);
        CardView img = (CardView) view.findViewById(R.id.map);

        img.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String strUri = "http://maps.google.com/maps?q=" +
                        "Munirka Village Opp JNU Main\n" +
                        "Gate New Delhi -110067";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));

                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");

                startActivity(intent);
            }
        });

        CardView img2 = (CardView) view.findViewById(R.id.mail);

        img2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent mEmail = new Intent(Intent.ACTION_SEND);
                mEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{ "pradeep@cehroindia.org"});

                mEmail.setType("message/rfc822");
                startActivity(Intent.createChooser(mEmail, "Choose an email client to send your"));
            }
        });

      /*  CardView img3 = (CardView) view.findViewById(R.id.call);

        img3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+91 9811263046"));
                startActivity(intent);
            }
        });
*/



        return view;
    }




}

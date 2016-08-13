package com.example.arora.cehroindia;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CsrFragment extends Fragment {


    public CsrFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_csr, container, false);
      /*  ImageView textView =(ImageView)  view.findViewById(R.id.Pr);
        textView.setClickable(true);
       // textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.facebook.com/chaudharypradeep0212'> FB </a>";
      //  textView.setText(Html.fromHtml(text));


*/
        ImageView img = (ImageView)view.findViewById(R.id.Pr);

        img.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/chaudharypradeep0212"));
                startActivity(intent);
            }
        });


      //  ImageView img1 = (ImageView)view.findViewById(R.id.ph);

     /*  img1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+91 9811263046"));
                  startActivity(intent);

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+91 9811263046"));
                startActivity(intent);
            }
        });

*/
        //Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "Your Phone_number"));
      //  startActivity(intent);

        return view;

    }

}

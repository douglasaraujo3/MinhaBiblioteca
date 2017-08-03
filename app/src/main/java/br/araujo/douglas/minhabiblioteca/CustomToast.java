package br.araujo.douglas.minhabiblioteca;

import android.content.Context;
import android.media.Image;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by logonrm on 02/08/2017.
 */

public class CustomToast {

    public static void showToast(Context context,String mensagem,Integer tipo){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customToastRoot = inflater.inflate(R.layout.custom_toast,null);
        Toast customToast = new Toast(context);
        customToast.setView(customToastRoot);
        TextView textView = (TextView) customToastRoot.findViewById(R.id.tvMsg);
        textView.setText(mensagem);
        ImageView imageView = (ImageView) customToastRoot.findViewById(R.id.ivLogo);
        //imageView.setImageURI();

        switch (tipo){
            case 1:
                imageView.setImageResource(R.drawable.ok);
                break;
            case 2:
                imageView.setImageResource(R.drawable.information);
                break;
            case 3:
                imageView.setImageResource(R.drawable.error);
                break;
        }

        customToast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM,0,0);
        customToast.setDuration(Toast.LENGTH_LONG);
        customToast.show();
    }
}

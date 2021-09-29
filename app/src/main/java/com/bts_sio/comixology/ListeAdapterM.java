package com.bts_sio.comixology;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ListeAdapterM extends ArrayAdapter<Membre> {

    Context context;

    public ListeAdapterM(@NonNull Context context, List<Membre> listeMembre) {
        super(context, -1,listeMembre);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        Membre unMembre;
        view=null;

        if (convertView==null){
            LayoutInflater LayoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = LayoutInflater.inflate(R.layout.ligne,parent,false);
        }else{
            view= convertView;
        }
        unMembre = getItem(position);
        TextView tvTitre = (TextView) view.findViewById(R.id.tvtitre);
        TextView tvDesc = (TextView) view.findViewById(R.id.tvdesc);
        ImageView img1 = (ImageView) view.findViewById(R.id.img1);

        tvTitre.setText(unMembre.getNameM());
        tvDesc.setText((unMembre.getDescM()));

        AssetManager manager = context.getAssets();

        InputStream open = null;
        try {
            open = manager.open(unMembre.getImgM());
            Bitmap bitmap = BitmapFactory.decodeStream(open);
            img1.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  view;
    }

}

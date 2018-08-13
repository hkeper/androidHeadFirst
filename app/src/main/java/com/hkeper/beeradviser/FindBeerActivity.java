package com.hkeper.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    //Call when the user clicks the button
    public void onClickFindBeer(View view) {
        //Get link to TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Get link to Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Get variant chosen in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //Get recommendations from class BeerExpert
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for(String brand : brandsList){
            brandsFormatted.append(brand).append('\n');
        }
        //Set chosen variant
        brands.setText(brandsFormatted);
    }
}

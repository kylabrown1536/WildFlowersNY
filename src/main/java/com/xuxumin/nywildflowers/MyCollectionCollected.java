package com.xuxumin.nywildflowers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MyCollectionCollected extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageButton menu_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_collection_collected);

        toolbar = (Toolbar) findViewById(R.id.app_bar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        menu_icon = (ImageButton)findViewById(R.id.my_menu_icon);
        menu_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create the instance of popupMenu
                PopupMenu popup = new PopupMenu(MyCollectionCollected.this, menu_icon);
                //inflating the Popup using xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                //registering popup with OnMenuItemClickListener

                popup.show(); //showing popup menu
            }
        });
    }

    public void menuClickToMyCollection (MenuItem menuItem){
        Intent intentForMyCollection = new Intent(this, MyCollection.class);
        startActivity(intentForMyCollection);
    }

    /*
        11/14/20116 Xumin
        intent for the item in menu Search By Color
     */
    public void menuClickToSearchByColor (MenuItem menuItem){
        Intent intentForSearchByColor = new Intent(this, SearchByColor.class);
        startActivity(intentForSearchByColor);
    }

    /*
        11/14/20116 Xumin
        intent for the item in menu Flower Locator
     */
    public void menuClickToFlowerLocator (MenuItem menuItem){
        Intent intentForFlowerLocator = new Intent(this, FlowerLocator.class);
        startActivity(intentForFlowerLocator);
    }

    public void menuClickToHome (MenuItem menuItem){
        Intent intentForHomeNow = new Intent(this, MainActivity.class);
        startActivity(intentForHomeNow);
    }

    /*
        11/14/20116 Xumin
        intent for the item in menu Blooming Now
     */
    public void menuClickToBloomingNow (MenuItem menuItem){
        Intent intentForBloomingNow = new Intent(this, BloomingNow.class);
        startActivity(intentForBloomingNow);
    }

    public void myCollectionListClickToToadFlower (View view){
        Intent intentForCollectionToToadFlower = new Intent(this, ToadShadeInfoScreen.class);
        startActivity(intentForCollectionToToadFlower);
    }

    public void clickToMyCollection (View view){
        Intent intentForMyCollection = new Intent(this, MyCollection.class);
        startActivity(intentForMyCollection);
    }

    public void clickToCollectionList (View view){
        Intent intentForCollectionListt = new Intent(this, MyCollectionList.class);
        startActivity(intentForCollectionListt);
    }

    public void clickToCollectionUncollected (View view){
        Intent intentForCollectionUncollected = new Intent(this, MyCollectionUncollected.class);
        startActivity(intentForCollectionUncollected);
    }

    public void clickToCollectionTrails (View view){
        Intent intentForCollectionTrails = new Intent(this, MyCollectionTrails.class);
        startActivity(intentForCollectionTrails);
    }

}
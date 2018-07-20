package com.example.jerry.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//ListView类似效果布局
        initFruit();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);//实现ListView类似效果
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);//实现水平布局
        //瀑布式布局
        StaggeredGridLayoutManager layoutManager = new
                StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruit(){
        for (int i=0; i < 2; i++){
            /*
            fruitList.add(new Fruit("Apple", R.drawable.apple_pic));
            fruitList.add(new Fruit("Banana", R.drawable.banana_pic));
            fruitList.add(new Fruit("Orange", R.drawable.orange_pic));
            fruitList.add(new Fruit("Watermelon", R.drawable.watermelon_pic));
            fruitList.add(new Fruit("Pear", R.drawable.pear_pic));
            fruitList.add(new Fruit("Grape", R.drawable.grape_pic));
            fruitList.add(new Fruit("Pineapple", R.drawable.pineapple_pic));
            fruitList.add(new Fruit("Strawberry", R.drawable.strawberry_pic));
            fruitList.add(new Fruit("Cherry", R.drawable.cherry_pic));
            fruitList.add(new Fruit("Mango", R.drawable.mango_pic));
            */
            //瀑布式布局

            fruitList.add(new Fruit(getRandomLengthName("Apple"), R.drawable.apple_pic));
            fruitList.add(new Fruit(getRandomLengthName("Banana"), R.drawable.banana_pic));
            fruitList.add(new Fruit(getRandomLengthName("Orange"), R.drawable.orange_pic));
            fruitList.add(new Fruit(getRandomLengthName("Watermelon"), R.drawable.watermelon_pic));
            fruitList.add(new Fruit(getRandomLengthName("Pear"), R.drawable.pear_pic));
            fruitList.add(new Fruit(getRandomLengthName("Grape"), R.drawable.grape_pic));
            fruitList.add(new Fruit(getRandomLengthName("Pineapple"), R.drawable.pineapple_pic));
            fruitList.add(new Fruit(getRandomLengthName("Strawberry"), R.drawable.strawberry_pic));
            fruitList.add(new Fruit(getRandomLengthName("Cherry"), R.drawable.cherry_pic));
            fruitList.add(new Fruit(getRandomLengthName("Mango"), R.drawable.mango_pic));
        }
    }

    private String getRandomLengthName(String name){
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<length; i++){
            builder.append(name);
        }
        return builder.toString();
    }
}

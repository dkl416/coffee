package com.example.android;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    public int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayPrice(count);
    }
    public void addOrder(View view){
        count+=1;
        display(count);
        displayPrice(count);
    }
    public void reduceOrder(View view){
        if(count>0) count-=1;
        display(count);
        displayPrice(count);
    }
    public void resetOrder(View view){
        count=0;
        display(count);
        displayPrice(count);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int count){
        TextView price=(TextView) findViewById(
                R.id.price);
        price.setText("$"+count*5);

    }
}

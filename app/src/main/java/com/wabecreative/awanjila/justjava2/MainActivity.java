package com.wabecreative.awanjila.justjava2;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    /**quantity is a global variable **/
    int quantity=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the add button is clicked.
     */
    public void increment(View view){
        quantity=quantity+1;
        display(quantity);

    }
    /**
     * This method is called when the less button is clicked.
     */
    public void decrement(View view){
        quantity=quantity-1;
        display(quantity);
    }
    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {
        dispalyPrice(quantity*5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void dispalyPrice(int number){
        TextView priceTextView= (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}

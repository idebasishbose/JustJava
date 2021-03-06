package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView price;
  int quantity = 0;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    price = findViewById(R.id.price);
  }

  /**
   * This method is called when the order button is clicked.
   */
  public void submitOrder(View view) {
    //display(quantity);
    displayPrice(quantity * 5);
  }

  private void displayPrice(int quantity) {

    price.setText(""+quantity);
  }

  /**
   * This method displays the given quantity value on the screen.
   */
  private void display(int number) {
    TextView quantityTextView = findViewById(R.id.quantity_text_view);
    quantityTextView.setText("" + number);
  }

  public void increment(View view) {

    quantity += 1;
    display(quantity);
  }

  public void decrement(View view) {
    quantity -= 1;
    display(quantity);
  }
}

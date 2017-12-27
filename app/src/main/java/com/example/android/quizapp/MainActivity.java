package com.example.android.quizapp;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextCouncilPresident;
    private RadioGroup frGroup, czGroup, deGroup, itGroup, lvGroup, plGroup, uaGroup;
    private CheckBox box1, box2, box3;
    private int total = 0;
    private int submitCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editCustomerName);
        editTextCouncilPresident = findViewById(R.id.editNameOfCouncilPresident);

        box1 = findViewById(R.id.eu_charles_michel);
        box2 = findViewById(R.id.eu_donald_tusk_pr);
        box3 = findViewById(R.id.eu_antonio_tajani);

        frGroup = findViewById(R.id.frRadioGroup);
        czGroup = findViewById(R.id.czRadioGroup);
        deGroup = findViewById(R.id.deRadioGroup);
        itGroup = findViewById(R.id.itRadioGroup);
        lvGroup = findViewById(R.id.lvRadioGroup);
        plGroup = findViewById(R.id.plRadioGroup);
        uaGroup = findViewById(R.id.uaRadioGroup);
    }

    /**
     *
     *  Methods assigned to questions that change the background color
     *  and adding points if the answer was correct
     *
     */

    /**
     *  Question 1
     */
    private void councilMembersBox() {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;

        if (box1.isChecked() && box2.isChecked() && box3.isChecked()) {
            box1.setBackgroundColor(Color.GREEN);
            box2.setBackgroundColor(Color.GREEN);
            box3.setBackgroundColor(Color.RED);

            Toast toast = Toast.makeText(context, "Question 1/9: " +
                    "wrong answer, 0 points", duration);
            toast.show();
        } else if (box1.isChecked() && box2.isChecked()) {
            box1.setBackgroundColor(Color.GREEN);
            box2.setBackgroundColor(Color.GREEN);
            total += 1;
        } else if (box1.isChecked() && box3.isChecked()) {
            box1.setBackgroundColor(Color.GREEN);
            box3.setBackgroundColor(Color.RED);
        } else if (box2.isChecked() && box3.isChecked()) {
            box2.setBackgroundColor(Color.GREEN);
            box3.setBackgroundColor(Color.RED);
        } else if (box1.isChecked()) {
            box1.setBackgroundColor(Color.GREEN);
            Toast toast = Toast.makeText(context, "Question 1/9: " +
                    "it's only half the answer, 0 points", duration);
            toast.show();
        } else if (box2.isChecked()) {
            box2.setBackgroundColor(Color.GREEN);
            Toast toast = Toast.makeText(context, "Question 1/9: " +
                    "it's only half the answer, 0 points", duration);
            toast.show();
        } else if (box3.isChecked()) {
            box3.setBackgroundColor(Color.RED);
        }
    }

    /**
     *  Question 2
     */
    private void councilPresidentEditText() {
        String p1 = "Donald Franciszek Tusk";
        String p2 = "Donald Tusk";

        String presidentName = editTextCouncilPresident.getText().toString();
        if(presidentName!=null) {
            if (p1.equalsIgnoreCase(presidentName) || p2.equalsIgnoreCase(presidentName)) {
                editTextCouncilPresident.setBackgroundColor(Color.GREEN);
                total += 1;
            } else {
                editTextCouncilPresident.setBackgroundColor(Color.RED);
            }
        }
    }

    /**
     *  Question 3
     */
    private void frRadio() {
        RadioButton radio1 = findViewById(R.id.fr_kersti_kaljulaid);
        RadioButton radio2 = findViewById(R.id.fr_klaus_werner_iohannis);
        RadioButton radio3 = findViewById(R.id.fr_emmanuel_macron_pr);

        if (radio1.isChecked()) {
            radio1.setBackgroundColor(Color.RED);
        } else if (radio2.isChecked()) {
            radio2.setBackgroundColor(Color.RED);
        } else if (radio3.isChecked()) {
            radio3.setBackgroundColor(Color.GREEN);
            total += 1;
        }
    }

    /**
     *  Question 4
     */
    private void czRadio() {
        RadioButton radio1 = findViewById(R.id.cz_filip_vujanovic);
        RadioButton radio2 = findViewById(R.id.cz_milos_zeman_pr);
        RadioButton radio3 = findViewById(R.id.cz_kolinda_grabar_kitarovic);

        if (radio1.isChecked()) {
            radio1.setBackgroundColor(Color.RED);
        } else if (radio2.isChecked()) {
            radio2.setBackgroundColor(Color.GREEN);
            total += 1;
        } else if (radio3.isChecked()) {
            radio3.setBackgroundColor(Color.RED);
        }
    }

    /**
     *  Question 5
     */
    private void deRadio() {
        RadioButton radio1 = findViewById(R.id.de_angela_dorothea_merkel);
        RadioButton radio2 = findViewById(R.id.de_alexander_van_der_bellen);
        RadioButton radio3 = findViewById(R.id.de_frank_walter_steinmeier_pr);

        if (radio1.isChecked()) {
            radio1.setBackgroundColor(Color.RED);
        } else if (radio2.isChecked()) {
            radio2.setBackgroundColor(Color.RED);
        } else if (radio3.isChecked()) {
            radio3.setBackgroundColor(Color.GREEN);
            total += 1;
        }
    }

    /**
     *  Question 6
     */
    private void itRadio() {
        RadioButton radio1 = findViewById(R.id.it_sergio_mattarella_pr);
        RadioButton radio2 = findViewById(R.id.it_michael_daniel_higgins);
        RadioButton radio3 = findViewById(R.id.it_dalia_grybauskaite);

        if (radio1.isChecked()) {
            radio1.setBackgroundColor(Color.GREEN);
            total += 1;
        } else if (radio2.isChecked()) {
            radio2.setBackgroundColor(Color.RED);
        } else if (radio3.isChecked()) {
            radio3.setBackgroundColor(Color.RED);
        }
    }

    /**
     *  Question 7
     */
    private void lvRadio() {
        RadioButton radio1 = findViewById(R.id.lv_igor_dodon);
        RadioButton radio2 = findViewById(R.id.lv_hashim_thaci);
        RadioButton radio3 = findViewById(R.id.lv_raimonds_vejonis_pr);

        if (radio1.isChecked()) {
            radio1.setBackgroundColor(Color.RED);
        } else if (radio2.isChecked()) {
            radio2.setBackgroundColor(Color.RED);
        } else if (radio3.isChecked()) {
            radio3.setBackgroundColor(Color.GREEN);
            total += 1;
        }
    }

    /**
     *  Question 8
     */
    private void plRadio() {
        RadioButton radio1 = findViewById(R.id.pl_rumen_georgiew_radew);
        RadioButton radio2 = findViewById(R.id.pl_andrzej_sebastian_duda_pr);
        RadioButton radio3 = findViewById(R.id.pl_prokopis_pawlopulos);

        if (radio1.isChecked()) {
            radio1.setBackgroundColor(Color.RED);
        } else if (radio2.isChecked()) {
            radio2.setBackgroundColor(Color.GREEN);
            total += 1;
        } else if (radio3.isChecked()) {
            radio3.setBackgroundColor(Color.RED);
        }
    }

    /**
     *  Question 9
     */
    private void uaRadio() {
        RadioButton radio1 = findViewById(R.id.ua_ader_janos);
        RadioButton radio2 = findViewById(R.id.ua_backpetro_oleksijowycz_poroszenko_pr);
        RadioButton radio3 = findViewById(R.id.ua_backborut_pahor);

        if (radio1.isChecked()) {
            radio1.setBackgroundColor(Color.RED);
        } else if (radio2.isChecked()) {
            radio2.setBackgroundColor(Color.GREEN);
            total += 1;
        } else if (radio3.isChecked()) {
            radio3.setBackgroundColor(Color.RED);
        }
    }

    /**
     *  The method displays the result and the name
     */
    private void displayScore() {

        String name = editTextName.getText().toString();
        TextView showName = findViewById(R.id.scoreName);
        showName.setText(name + " correct answers was :");

        TextView score = findViewById(R.id.scorePoints);
        score.setText(String.valueOf(total) + " of 9");
    }

    /**
     * Method calling all checking methods
     */
    private void allMethods() {
        councilMembersBox();
        councilPresidentEditText();
        frRadio();
        czRadio();
        deRadio();
        itRadio();
        lvRadio();
        plRadio();
        uaRadio();
        displayScore();
    }

    /**
     * Submit button calling the checking methods, shows the result, the entered name
     * submitCounter allows to use the button only once
     */
    public void Submit(View view) {
        if (submitCounter == 0) {
            allMethods();

            Context context = getApplicationContext();
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, "Score: " + String.valueOf(total) + " of 9", duration);
            toast.show();

            submitCounter++;
        }
    }

    /**
     * Saves and restores data when changing the orientation of the screen
     *
     */
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        submitCounter = savedInstanceState.getInt("submitCounter");

        editTextName.setText(savedInstanceState.getString("CustomerName"));
        editTextCouncilPresident.setText(savedInstanceState.getString("CouncilPresident"));

        box1.setChecked(savedInstanceState.getBoolean("box1"));
        box2.setChecked(savedInstanceState.getBoolean("box2"));
        box3.setChecked(savedInstanceState.getBoolean("box3"));

        frGroup.check(savedInstanceState.getInt("FR"));
        czGroup.check(savedInstanceState.getInt("CZ"));
        deGroup.check(savedInstanceState.getInt("DE"));
        itGroup.check(savedInstanceState.getInt("IT"));
        lvGroup.check(savedInstanceState.getInt("LV"));
        plGroup.check(savedInstanceState.getInt("PL"));
        uaGroup.check(savedInstanceState.getInt("UA"));

        if (submitCounter != 0) {
            allMethods();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("submitCounter", submitCounter);

        outState.putString("CustomerName", editTextName.getText().toString());
        outState.putString("CouncilPresident", editTextCouncilPresident.getText().toString());

        outState.putBoolean("box1", box1.isChecked());
        outState.putBoolean("box2", box2.isChecked());
        outState.putBoolean("box3", box3.isChecked());

        outState.putInt("FR", frGroup.getCheckedRadioButtonId());
        outState.putInt("CZ", czGroup.getCheckedRadioButtonId());
        outState.putInt("DE", deGroup.getCheckedRadioButtonId());
        outState.putInt("IT", itGroup.getCheckedRadioButtonId());
        outState.putInt("LV", lvGroup.getCheckedRadioButtonId());
        outState.putInt("PL", plGroup.getCheckedRadioButtonId());
        outState.putInt("UA", uaGroup.getCheckedRadioButtonId());

        super.onSaveInstanceState(outState);
    }
}


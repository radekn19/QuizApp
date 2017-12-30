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
    private RadioButton frRadio1,frRadio2,frRadio3,czRadio1,czRadio2,czRadio3,
                        deRadio1,deRadio2,deRadio3,itRadio1,itRadio2,itRadio3,
                        lvRadio1,lvRadio2,lvRadio3,plRadio1,plRadio2,plRadio3,
                        uaRadio1,uaRadio2,uaRadio3;
    private int total = 0;
    private int submitCounter = 0;
    private int colorGreen;
    private int colorRed;
    private String question1Toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question1Toast = getResources().getString(R.string.question1Toast);
        colorGreen = ContextCompat.getColor(this, R.color.colorAnswerCorrect);
        colorRed = ContextCompat.getColor(this, R.color.colorAnswerWrong);

        /**
         *
         * ..........initializing the Views
         *
         */

        /**
         *  user name
         */
        editTextName = findViewById(R.id.editCustomerName);

        /**
         *  Question 1
         */
        box1 = findViewById(R.id.eu_charles_michel);
        box2 = findViewById(R.id.eu_donald_tusk_pr);
        box3 = findViewById(R.id.eu_antonio_tajani);

        /**
         *  Question 2
         */
        editTextCouncilPresident = findViewById(R.id.editNameOfCouncilPresident);

        /**
         *  Question 3
         */
        frGroup = findViewById(R.id.frRadioGroup);
        frRadio1 = findViewById(R.id.fr_kersti_kaljulaid);
        frRadio2 = findViewById(R.id.fr_klaus_werner_iohannis);
        frRadio3 = findViewById(R.id.fr_emmanuel_macron_pr);

        /**
         *  Question 4
         */
        czGroup = findViewById(R.id.czRadioGroup);
        czRadio1 = findViewById(R.id.cz_filip_vujanovic);
        czRadio2 = findViewById(R.id.cz_milos_zeman_pr);
        czRadio3 = findViewById(R.id.cz_kolinda_grabar_kitarovic);

        /**
         *  Question 5
         */
        deGroup = findViewById(R.id.deRadioGroup);
        deRadio1= findViewById(R.id.de_angela_dorothea_merkel);
        deRadio2= findViewById(R.id.de_alexander_van_der_bellen);
        deRadio3= findViewById(R.id.de_frank_walter_steinmeier_pr);

        /**
         *  Question 6
         */
        itGroup = findViewById(R.id.itRadioGroup);
        itRadio1= findViewById(R.id.it_sergio_mattarella_pr);
        itRadio2 = findViewById(R.id.it_michael_daniel_higgins);
        itRadio3 = findViewById(R.id.it_dalia_grybauskaite);

        /**
         *  Question 7
         */
        lvGroup = findViewById(R.id.lvRadioGroup);
        lvRadio1 = findViewById(R.id.lv_igor_dodon);
        lvRadio2 = findViewById(R.id.lv_hashim_thaci);
        lvRadio3 = findViewById(R.id.lv_raimonds_vejonis_pr);

        /**
         *  Question 8
         */
        plGroup = findViewById(R.id.plRadioGroup);
        plRadio1 = findViewById(R.id.pl_rumen_georgiew_radew);
        plRadio2 = findViewById(R.id.pl_andrzej_sebastian_duda_pr);
        plRadio3 = findViewById(R.id.pl_prokopis_pawlopulos);

        /**
         *  Question 9
         */
        uaGroup = findViewById(R.id.uaRadioGroup);
        uaRadio1 = findViewById(R.id.ua_ader_janos);
        uaRadio2 = findViewById(R.id.ua_backpetro_oleksijowycz_poroszenko_pr);
        uaRadio3 = findViewById(R.id.ua_backborut_pahor);
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
            box1.setBackgroundColor(colorGreen);
            box2.setBackgroundColor(colorGreen);
            box3.setBackgroundColor(colorRed);

            Toast toast = Toast.makeText(context, "Question 1/9: " +
                    "wrong answer, 0 points", duration);
            toast.show();
        } else if (box1.isChecked() && box2.isChecked()) {
            box1.setBackgroundColor(colorGreen);
            box2.setBackgroundColor(colorGreen);
            total += 1;
        } else if (box1.isChecked() && box3.isChecked()) {
            box1.setBackgroundColor(colorGreen);
            box3.setBackgroundColor(colorRed);
        } else if (box2.isChecked() && box3.isChecked()) {
            box2.setBackgroundColor(colorGreen);
            box3.setBackgroundColor(colorRed);
        } else if (box1.isChecked()) {
            box1.setBackgroundColor(colorGreen);
            Toast toast = Toast.makeText(context,question1Toast, duration);
            toast.show();
        } else if (box2.isChecked()) {
            box2.setBackgroundColor(colorGreen);
            Toast toast = Toast.makeText(context,question1Toast, duration);
            toast.show();
        } else if (box3.isChecked()) {
            box3.setBackgroundColor(colorRed);
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
                editTextCouncilPresident.setBackgroundColor(colorGreen);
                total += 1;
            } else {
                editTextCouncilPresident.setBackgroundColor(colorRed);
            }
        }
    }

    /**
     *  Question 3
     */
    private void frRadio() {
        if (frRadio1.isChecked()) {
            frRadio1.setBackgroundColor(colorRed);
        } else if (frRadio2.isChecked()) {
            frRadio2.setBackgroundColor(colorRed);
        } else if (frRadio3.isChecked()) {
            frRadio3.setBackgroundColor(colorGreen);
            total += 1;
        }
    }

    /**
     *  Question 4
     */
    private void czRadio() {
        if (czRadio1.isChecked()) {
            czRadio1.setBackgroundColor(colorRed);
        } else if (czRadio2.isChecked()) {
            czRadio2.setBackgroundColor(colorGreen);
            total += 1;
        } else if (czRadio3.isChecked()) {
            czRadio3.setBackgroundColor(colorRed);
        }
    }

    /**
     *  Question 5
     */
    private void deRadio() {
        if (deRadio1.isChecked()) {
            deRadio1.setBackgroundColor(colorRed);
        } else if (deRadio2.isChecked()) {
            deRadio2.setBackgroundColor(colorRed);
        } else if (deRadio3.isChecked()) {
            deRadio3.setBackgroundColor(colorGreen);
            total += 1;
        }
    }

    /**
     *  Question 6
     */
    private void itRadio() {
        if (itRadio1.isChecked()) {
            itRadio1.setBackgroundColor(colorGreen);
            total += 1;
        } else if (itRadio2.isChecked()) {
            itRadio2.setBackgroundColor(colorRed);
        } else if (itRadio3.isChecked()) {
            itRadio3.setBackgroundColor(colorRed);
        }
    }

    /**
     *  Question 7
     */
    private void lvRadio() {
        if (lvRadio1.isChecked()) {
            lvRadio1.setBackgroundColor(colorRed);
        } else if (lvRadio2.isChecked()) {
            lvRadio2.setBackgroundColor(colorRed);
        } else if (lvRadio3.isChecked()) {
            lvRadio3.setBackgroundColor(colorGreen);
            total += 1;
        }
    }

    /**
     *  Question 8
     */
    private void plRadio() {
        if (plRadio1.isChecked()) {
            plRadio1.setBackgroundColor(colorRed);
        } else if (plRadio2.isChecked()) {
            plRadio2.setBackgroundColor(colorGreen);
            total += 1;
        } else if (plRadio3.isChecked()) {
            plRadio3.setBackgroundColor(colorRed);
        }
    }

    /**
     *  Question 9
     */
    private void uaRadio() {
        if (uaRadio1.isChecked()) {
            uaRadio1.setBackgroundColor(colorRed);
        } else if (uaRadio2.isChecked()) {
            uaRadio2.setBackgroundColor(colorGreen);
            total += 1;
        } else if (uaRadio3.isChecked()) {
            uaRadio3.setBackgroundColor(colorRed);
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

    static final String STATE_SUBMIT_COUNTER = "submitCounter";
    static final String STATE_NAME = "userName";
    static final String STATE_COUNCIL_PRESIDENT = "CouncilPresident";
    static final String STATE_BOX1 = "checkBox1";
    static final String STATE_BOX2 = "checkBox2";
    static final String STATE_BOX3 = "checkBox3";
    static final String STATE_FR = "frGroupChoice";
    static final String STATE_CZ = "czGroupChoice";
    static final String STATE_DE = "deGroupChoice";
    static final String STATE_IT = "itGroupChoice";
    static final String STATE_LV = "lvGroupChoice";
    static final String STATE_PL = "plGroupChoice";
    static final String STATE_UA = "uaGroupChoice";

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        submitCounter = savedInstanceState.getInt(STATE_SUBMIT_COUNTER);

        editTextName.setText(savedInstanceState.getString(STATE_NAME));
        editTextCouncilPresident.setText(savedInstanceState.getString(STATE_COUNCIL_PRESIDENT));

        box1.setChecked(savedInstanceState.getBoolean(STATE_BOX1));
        box2.setChecked(savedInstanceState.getBoolean(STATE_BOX2));
        box3.setChecked(savedInstanceState.getBoolean(STATE_BOX3));

        frGroup.check(savedInstanceState.getInt(STATE_FR));
        czGroup.check(savedInstanceState.getInt(STATE_CZ));
        deGroup.check(savedInstanceState.getInt(STATE_DE));
        itGroup.check(savedInstanceState.getInt(STATE_IT));
        lvGroup.check(savedInstanceState.getInt(STATE_LV));
        plGroup.check(savedInstanceState.getInt(STATE_PL));
        uaGroup.check(savedInstanceState.getInt(STATE_UA));

        if (submitCounter != 0) {
            allMethods();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt(STATE_SUBMIT_COUNTER, submitCounter);

        outState.putString(STATE_NAME, editTextName.getText().toString());
        outState.putString(STATE_COUNCIL_PRESIDENT, editTextCouncilPresident.getText().toString());

        outState.putBoolean(STATE_BOX1, box1.isChecked());
        outState.putBoolean(STATE_BOX2, box2.isChecked());
        outState.putBoolean(STATE_BOX3, box3.isChecked());

        outState.putInt(STATE_FR, frGroup.getCheckedRadioButtonId());
        outState.putInt(STATE_CZ, czGroup.getCheckedRadioButtonId());
        outState.putInt(STATE_DE, deGroup.getCheckedRadioButtonId());
        outState.putInt(STATE_IT, itGroup.getCheckedRadioButtonId());
        outState.putInt(STATE_LV, lvGroup.getCheckedRadioButtonId());
        outState.putInt(STATE_PL, plGroup.getCheckedRadioButtonId());
        outState.putInt(STATE_UA, uaGroup.getCheckedRadioButtonId());

        super.onSaveInstanceState(outState);
    }
}


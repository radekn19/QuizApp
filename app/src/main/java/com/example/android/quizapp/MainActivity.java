package com.example.android.quizapp;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int total=0;
    private int submitCounter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void councilMembersBox(){
        CheckBox box1=findViewById(R.id.eu_charles_michel);
        CheckBox box2=findViewById(R.id.eu_donald_tusk_pr);
        CheckBox box3=findViewById(R.id.eu_antonio_tajani);

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;

        if(box1.isChecked()&&box2.isChecked()&&box3.isChecked()){
            box1.setBackgroundColor(Color.GREEN);
            box2.setBackgroundColor(Color.GREEN);
            box3.setBackgroundColor(Color.RED);

            Toast toast = Toast.makeText(context, "Question 1/9: " +
                    "wrong answer, 0 points", duration);
            toast.show();
        }
        else if(box1.isChecked()&&box2.isChecked()){
            box1.setBackgroundColor(Color.GREEN);
            box2.setBackgroundColor(Color.GREEN);
            total+=1;
        }
        else if(box1.isChecked()&&box3.isChecked()){
            box1.setBackgroundColor(Color.GREEN);
            box3.setBackgroundColor(Color.RED);
        }
        else if(box2.isChecked()&&box3.isChecked()){
            box2.setBackgroundColor(Color.GREEN);
            box3.setBackgroundColor(Color.RED);
        }

        else if(box1.isChecked()){
            box1.setBackgroundColor(Color.GREEN);
            Toast toast = Toast.makeText(context, "Question 1/9: " +
                    "it's only half the answer, 0 points", duration);
            toast.show();
        }
        else if(box2.isChecked()){
            box2.setBackgroundColor(Color.GREEN);
            Toast toast = Toast.makeText(context, "Question 1/9: " +
                    "it's only half the answer, 0 points", duration);
            toast.show();
        }
        else if(box3.isChecked()){
            box3.setBackgroundColor(Color.RED);
        }
    }

    private void councilPresidentEditText(){
        String p1="Donald Franciszek Tusk";
        String p2="Donald Tusk";
        EditText name=findViewById(R.id.editNameOfCouncilPresident);
        String presidentName=name.getText().toString();

        if(p1.equalsIgnoreCase(presidentName)||p2.equalsIgnoreCase(presidentName)){
            name.setBackgroundColor(Color.GREEN);
            total+=1;
        }
        else {
            name.setBackgroundColor(Color.RED);

        }

    }

    private void frRadio(){
        RadioButton radio1=findViewById(R.id.fr_kersti_kaljulaid);
        RadioButton radio2=findViewById(R.id.fr_klaus_werner_iohannis);
        RadioButton radio3=findViewById(R.id.fr_emmanuel_macron_pr);

        if(radio1.isChecked()){
            radio1.setBackgroundColor(Color.RED);
        }
        else if (radio2.isChecked()){
            radio2.setBackgroundColor(Color.RED);
        }
        else if(radio3.isChecked()){
            radio3.setBackgroundColor(Color.GREEN);
            total+=1;
        }
    }

    private void czRadio(){
        RadioButton radio1=findViewById(R.id.cz_filip_vujanovic);
        RadioButton radio2=findViewById(R.id.cz_milos_zeman_pr);
        RadioButton radio3=findViewById(R.id.cz_kolinda_grabar_kitarovic);

        if(radio1.isChecked()){
            radio1.setBackgroundColor(Color.RED);
        }
        else if (radio2.isChecked()){
            radio2.setBackgroundColor(Color.GREEN);
            total+=1;
        }
        else if(radio3.isChecked()){
            radio3.setBackgroundColor(Color.RED);
        }
    }

    private void deRadio(){
        RadioButton radio1=findViewById(R.id.de_angela_dorothea_merkel);
        RadioButton radio2=findViewById(R.id.de_alexander_van_der_bellen);
        RadioButton radio3=findViewById(R.id.de_frank_walter_steinmeier_pr);

        if(radio1.isChecked()){
            radio1.setBackgroundColor(Color.RED);
        }
        else if (radio2.isChecked()){
            radio2.setBackgroundColor(Color.RED);
        }
        else if(radio3.isChecked()){
            radio3.setBackgroundColor(Color.GREEN);
            total+=1;
        }
    }

    private void itRadio(){
        RadioButton radio1=findViewById(R.id.it_sergio_mattarella_pr);
        RadioButton radio2=findViewById(R.id.it_michael_daniel_higgins);
        RadioButton radio3=findViewById(R.id.it_dalia_grybauskaite);

        if(radio1.isChecked()){
            radio1.setBackgroundColor(Color.GREEN);
            total+=1;
        }
        else if (radio2.isChecked()){
            radio2.setBackgroundColor(Color.RED);
        }
        else if(radio3.isChecked()){
            radio3.setBackgroundColor(Color.RED);
        }
    }

    private void lvRadio(){
        RadioButton radio1=findViewById(R.id.lv_igor_dodon);
        RadioButton radio2=findViewById(R.id.lv_hashim_thaci);
        RadioButton radio3=findViewById(R.id.lv_raimonds_vejonis_pr);

        if(radio1.isChecked()){
            radio1.setBackgroundColor(Color.RED);
        }
        else if (radio2.isChecked()){
            radio2.setBackgroundColor(Color.RED);
        }
        else if(radio3.isChecked()){
            radio3.setBackgroundColor(Color.GREEN);
            total+=1;
        }
    }

    private void plRadio(){
        RadioButton radio1=findViewById(R.id.pl_rumen_georgiew_radew);
        RadioButton radio2=findViewById(R.id.pl_andrzej_sebastian_duda_pr);
        RadioButton radio3=findViewById(R.id.pl_prokopis_pawlopulos);

        if(radio1.isChecked()){
            radio1.setBackgroundColor(Color.RED);
        }
        else if (radio2.isChecked()){
            radio2.setBackgroundColor(Color.GREEN);
            total+=1;
        }
        else if(radio3.isChecked()){
            radio3.setBackgroundColor(Color.RED);
        }
    }

    private void uaRadio(){
        RadioButton radio1=findViewById(R.id.ua_ader_janos);
        RadioButton radio2=findViewById(R.id.ua_backpetro_oleksijowycz_poroszenko_pr);
        RadioButton radio3=findViewById(R.id.ua_backborut_pahor);

        if(radio1.isChecked()){
            radio1.setBackgroundColor(Color.RED);
        }
        else if (radio2.isChecked()){
            radio2.setBackgroundColor(Color.GREEN);
            total+=1;
        }
        else if(radio3.isChecked()){
            radio3.setBackgroundColor(Color.RED);
        }
    }

    private void displayScore(){

        EditText rName=findViewById(R.id.editName);
        String name=rName.getText().toString();
        TextView showName=findViewById(R.id.scoreName);
        showName.setText(name+" correct answers was :");

        TextView score=findViewById(R.id.scorePoints);
        score.setText(String.valueOf(total)+" of 7");
    }

    public void Submit(View view){

        if(submitCounter==0){
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
            submitCounter ++;
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,"Score: "+String.valueOf(total)+" of 7", duration);
        toast.show();
    }
}

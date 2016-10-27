package com.example.hana.rentcostumes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by user pc on 26/10/2016.
 */

public class RegisterActivity extends Activity {
    private EditText inputFirstName, inputLastName, inputEmail, inputUsername, inputPassword;
    private Spinner inputGender, inputCountry;
    private Button btnRegister, btnLinkToLicenseAgreement;
    String list_gender [] = {"Gender", "Male", "Female"};
    String list_country [] = {"Country", "Singapore", "Malaysia", "Brunei Darussalam", "Indonesia", "Thailand", "Vietnam", "Timor Leste"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setupView();
        /**getActionBar().setTitle("Sign Up");
        getActionBar().setDisplayShowTitleEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);**/

        /**inputCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list_country);
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputCountry.setAdapter(arrayAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });**/
    }
    private void setupView(){
        inputFirstName = (EditText) findViewById(R.id.firstname);
        inputLastName = (EditText) findViewById(R.id.lastname);
        inputEmail = (EditText) findViewById(R.id.email);
        inputUsername = (EditText) findViewById(R.id.username);
        inputPassword = (EditText) findViewById(R.id.password);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnLinkToLicenseAgreement = (Button) findViewById(R.id.btnLinkToLicenseAgreement);
        inputGender = (Spinner) findViewById(R.id.gender);
        inputCountry = (Spinner) findViewById(R.id.country);
    }

}

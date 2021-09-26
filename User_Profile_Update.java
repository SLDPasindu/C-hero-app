package com.example.user_p;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.auth.User;

import java.util.HashMap;

public class UserProfileEdit extends AppCompatActivity {

    EditText email, usern, pass;
    String userId;
    DatabaseReference dbf;
    FirebaseUser user;
    User loggedUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.profileEmail);
        usern = findViewById(R.id.Profile_user);
        pass = findViewById(R.id.Profile_pass);

        user = FirebaseAuth.getInstance().getCurrentUser();
        Log.e("login", user.getUid());
        userId = user.getUid();



        dbf = FirebaseDatabase.getInstance().getReference().child("Users").child(userId);


        dbf.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.hasChildren()) {

                    email.setText(snapshot.child("email").getValue().toString());
                    usern.setText(snapshot.child("Username").getValue().toString());
                    pass.setText(snapshot.child("Password").getValue().toString());


                } else {
                    Toast.makeText(getApplicationContext(), "Failed", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void updateUserProfile(View view) {
        dbf = FirebaseDatabase.getInstance().getReference().child("Users");

        String passwordUpdate = pass.getText().toString();
        String usernameUpdate = usern.getText().toString().trim();
        String emailUpdate = email.getText().toString().trim();
        HashMap hashMap = new HashMap();
        hashMap.put("Password",passwordUpdate);
        hashMap.put("Username",usernameUpdate);
        hashMap.put("email",emailUpdate);




        dbf.child(userId).updateChildren(hashMap).addOnSuccessListener(new OnSuccessListener() {
            @Override
            public void onSuccess(Object o) {
                //Updating the user email in the authentication
                user.updateEmail(emailUpdate)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Log.d("AuthEmail Updated", "User email address updated.");
                                }
                            }
                        });
                Toast.makeText(getApplicationContext(), "Profile Updated", Toast.LENGTH_LONG).show();

            }
        });
    }
}

//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Button;
//
//public class AboutAA extends AppCompatActivity{
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_activity_about);
//
//        Button button=(Button)findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("text/html");
//                intent.putExtra(Intent.EXTRA_SUBJECT, "Manipuri Bible Blog");
//                intent.putExtra(Intent.EXTRA_TEXT, "Write title of your story, your full name, bible verse and your story. Send your story to sandipsinghakhaidem@gmail.com");
//
//                startActivity(Intent.createChooser(intent, "Send Email"));
//            }
//        });
//    }
//}

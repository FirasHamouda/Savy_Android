package com.example.savy_android.ui.fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import com.example.savy_android.ui.activites.Greeting
import com.example.savy_android.R


class AuthentificationFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_authentification, container, false)
        return inflater.inflate(R.layout.fragment_authentification, container, false).apply {
            findViewById<ComposeView>(R.id.ComposeView).setContent {
              //  Text(text = "Hello world.")
                GridingUi ()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GridingUi (){
        Column {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Yellow), color = MaterialTheme.colorScheme.background
            ) {
                //Greeting("Firas")
            }
        }
    }
}
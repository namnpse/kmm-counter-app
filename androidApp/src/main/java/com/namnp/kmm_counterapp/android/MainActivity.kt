package com.namnp.kmm_counterapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.namnp.kmm_counterapp.App

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                App()
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        App()
    }
}

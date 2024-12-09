package tw.edu.pu.s1120332s1120332

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import tw.edu.pu.s1120332s1120332.ui.theme.S1120332Theme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S1120332Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
                    Start(m = Modifier.padding(innerPadding))




                }
            }
        }
    }
}

@Composable
fun Start(m:Modifier){




}



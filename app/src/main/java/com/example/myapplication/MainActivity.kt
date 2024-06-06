    package com.example.myapplication

    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.compose.foundation.layout.padding
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.Image
    import androidx.compose.foundation.layout.Row
    import androidx.compose.ui.res.painterResource
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.height
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.text.style.TextAlign
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp


    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                MsgCard(Msg("Jetpack Compose tutorial", 
                        "Jetpack Compose is a" +
                        "modern toolkit for building native Android UI. Compose simplifies" +
                        "and accelerates UI development on Android with less code, powerful tools" +
                        ", and intuitive Kotlin APIs","In this tutorial, you build a simple UI component with declarative functions. " +
                        "You call Compose functions to say what elements you want and the Compose compiler " +
                        "does the rest. Compose is built around Composable functions. These functions let " +
                        "you define your app's UI programmatically because they let you describe how it " +
                        "should look and provide data dependencies, rather than focus on the process of " +
                        "the UI's construction, such as initializing an element and then attaching it to " +
                        "a parent. To create a Composable function, you add the @Composable annotation " +
                        "to the function name."))

            }
        }
    }



    data class Msg(val a: String, val b: String, val c: String)

    @Composable
    fun MsgCard(msg: Msg) {
        Row() {
             //Upper Image
            Image(
                painter = painterResource(R.drawable.WallPaper),
                contentDescription = "Upper Design",
            )

        }

  

        //Text of Column
        Column() {
            Spacer(modifier = Modifier.height(130.dp))
            Text(text = msg.a, fontSize = 24.sp, modifier = Modifier.padding(all = 20.dp))
            Text(text = msg.b, textAlign = TextAlign.Justify, modifier = Modifier.padding(20.dp,0.dp,20.dp,0.dp))
            Text(text = msg.c, textAlign = TextAlign.Justify, modifier = Modifier.padding(all = 20.dp))

        }
    }




x
    @Preview
    @Composable
    fun PreviewMsgCard() {
        MsgCard (
            msg = Msg("Iphone", "UwU", "User")
        )
    }

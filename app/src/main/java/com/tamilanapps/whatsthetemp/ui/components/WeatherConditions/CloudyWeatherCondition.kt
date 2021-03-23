

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tamilanapps.whatsthetemp.utils.*

/* Composable function which is used for displaying weather overview if weather is cloudy*/
@Composable
fun DisplayCloudyWeatherOverview (){

    //Painter objects
    var imagePainter: Painter? = null
    var microInteractionPainter: Painter? = null

    //Animation objects
    val infiniteTransition = rememberInfiniteTransition()
    var positionState1: State<Float>? = null
    var positionState2: State<Float>? = null



    //Assigning values for painters
    //Assigning value for painter
    if(notDay()) {
        imagePainter =  painterResource(id = CLOUDY_SKY_NIGHT)
    }
    else{
        imagePainter = painterResource(id = CLOUDY_SKY_DAY)
    }
    microInteractionPainter = painterResource(id = CLOUDY_MICROINTERACTION)

    //Assigning values for position state
    positionState1 = infiniteTransition.animateFloat(
        initialValue =  0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            tween(
                durationMillis =  12000,
                easing = LinearEasing
            )
        )
    )

    positionState2 = infiniteTransition.animateFloat(
        initialValue =  0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            tween(
                durationMillis =  8000,
                easing = LinearEasing
            ),
        )
    )

    Column( modifier = Modifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        BoxWithConstraints(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        ) {


            //Image Modifiers
            val image1Modifier: Modifier = Modifier.offset(
                x = maxWidth * positionState1.value
            )

            val image2Modifier: Modifier = Modifier.offset(
                x = maxWidth * positionState2.value
            )

            //MicroInteraction Image 1
            Image(
                painter = microInteractionPainter,
                contentDescription = null,
                modifier = image1Modifier
                    .width(50.dp)
                    .fillMaxHeight(),
                alignment = Alignment.BottomStart
            )

            //Weather condition Image
            Image(
                alignment = Alignment.Center,
                painter = imagePainter,
                contentDescription = null,
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth(),
            )

            //MicroInteraction Image 2
            Image(
                painter = microInteractionPainter,
                contentDescription = null,
                modifier = image2Modifier
                    .width(100.dp)
                    .fillMaxHeight(),
                alignment = Alignment.BottomStart
            )

        }




    }



}

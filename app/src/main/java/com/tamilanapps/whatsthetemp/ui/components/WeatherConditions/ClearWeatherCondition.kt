

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

/* Composable function which is used for displaying weather overview if weather is clear */
@Composable
fun DisplayClearWeatherOverview (){

    //Painter objects
    var imagePainter: Painter? = null
    var microInteractionPainter: Painter? = null
    var microInteractionPainter1: Painter? = null

    //Animation objects
    val infiniteTransition = rememberInfiniteTransition()




    //Assigning value for painter
    if(notDay())  imagePainter =  painterResource(id = CLOUDY_SKY_NIGHT) else imagePainter = painterResource(id = CLOUDY_SKY_DAY)

    Column( modifier = Modifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        BoxWithConstraints(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        ) {

            //Weather condition Image
            Image(
                alignment = Alignment.Center,
                painter = imagePainter!!,
                contentDescription = null,
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth(),
            )

        }




    }



}

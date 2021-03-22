package com.tamilanapps.whatsthetemp.ui.components
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tamilanapps.whatsthetemp.utils.LOCATION_ICON

@Composable
fun DisplayLocationIndicator(){

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        //Location icon
         Image(
             painter = painterResource(id = LOCATION_ICON),
             contentDescription = "location icon",
             modifier = Modifier
                 .height(25.dp)
         )
        //Location text
        Text(
            text = "Omalur,TamiNadu,India",
            style = MaterialTheme.typography.h3,
        )
    }
}
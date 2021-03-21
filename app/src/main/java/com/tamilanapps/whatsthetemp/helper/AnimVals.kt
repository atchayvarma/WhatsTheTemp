package com.tamilanapps.whatsthetemp.helper

import android.annotation.SuppressLint
import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

/* MicroInteraction means for eg: the extra clouds, thunders, rains */

object AnimVals {


@Composable
fun infiniteTransition(): InfiniteTransition = rememberInfiniteTransition()

//Position states for microinteraction anim
@Composable
fun positionState1() = infiniteTransition().animateFloat(
    initialValue =  0f,
    targetValue = 1f,
    animationSpec = infiniteRepeatable(
        tween(
            durationMillis =  12000,
            easing = LinearEasing
        )
    )
)

@Composable
fun positionState2() = infiniteTransition().animateFloat(
    initialValue =  0f,
    targetValue = 1f,
    animationSpec = infiniteRepeatable(
        tween(
            durationMillis =  8000,
            easing = LinearEasing
        ),
    )
)


//Anim modifier for microinteraction image 1
@Composable
@SuppressLint("ModifierFactoryExtensionFunction", "ComposableModifierFactory", "ComposableNaming")
fun CLOUDY_MICROINTERACTION_MODIFIER1(theMaxWidth: Dp):Modifier = Modifier.offset(
    x = theMaxWidth * positionState1().value
)

//Anim modifier for microinteraction image 1
@Composable
@SuppressLint("ModifierFactoryExtensionFunction", "ComposableModifierFactory", "ComposableNaming")
fun CLOUDY_MICROINTERACTION_MODIFIER2(theMaxWidth: Dp):Modifier = Modifier.offset(
    x = theMaxWidth * positionState2().value
)

}
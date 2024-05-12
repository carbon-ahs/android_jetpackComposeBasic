package com.axiagroups.jetpackcomposebasic.sharedTransitionPakage

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


/**
 * Created by Ahsan Habib on 5/12/2024.
 * shehanuk.ahsan@gmail.com
 */
@Composable
fun animationSecondScreen(
    resId: Int,
    modifier: Modifier = Modifier
) {
    Column {
        Spacer(modifier = Modifier.height(30.dp))
        Image(
            painter = painterResource(id = resId),
            contentDescription = null
        )
    }

}
package com.axiagroups.jetpackcomposebasic.sharedTransitionPakage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.axiagroups.jetpackcomposebasic.R


/**
 * Created by Ahsan Habib on 5/12/2024.
 * shehanuk.ahsan@gmail.com
 */

@Composable
fun animationFirstScreen(
    modifier: Modifier = Modifier,
    onItemClick: (Int) -> Unit
) {
    val drawable = R.drawable.walton_hi_tech_industries_limited_logo
    Image(
        painter = painterResource(id = drawable),
        contentDescription = null,
        modifier = Modifier
            .clickable { onItemClick(drawable) }
    )
}
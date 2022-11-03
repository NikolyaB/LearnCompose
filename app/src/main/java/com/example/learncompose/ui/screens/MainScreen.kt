package com.example.learncompose.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost

@Preview
@Composable
fun MainScreen() {
    LazyColumn(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .wrapContentSize(Alignment.Center)) {
            item { BottomBar() }
    }
}


@Composable
fun BottomBar() {

}

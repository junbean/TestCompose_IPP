package com.example.testcompose_ipp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.testcompose_ipp.ui.theme.TestCompose_IPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val todoViewModel = ViewModelProvider(this)[TodoViewModel::class.java]
        setContent {
            TestCompose_IPPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TodoListPage(todoViewModel)
                }
            }
        }
    }
}


/*
column을 사용하면 항목을 화면의 수직으로 배치
    verticalAlignment 세로상에서 정렬 방식
        -Alignment.CenterVertically : 중앙에 배치
        -Alignment.Bottom : 아래에 배치
        -Alignment.Top : 위에 배치
    horizontalArrangement 가로상에서 정렬 방식
        -Arrangement.Start : 왼쪽
        -Arrangement.End : 오른쪽
        -Arrangement.Center : 중앙
        -Arrangement.SpaceEvenly : 똑같은 길이로 띄워진다
*/
/*
속성 용어 정리
modifier = Modifier.fillMaxWidth() : 넓이를 최대로 지정
modifier = Modifier.fillMaxWidth().fillMaxHeight() : 넓이 높이를 최대로 지정
modifier = Modifier.fillMaxSize() : 넓이 높이를 최대로 지정

*/
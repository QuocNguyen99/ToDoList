package presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ListItem
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
class HomePage : Screen {
    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { HomeViewModel() }
        val scope = rememberCoroutineScope()
        val stateSheet = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)

        Scaffold(topBar = { Row { Text("Home") } },
            floatingActionButton = {
                FloatingActionButton(onClick = {
                    scope.launch {
                        stateSheet.show()
                    }
                }) {
                    Icon(Icons.Filled.Add, "Floating action button.")
                }
            }) {
            ModalBottomSheetLayout(
                sheetState = stateSheet,
                sheetContent = {
                    InputTextLayout()
                }
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                }
            }
        }
    }
}

@Composable
fun InputTextLayout() {
    Column(modifier = Modifier.fillMaxWidth()) {
        TextField(value = "jhasgdjhasgdsjah", onValueChange = {})

        Row {
            Icon(imageVector = Icons.Default.Favorite, contentDescription = null)
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.AutoMirrored.Filled.Send, contentDescription = null)
            }
        }
    }
}

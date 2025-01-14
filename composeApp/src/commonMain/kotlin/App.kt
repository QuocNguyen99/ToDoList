import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.home.HomePage

@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigator(HomePage())
    }
}

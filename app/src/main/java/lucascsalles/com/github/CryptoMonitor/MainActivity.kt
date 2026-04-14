package lucascsalles.com.github.CryptoMonitor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import lucascsalles.com.github.CryptoMonitor.model.Ticker
import lucascsalles.com.github.CryptoMonitor.model.TickerResponse
import lucascsalles.com.github.CryptoMonitor.ui.theme.CryptoMonitorTheme
import lucascsalles.com.github.CryptoMonitor.ui.theme.screens.CryptoContent
import lucascsalles.com.github.CryptoMonitor.ui.theme.screens.CryptoMonitorScreen
import lucascsalles.com.github.CryptoMonitor.ui.theme.screens.ErrorContent
import lucascsalles.com.github.CryptoMonitor.ui.theme.screens.InfoItem
import lucascsalles.com.github.CryptoMonitor.ui.theme.screens.InitialContent
import lucascsalles.com.github.CryptoMonitor.viewmodel.CryptoViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: CryptoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptoMonitorTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    CryptoMonitorScreen(viewModel = viewModel)
                }
            }
        }
    }
}

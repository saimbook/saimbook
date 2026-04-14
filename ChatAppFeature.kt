import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.LiveData

class ChatViewModel : ViewModel() {
    private val _messages = MutableLiveData<List<String>>()
    val messages: LiveData<List<String>> get() = _messages

    init {
        _messages.value = emptyList()
    }

    fun sendMessage(message: String) {
        val currentMessages = _messages.value ?: emptyList()
        _messages.value = currentMessages + message
    }
}

class LlmChatModelHelper {
    fun generateResponse(message: String): String {
        // Implement the logic to generate responses using an LLM
        return "Response to: $message"
    }
}

// Sample usage in UI: 
// val viewModel = ViewModelProvider(this).get(ChatViewModel::class.java)
// viewModel.sendMessage("Hello!")
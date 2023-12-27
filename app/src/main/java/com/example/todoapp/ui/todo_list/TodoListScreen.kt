package com.example.todoapp.ui.todo_list

import androidx.compose.runtime.Composable
import com.example.todoapp.util.UiEvent

@Composable
fun TodoListScreen(
    onNavigate: (UiEvent.Navigate) -> Unit,
    viewModel: TodoListViewModel = hiltViewModel()
){

}
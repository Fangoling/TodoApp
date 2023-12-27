package com.example.todoapp.ui.todo_list

import androidx.lifecycle.ViewModel
import com.example.todoapp.data.TodoRepository
import com.example.todoapp.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
   private val repository: TodoRepository
): ViewModel(){

    val todos = repository.getTodos() // is a Flow -> can be collected as state

    // mutable one time Event
    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    fun onEvent(event: TodoListEvent) {
        when(event) {
            is TodoListEvent.OnTodoClick -> {

            }
            is TodoListEvent.OnAddTodoClick -> {

            }
            is TodoListEvent.OnDeleteTodoClick -> {

            }
            is TodoListEvent.OnDoneChange -> {

            }
            else -> {}
        }
    }

}
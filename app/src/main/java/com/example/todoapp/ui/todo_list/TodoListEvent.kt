package com.example.todoapp.ui.todo_list

import com.example.todoapp.data.Todo

sealed class TodoListEvent {
    data class DeleteTodo(val todo: Todo): TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()
    object OnDeleteTodoClick: TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()

}
package com.assignment.jakewharton.ui.main
import com.assignment.jakewharton.model.Event

sealed class EventResponse {

    object Loading: EventResponse()
    data class Success(val result: List<Event>): EventResponse()
    data class Error(val message: String): EventResponse()
}
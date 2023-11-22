package com.example.cleanarchitecturenoteapp.feature_note.presentation.notes

import com.example.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.example.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder

sealed interface NoteEvent {
    data class Order(val noteOrder: NoteOrder): NoteEvent
    data class Delete(val note: Note): NoteEvent
    object RestoreNote: NoteEvent
    object ToggleOrderSection: NoteEvent
}
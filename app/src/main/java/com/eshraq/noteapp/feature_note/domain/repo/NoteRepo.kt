package com.eshraq.noteapp.feature_note.domain.repo

import com.eshraq.noteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepo {

    fun getNote():Flow<List<Note>>

    suspend fun getNoteById(id:Int) : Note?

    suspend fun deleteNote(note: Note)

    suspend fun insertNote(note: Note)

}
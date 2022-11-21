package com.eshraq.noteapp.feature_note.data.repo

import com.eshraq.noteapp.feature_note.data.data_source.NoteDao
import com.eshraq.noteapp.feature_note.domain.model.Note
import com.eshraq.noteapp.feature_note.domain.repo.NoteRepo
import kotlinx.coroutines.flow.Flow

class NoteRepoImpl(
    private val dao:NoteDao
) : NoteRepo {
    override fun getNote(): Flow<List<Note>> {
     return  dao.getNote()

    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }
}
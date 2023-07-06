package com.sliderzxc.blend.data.cloud

import com.sliderzxc.blend.data.entities.Note

interface NotesDataSource {

    suspend fun addNote(note: Note): Boolean

    suspend fun getNote(id: Int): Note

    suspend fun editNote(id: Int): Note

    suspend fun deleteNote(id: Int): Boolean
}
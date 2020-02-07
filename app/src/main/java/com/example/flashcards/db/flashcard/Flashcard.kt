package com.example.flashcards.db.flashcard

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import com.example.flashcards.db.directory.Directory

@Entity(
    foreignKeys = [ForeignKey(
        entity = Directory::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("directory_id"),
        onDelete = CASCADE
    )],
    tableName = "flashcard_table"
)
class Flashcard(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "flashcard_title") val title: String,
    @ColumnInfo(name = "flashcard_description") val description: String?,
    @ColumnInfo(name = "creation_date") val creation_date: String?,
    @ColumnInfo(name = "modification_date") val last_modified: String?,
    @ColumnInfo(name = "directory_id") val directory_id: Int?
)

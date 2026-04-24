package com.fundoonotes.service;

import com.fundoonotes.dto.NoteDTO;
import com.fundoonotes.entity.Note;
import com.fundoonotes.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public Note createNote(NoteDTO dto) {
        Note note = new Note();
        note.setTitle(dto.getTitle());
        note.setDescription(dto.getDescription());
        note.setPinned(false);
        note.setArchived(false);
        note.setTrashed(false);
        return noteRepository.save(note);
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note getNoteById(Long id) {
        return noteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Note not found"));
    }

    public Note togglePin(Long id) {
        Note note = getNoteById(id);
        note.setPinned(!note.isPinned());
        return noteRepository.save(note);
    }

    public Note toggleArchive(Long id) {
        Note note = getNoteById(id);
        note.setArchived(!note.isArchived());
        return noteRepository.save(note);
    }

    public Note toggleTrash(Long id) {
        Note note = getNoteById(id);
        note.setTrashed(!note.isTrashed());
        return noteRepository.save(note);
    }
}

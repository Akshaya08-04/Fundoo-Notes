package com.fundoonotes.service;

import com.fundoonotes.dto.NoteDTO;
import com.fundoonotes.entity.Note;
import com.fundoonotes.repository.NoteRepository;
import org.springframework.stereotype.Service;

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
}

package com.fundoonotes.controller;

import com.fundoonotes.dto.NoteDTO;
import com.fundoonotes.entity.Note;
import com.fundoonotes.service.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public Note createNote(@RequestBody NoteDTO dto) {
        return noteService.createNote(dto);
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return noteService.getNoteById(id);
    }

    @PatchMapping("/{id}/pin")
    public Note togglePin(@PathVariable Long id) {
        return noteService.togglePin(id);
    }

    @PatchMapping("/{id}/archive")
    public Note toggleArchive(@PathVariable Long id) {
        return noteService.toggleArchive(id);
    }

    @PatchMapping("/{id}/trash")
    public Note toggleTrash(@PathVariable Long id) {
        return noteService.toggleTrash(id);
    }
}

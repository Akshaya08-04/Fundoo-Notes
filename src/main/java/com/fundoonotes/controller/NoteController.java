package com.fundoonotes.controller;

import com.fundoonotes.dto.NoteDTO;
import com.fundoonotes.entity.Note;
import com.fundoonotes.service.NoteService;
import org.springframework.web.bind.annotation.*;

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
}

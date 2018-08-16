package com.classpath.notes.controller;


import com.classpath.notes.exception.ResourceNotFoundException;
import com.classpath.notes.model.Notes;
import com.classpath.notes.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NotesController {

   // @Autowired
    NoteRepository noteRepository;

    @GetMapping("/notes")
    public String getAllNotes() {
        return "Hello World!!";
    }
}
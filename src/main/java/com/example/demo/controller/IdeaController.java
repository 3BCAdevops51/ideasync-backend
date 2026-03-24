package com.example.demo.controller;

import com.example.demo.model.Idea;
import com.example.demo.model.Status;
import com.example.demo.repository.IdeaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ideas")
@CrossOrigin(origins = "*")
public class IdeaController {

    private final IdeaRepository repository;
//sonar check comment
    //sonar check
    // ✅ Constructor Injection (BEST PRACTICE)
    public IdeaController(IdeaRepository repository) {
        this.repository = repository;
    }

    // CREATE
    @PostMapping
    public Idea createIdea(@RequestBody Idea idea) {
        idea.setStatus(Status.NEW);
        return repository.save(idea);
    }

    // READ
    @GetMapping
    public List<Idea> getAllIdeas() {
        return repository.findAll();
    }

    // UPDATE (Accept / Reject)
    @PutMapping("/{id}/status")
    public Idea updateStatus(
            @PathVariable Long id,
            @RequestParam Status status
    ) {
        Idea idea = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Idea not found"));

        idea.setStatus(status);
        return repository.save(idea);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIdea(@PathVariable Long id) {

        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
//pr command
//sonar check
package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;


    @GetMapping
    public ResponseEntity<List<movie>> getAllMovies(){
        return new ResponseEntity<List<movie>>(movieService.allMovies(),HttpStatus.OK);



    }

    @GetMapping("/{imdbId}")

    public ResponseEntity<Optional<movie>> getSingleMovie(@PathVariable String imdbId){


        return new ResponseEntity<Optional<movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);


    }
}


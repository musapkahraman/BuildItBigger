package com.udacity.gradle.builditbigger.backend;

import com.example.joker.Jokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
        name = "jokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class JokesEndpoint {
    @ApiMethod(name = "getJoke")
    public Joke getJoke() {
        Joke joke = new Joke();
        joke.setJoke(Jokes.getJoke());
        return joke;
    }
}
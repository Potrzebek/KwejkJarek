package pl.akademiakodu.data;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.Gif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif(true, "android-explosion", "mikalos", 1),
            new Gif(false, "ben-and-mike", "mike",2),
            new Gif(true, "book-dominos", "ola",3),
            new Gif(false, "compiler-bot", "bot",2),
            new Gif(true, "cowboy-coder", "coder",1),
            new Gif(true, "infinite-andrew", "andrew",3)

    );

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
            return ALL_GIFS;
    }

    public List<Gif> getFavorites() {

        List<Gif> Favorites = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if (gif.isFavorite()) {
                Favorites.add(gif);
            }
        }
        return Favorites;
    }

}


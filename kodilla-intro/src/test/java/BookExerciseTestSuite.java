import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookExerciseTestSuite {

    @Test
    void shouldCreateBookExercise() {
        BookExercise book = BookExercise.of("Mickiewicz", "Ogniem i mieczem");
        assertNotNull(book);
        assertEquals("Mickiewicz", book.getAutor());
        assertEquals("Ogniem i mieczem", book.getTytuł());
    }

}
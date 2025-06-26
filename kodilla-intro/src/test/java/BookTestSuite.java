import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTestSuite {

    @Test
    void shouldCreateBook() {
        Book book = Book.of("1984", "George Orwell");
        assertNotNull(book);
    }
}
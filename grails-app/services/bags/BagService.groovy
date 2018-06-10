package bags

import grails.transaction.Transactional

@Transactional
class BagService {
    void init() {
        Author author = new Author(name: 'Hunter S. Thompson')
        author.save()

        Book book = new Book(title: 'Fear and Loathing in Las Vegas')
        book.save()

        AuthorBook authorBook = new AuthorBook(author: author, book: book)
        authorBook.save()
    }

    void followup() {
        Author author = Author.get(1)
        Book book = new Book(title: "Hell's Angels: A Strange and Terrible Saga")
        book.save()

        AuthorBook authorBook = new AuthorBook(author: author, book: book)
        authorBook.save()
    }

    void deleteAuthor(){
        Author author = Author.get(1)
        author.delete()
    }

    void deleteBook(){
        Book book = Book.get(1)
        book.delete()
    }

    /**
     * seems links have to be cleaned up manually, but a db migration might fix that.
     */
    void listLinks(){
        println AuthorBook.list()
    }
}
